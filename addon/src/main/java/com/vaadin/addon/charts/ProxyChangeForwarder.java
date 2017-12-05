package com.vaadin.addon.charts;

import com.vaadin.addon.charts.events.AbstractSeriesEvent;
import com.vaadin.addon.charts.events.AxisRescaledEvent;
import com.vaadin.addon.charts.events.ConfigurationChangeListener;
import com.vaadin.addon.charts.events.DataAddedEvent;
import com.vaadin.addon.charts.events.DataRemovedEvent;
import com.vaadin.addon.charts.events.DataUpdatedEvent;
import com.vaadin.addon.charts.events.ItemSlicedEvent;
import com.vaadin.addon.charts.events.SeriesChangedEvent;
import com.vaadin.addon.charts.events.SeriesStateEvent;
import com.vaadin.addon.charts.model.AbstractConfigurationObject;
import com.vaadin.addon.charts.util.ChartSerialization;
import elemental.json.impl.JreJsonFactory;

import static com.vaadin.addon.charts.model.AxisDimension.X_AXIS;
import static com.vaadin.addon.charts.model.AxisDimension.Y_AXIS;

class ProxyChangeForwarder implements ConfigurationChangeListener {

    private final Chart chart;
    private final JreJsonFactory jsonFactory;

    ProxyChangeForwarder(Chart chart, JreJsonFactory jsonFactory) {
        this.chart = chart;
        this.jsonFactory = jsonFactory;
    }

    @Override
    public void dataAdded(DataAddedEvent event) {
        if (event.getItem() != null) {
            chart.getElement().callFunction("__callSeriesFunction",
                    "addPoint", getSeriesIndex(event),
                    jsonFactory.parse(
                            ChartSerialization.toJSON(event.getItem())),
                    true, event.isShift());
        }
    }

    @Override
    public void dataRemoved(DataRemovedEvent event) {
        chart.getElement().callFunction("__callPointFunction", "remove",
                getSeriesIndex(event), event.getIndex());
    }

    @Override
    public void dataUpdated(DataUpdatedEvent event) {
        if (event.getValue() != null) {
            chart.getElement().callFunction("__callPointFunction", "update",
                    getSeriesIndex(event), event.getPointIndex(),
                    event.getValue().doubleValue());
        } else {
            chart.getElement().callFunction("__callPointFunction", "update",
                    getSeriesIndex(event), event.getPointIndex(),
                    jsonFactory.parse(
                            ChartSerialization.toJSON(event.getItem())));
        }
    }

    @Override
    public void seriesStateChanged(SeriesStateEvent event) {
        if (event.isEnabled()) {
            chart.getElement().callFunction("__callSeriesFunction", "show",
                    getSeriesIndex(event));
        } else {
            chart.getElement().callFunction("__callSeriesFunction", "hide",
                    getSeriesIndex(event));
        }
    }

    @Override
    public void axisRescaled(AxisRescaledEvent event) {
        chart.getElement().callFunction("__callAxisFunction", "setExtremes",
                event.getAxis(), event.getAxisIndex(),
                event.getMinimum().doubleValue(),
                event.getMaximum().doubleValue(), event.isRedrawingNeeded(),
                event.isAnimated());
    }

    @Override
    public void itemSliced(ItemSlicedEvent event) {
        chart.getElement().callFunction("__callPointFunction", "slice",
                getSeriesIndex(event), event.getIndex(), event.isSliced(),
                event.isRedraw(), event.isAnimation());
    }

    @Override
    public void seriesChanged(SeriesChangedEvent event) {
        chart.getElement().callFunction("__callSeriesFunction", "update",
                getSeriesIndex(event),
                jsonFactory.parse(ChartSerialization.toJSON(
                        (AbstractConfigurationObject) event.getSeries())));
    }

    @Override
    public void resetZoom(boolean redraw, boolean animate) {
        for (int i = 0; i < chart.getConfiguration()
                .getNumberOfxAxes(); i++) {
            chart.getElement().callFunction("__callAxisFunction",
                    "setExtremes", X_AXIS.getIndex(), i, null, null, redraw,
                    animate);
        }
        for (int i = 0; i < chart.getConfiguration()
                .getNumberOfyAxes(); i++) {
            chart.getElement().callFunction("__callAxisFunction",
                    "setExtremes", Y_AXIS.getIndex(), i, null, null, redraw,
                    animate);
        }
    }

    private int getSeriesIndex(AbstractSeriesEvent event) {
        return chart.getConfiguration().getSeries()
                .indexOf(event.getSeries());
    }

}