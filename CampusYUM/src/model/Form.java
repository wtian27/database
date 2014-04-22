package model;

import iface.IForm;

import java.awt.*;
import java.io.IOException;
import javax.swing.JPanel;

/**
 * The abstract Form class stores common information about a type of visual
 * Form. This includes how to draw the graph, and the
 * data set this graph models.
 * 
 * @author (Jessie) Nan Jiang
 * @author Weirong Tian
 * @version April 19, 2014
 */

public abstract class Form implements IForm {
	/**
	 * The amount of padding used in a form.
	 */
	static final int PADDING = 25;

	/**
	 * The color of the axes (and labels) in the form.
	 */
	static final Color Boundry_COLOR = new Color(0, 0, 0);


	SingleOrder so;/*

	/**
	 * Create a form.
	 */
	public Form() {
		this.so = null;
	}

	/**
	 * Register the order with form.
	 * 
	 * @param so
	 *            The order to register.
	 */
	@Override
	public void setSingleOrder(SingleOrder so) {
		this.so = so;
	}
	
	/**
	 * Get the order for this form.
	 * 
	 * @return The order for this form.
	 */
	public SingleOrder getSingleOrder() {
		return so;
	}

	/**
	 * Draw the boundry lines on the given Graphics object.
	 * 
	 * @param g
	 *            The Graphics object to draw on.
	 * @param width
	 *            The width of the panel.
	 * @param height
	 *            The height of the panel.
	 */
	protected void drawBoundry(Graphics g, int width, int height) {
		g.setColor(Form.Boundry_COLOR);

		// bottom boundary
		g.drawLine(Form.PADDING, height - Form.PADDING,
				width - Form.PADDING, height - Form.PADDING);
		// top boundary
		g.drawLine(Form.PADDING, Form.PADDING,
				width - Form.PADDING, Form.PADDING);

		// left boundary
		g.drawLine(Form.PADDING, Form.PADDING, Form.PADDING, height
				- Form.PADDING);
		// right boundary
		g.drawLine(width - Form.PADDING, Form.PADDING, width - Form.PADDING, height
				- Form.PADDING);
			
	}


	/**
	 * Draw a visualization of this form on the given Graphics object.
	 * 
	 * @param g
	 *            The Graphics object to draw on.
	 * @param panel
	 *            The panel used to display the graphics.
	 */
	@Override
	abstract public void draw(Graphics g, JPanel panel) throws IOException;

}
