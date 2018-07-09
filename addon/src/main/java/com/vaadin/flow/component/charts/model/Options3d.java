package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Options to render charts in 3 dimensions. This feature requires
 * `highcharts-3d.js`, found in the download package or online at
 * [code.highcharts.com/highcharts-3d.js](http://code.highcharts.com/highcharts-
 * 3d.js).
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Options3d extends AbstractConfigurationObject {

	public static final String AXIS_LABEL_POSITION_AUTO = "auto";
	private Number alpha;
	private String axisLabelPosition;
	private Number beta;
	private Number depth;
	private Boolean enabled;
	private Boolean fitToPlot;
	private Frame frame;
	private Number viewDistance;

	public Options3d() {
	}

	public Options3d(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setAlpha(Number)
	 */
	public Number getAlpha() {
		return alpha;
	}

	/**
	 * One of the two rotation angles for the chart.
	 */
	public void setAlpha(Number alpha) {
		this.alpha = alpha;
	}

	/**
	 * @see #setAxisLabelPosition(String)
	 */
	public String getAxisLabelPosition() {
		return axisLabelPosition;
	}

	/**
	 * Set it to `"auto"` to automatically move the labels to the best edge.
	 */
	public void setAxisLabelPosition(String axisLabelPosition) {
		this.axisLabelPosition = axisLabelPosition;
	}

	/**
	 * @see #setBeta(Number)
	 */
	public Number getBeta() {
		return beta;
	}

	/**
	 * One of the two rotation angles for the chart.
	 */
	public void setBeta(Number beta) {
		this.beta = beta;
	}

	/**
	 * @see #setDepth(Number)
	 */
	public Number getDepth() {
		return depth;
	}

	/**
	 * The total depth of the chart.
	 */
	public void setDepth(Number depth) {
		this.depth = depth;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Wether to render the chart using the 3D functionality.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setFitToPlot(Boolean)
	 */
	public Boolean getFitToPlot() {
		return fitToPlot;
	}

	/**
	 * Whether the 3d box should automatically adjust to the chart plot area.
	 */
	public void setFitToPlot(Boolean fitToPlot) {
		this.fitToPlot = fitToPlot;
	}

	/**
	 * @see #setFrame(Frame)
	 */
	public Frame getFrame() {
		if (frame == null) {
			frame = new Frame();
		}
		return frame;
	}

	/**
	 * Provides the option to draw a frame around the charts by defining a
	 * bottom, front and back panel.
	 */
	public void setFrame(Frame frame) {
		this.frame = frame;
	}

	/**
	 * @see #setViewDistance(Number)
	 */
	public Number getViewDistance() {
		return viewDistance;
	}

	/**
	 * Defines the distance the viewer is standing in front of the chart, this
	 * setting is important to calculate the perspective effect in column and
	 * scatter charts. It is not used for 3D pie charts.
	 */
	public void setViewDistance(Number viewDistance) {
		this.viewDistance = viewDistance;
	}
}
