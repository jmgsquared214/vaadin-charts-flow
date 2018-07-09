package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Smoothed line options.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class SmoothedLine extends AbstractConfigurationObject {

	private Styles styles;

	public SmoothedLine() {
	}

	/**
	 * @see #setStyles(Styles)
	 */
	public Styles getStyles() {
		if (styles == null) {
			styles = new Styles();
		}
		return styles;
	}

	/**
	 * Styles for a smoothed line.
	 */
	public void setStyles(Styles styles) {
		this.styles = styles;
	}
}
