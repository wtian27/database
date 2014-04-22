package iface;


import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JPanel;

import model.SingleOrder;

/**
 * The IForm interface defines common functions for a form.
 * 
 * @author (Jessie) Nan Jiang
 * @author Weirong Tian
 * @version April 19, 2014
 */

public interface IForm {
	/**
	 * Register the order with form.
	 * 
	 * @param so
	 *            The order to register.
	 */
	void setSingleOrder(SingleOrder so);
	
	/**
	 * Draw a visualization of this graph on the given Graphics object.
	 * 
	 * @param g
	 *            The Graphics object to draw on.
	 * @param panel
	 *            The panel used to display the graphics.
	 */
	void draw(Graphics g, JPanel panel) throws IOException;

}
