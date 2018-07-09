package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import java.util.ArrayList;

/**
 * Contains two arrays of axes that are controlled by control line of the axis.
 * This feature requires the `drag-panes.js` module.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class ControlledAxis extends AbstractConfigurationObject {

	private ArrayList<String> next;
	private ArrayList<String> prev;

	public ControlledAxis() {
	}

	/**
	 * @see #setNext(ArrayList)
	 */
	public ArrayList<String> getNext() {
		if (next == null) {
			next = new ArrayList<String>();
		}
		return next;
	}

	/**
	 * Array of axes that should move out of the way of resizing being done for
	 * the current axis. If not set, the next axis will be used. This feature
	 * requires the `drag-panes.js` module.
	 */
	public void setNext(ArrayList<String> next) {
		this.next = next;
	}

	/**
	 * @see #setPrev(ArrayList)
	 */
	public ArrayList<String> getPrev() {
		if (prev == null) {
			prev = new ArrayList<String>();
		}
		return prev;
	}

	/**
	 * Array of axes that should move with the current axis while resizing. This
	 * feature requires the `drag-panes.js` module.
	 */
	public void setPrev(ArrayList<String> prev) {
		this.prev = prev;
	}
}
