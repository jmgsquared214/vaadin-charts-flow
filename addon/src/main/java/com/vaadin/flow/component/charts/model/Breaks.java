package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import java.time.Instant;
import com.vaadin.flow.component.charts.util.Util;

/**
 * An array defining breaks in the axis, the sections defined will be left out
 * and all the points shifted closer to each other.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Breaks extends AbstractConfigurationObject {

	private Number breakSize;
	private Number from;
	private Number repeat;
	private Number to;

	public Breaks() {
	}

	/**
	 * @see #setBreakSize(Number)
	 */
	public Number getBreakSize() {
		return breakSize;
	}

	/**
	 * A number indicating how much space should be left between the start and
	 * the end of the break. The break size is given in axis units, so for
	 * instance on a `datetime` axis, a break size of 3600000 would indicate the
	 * equivalent of an hour.
	 */
	public void setBreakSize(Number breakSize) {
		this.breakSize = breakSize;
	}

	/**
	 * @see #setFrom(Number)
	 */
	public Number getFrom() {
		return from;
	}

	/**
	 * The point where the break starts.
	 */
	public void setFrom(Number from) {
		this.from = from;
	}

	/**
	 * @see #setRepeat(Number)
	 */
	public Number getRepeat() {
		return repeat;
	}

	/**
	 * Defines an interval after which the break appears again. By default the
	 * breaks do not repeat.
	 */
	public void setRepeat(Number repeat) {
		this.repeat = repeat;
	}

	/**
	 * @see #setTo(Number)
	 */
	public Number getTo() {
		return to;
	}

	/**
	 * The point where the break ends.
	 */
	public void setTo(Number to) {
		this.to = to;
	}

	/**
	 * @see #setFrom(Number)
	 */
	public void setFrom(Instant instant) {
		this.from = Util.toHighchartsTS(instant);
	}

	/**
	 * @see #setTo(Number)
	 */
	public void setTo(Instant instant) {
		this.to = Util.toHighchartsTS(instant);
	}
}
