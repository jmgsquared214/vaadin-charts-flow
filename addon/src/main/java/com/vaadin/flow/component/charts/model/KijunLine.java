package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * The styles for Kijun line
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class KijunLine extends AbstractConfigurationObject {

	private Styles styles;

	public KijunLine() {
	}

	public Styles getStyles() {
		if (styles == null) {
			styles = new Styles();
		}
		return styles;
	}

	public void setStyles(Styles styles) {
		this.styles = styles;
	}
}
