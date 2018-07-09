package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * A configuration object for the tooltip rendering of each single series.
 * Properties are inherited from [tooltip](#tooltip), but only the following
 * properties can be defined on a series level.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class SeriesTooltip extends AbstractConfigurationObject {

	private String _fn_formatter;
	private String _fn_pointFormatter;
	private String _fn_positioner;
	private Number changeDecimals;
	private DateTimeLabelFormats dateTimeLabelFormats;
	private Boolean followPointer;
	private Boolean followTouchMove;
	private String footerFormat;
	private String headerFormat;
	private Number hideDelay;
	private Number padding;
	private String pointFormat;
	private Boolean split;
	private Number valueDecimals;
	private String valuePrefix;
	private String valueSuffix;
	private String xDateFormat;

	public SeriesTooltip() {
	}

	/**
	 * @see #set_fn_formatter(String)
	 */
	public String getFormatter() {
		return _fn_formatter;
	}

	/**
	 * Callback function to format the text of the tooltip from scratch. Return
	 * `false` to disable tooltip for a specific point on series. A subset of
	 * HTML is supported. Unless `useHTML` is true, the HTML of the tooltip is
	 * parsed and converted to SVG, therefore this isn't a complete HTML
	 * renderer. The following tags are supported: `<b>`, `<strong>`, `<i>`, `
	 * <em>`,
	`<br/>`, `<span>`. Spans can be styled with a `style` attribute,
	but only text-related CSS that is shared with SVG is handled.
	Since version 2.1 the tooltip can be shared between multiple series
	through the `shared` option. The available data in the formatter
	differ a bit depending on whether the tooltip is shared or not. In
	a shared tooltip, all properties except `x`, which is common for
	all points, are kept in an array, `this.points`.
	Available data are:
	<dl>
	<dt>this.percentage (not shared) / this.points[i].percentage (shared)</dt>
	<dd>Stacked series and pies only. The point's percentage of the total.
	</dd>
	<dt>this.point (not shared) / this.points[i].point (shared)</dt>
	<dd>The point object. The point name, if defined, is available through
	`this.point.name`.</dd>
	<dt>this.points</dt>
	<dd>In a shared tooltip, this is an array containing all other properties
	for each point.</dd>
	<dt>this.series (not shared) / this.points[i].series (shared)</dt>
	<dd>The series object. The series name is available through
	`this.series.name`.</dd>
	<dt>this.total (not shared) / this.points[i].total (shared)</dt>
	<dd>Stacked series only. The total value at this point's x value.
	</dd>
	<dt>this.x</dt>
	<dd>The x value. This property is the same regardless of the tooltip
	being shared or not.</dd>
	<dt>this.y (not shared) / this.points[i].y (shared)</dt>
	<dd>The y value.</dd>
	</dl>
	 */
	public void setFormatter(String _fn_formatter) {
		this._fn_formatter = _fn_formatter;
	}

	/**
	 * @see #set_fn_pointFormatter(String)
	 */
	public String getPointFormatter() {
		return _fn_pointFormatter;
	}

	/**
	 * A callback function for formatting the HTML output for a single point in
	 * the tooltip. Like the `pointFormat` string, but with more flexibility.
	 */
	public void setPointFormatter(String _fn_pointFormatter) {
		this._fn_pointFormatter = _fn_pointFormatter;
	}

	/**
	 * @see #set_fn_positioner(String)
	 */
	public String getPositioner() {
		return _fn_positioner;
	}

	/**
	 * A callback function to place the tooltip in a default position. The
	 * callback receives three parameters: `labelWidth`, `labelHeight` and
	 * `point`, where point contains values for `plotX` and `plotY` telling
	 * where the reference point is in the plot area. Add `chart.plotLeft` and
	 * `chart.plotTop` to get the full coordinates. The return should be an
	 * object containing x and y values, for example `{ x: 100, y: 100 }`.
	 */
	public void setPositioner(String _fn_positioner) {
		this._fn_positioner = _fn_positioner;
	}

	/**
	 * @see #setChangeDecimals(Number)
	 */
	public Number getChangeDecimals() {
		return changeDecimals;
	}

	/**
	 * How many decimals to show for the `point.change` value when the
	 * `series.compare` option is set. This is overridable in each series'
	 * tooltip options object. The default is to preserve all decimals.
	 */
	public void setChangeDecimals(Number changeDecimals) {
		this.changeDecimals = changeDecimals;
	}

	/**
	 * @see #setDateTimeLabelFormats(DateTimeLabelFormats)
	 */
	public DateTimeLabelFormats getDateTimeLabelFormats() {
		if (dateTimeLabelFormats == null) {
			dateTimeLabelFormats = new DateTimeLabelFormats();
		}
		return dateTimeLabelFormats;
	}

	/**
	 * For series on a datetime axes, the date format in the tooltip's header
	 * will by default be guessed based on the closest data points. This member
	 * gives the default string representations used for each unit. For an
	 * overview of the replacement codes, see
	 * [dateFormat](#Highcharts.dateFormat). Defaults to:
	 * 
	 * <pre>
	 * {
	 * 	    millisecond:"%A, %b %e, %H:%M:%S.%L",
	 * 	    second:"%A, %b %e, %H:%M:%S",
	 * 	    minute:"%A, %b %e, %H:%M",
	 * 	    hour:"%A, %b %e, %H:%M",
	 * 	    day:"%A, %b %e, %Y",
	 * 	    week:"Week from %A, %b %e, %Y",
	 * 	    month:"%B %Y",
	 * 	    year:"%Y"
	 * 	}
	 * </pre>
	 */
	public void setDateTimeLabelFormats(
			DateTimeLabelFormats dateTimeLabelFormats) {
		this.dateTimeLabelFormats = dateTimeLabelFormats;
	}

	/**
	 * @see #setFollowPointer(Boolean)
	 */
	public Boolean getFollowPointer() {
		return followPointer;
	}

	/**
	 * Whether the tooltip should follow the mouse as it moves across columns,
	 * pie slices and other point types with an extent. By default it behaves
	 * this way for scatter, bubble and pie series by override in the
	 * `plotOptions` for those series types. For touch moves to behave the same
	 * way, [followTouchMove]( #tooltip.followTouchMove) must be `true` also.
	 */
	public void setFollowPointer(Boolean followPointer) {
		this.followPointer = followPointer;
	}

	/**
	 * @see #setFollowTouchMove(Boolean)
	 */
	public Boolean getFollowTouchMove() {
		return followTouchMove;
	}

	/**
	 * Whether the tooltip should follow the finger as it moves on a touch
	 * device. If this is `true` and [chart.panning](#chart.panning) is
	 * set,`followTouchMove` will take over one-finger touches, so the user
	 * needs to use two fingers for zooming and panning.
	 */
	public void setFollowTouchMove(Boolean followTouchMove) {
		this.followTouchMove = followTouchMove;
	}

	/**
	 * @see #setFooterFormat(String)
	 */
	public String getFooterFormat() {
		return footerFormat;
	}

	/**
	 * A string to append to the tooltip format.
	 */
	public void setFooterFormat(String footerFormat) {
		this.footerFormat = footerFormat;
	}

	/**
	 * @see #setHeaderFormat(String)
	 */
	public String getHeaderFormat() {
		return headerFormat;
	}

	/**
	 * The HTML of the tooltip header line. Variables are enclosed by curly
	 * brackets. Available variables are `point.key`, `series.name`,
	 * `series.color` and other members from the `point` and `series` objects.
	 * The `point.key` variable contains the category name, x value or datetime
	 * string depending on the type of axis. For datetime axes, the `point.key`
	 * date format can be set using tooltip.xDateFormat.
	 */
	public void setHeaderFormat(String headerFormat) {
		this.headerFormat = headerFormat;
	}

	/**
	 * @see #setHideDelay(Number)
	 */
	public Number getHideDelay() {
		return hideDelay;
	}

	/**
	 * The number of milliseconds to wait until the tooltip is hidden when mouse
	 * out from a point or chart.
	 */
	public void setHideDelay(Number hideDelay) {
		this.hideDelay = hideDelay;
	}

	/**
	 * @see #setPadding(Number)
	 */
	public Number getPadding() {
		return padding;
	}

	/**
	 * Padding inside the tooltip, in pixels.
	 */
	public void setPadding(Number padding) {
		this.padding = padding;
	}

	/**
	 * @see #setPointFormat(String)
	 */
	public String getPointFormat() {
		return pointFormat;
	}

	/**
	 * The HTML of the point's line in the tooltip. Variables are enclosed by
	 * curly brackets. Available variables are point.x, point.y, series. name
	 * and series.color and other properties on the same form. Furthermore,
	 * point.y can be extended by the `tooltip.valuePrefix` and
	 * `tooltip.valueSuffix` variables. This can also be overridden for each
	 * series, which makes it a good hook for displaying units. In styled mode,
	 * the dot is colored by a class name rather than the point color.
	 */
	public void setPointFormat(String pointFormat) {
		this.pointFormat = pointFormat;
	}

	/**
	 * @see #setSplit(Boolean)
	 */
	public Boolean getSplit() {
		return split;
	}

	/**
	 * Split the tooltip into one label per series, with the header close to the
	 * axis. This is recommended over [shared](#tooltip.shared) tooltips for
	 * charts with multiple line series, generally making them easier to read.
	 * This option takes precedence over `tooltip.shared`.
	 */
	public void setSplit(Boolean split) {
		this.split = split;
	}

	/**
	 * @see #setValueDecimals(Number)
	 */
	public Number getValueDecimals() {
		return valueDecimals;
	}

	/**
	 * How many decimals to show in each series' y value. This is overridable in
	 * each series' tooltip options object. The default is to preserve all
	 * decimals.
	 */
	public void setValueDecimals(Number valueDecimals) {
		this.valueDecimals = valueDecimals;
	}

	/**
	 * @see #setValuePrefix(String)
	 */
	public String getValuePrefix() {
		return valuePrefix;
	}

	/**
	 * A string to prepend to each series' y value. Overridable in each series'
	 * tooltip options object.
	 */
	public void setValuePrefix(String valuePrefix) {
		this.valuePrefix = valuePrefix;
	}

	/**
	 * @see #setValueSuffix(String)
	 */
	public String getValueSuffix() {
		return valueSuffix;
	}

	/**
	 * A string to append to each series' y value. Overridable in each series'
	 * tooltip options object.
	 */
	public void setValueSuffix(String valueSuffix) {
		this.valueSuffix = valueSuffix;
	}

	/**
	 * @see #setXDateFormat(String)
	 */
	public String getXDateFormat() {
		return xDateFormat;
	}

	/**
	 * The format for the date in the tooltip header if the X axis is a datetime
	 * axis. The default is a best guess based on the smallest distance between
	 * points in the chart.
	 */
	public void setXDateFormat(String xDateFormat) {
		this.xDateFormat = xDateFormat;
	}
}
