package view;

import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JPanel;

import model.IndividualForm;

/**
 * The FormPanel class is a JPanel that visualizes a Form.
 * 
 * @author (Jessie) Nan Jiang
 * @author Weirong Tian
 * @version April 19, 2014
 */

@SuppressWarnings("serial")
public class FormPanel extends JPanel {

	/**
	 * The default height of the panel.
	 */
	public static final int DEFAULT_PANEL_HEIGHT = 200;

	/**
	 * The default width of the panel .
	 */
	public static final int DEFAULT_PANEL_WIDTH = 550;

	IndividualForm iform;

	/**
	 * Create the panel based on the given graph.
	 */
	public FormPanel(IndividualForm iform) {
		this.iform = iform;
	}

	/**
	 * Get the graph associated with this panel.
	 * 
	 * @return The graph for this panel.
	 */
	public IndividualForm getForm() {
		return iform;
	}

	/**
	 * Set the graph for this panel.
	 * 
	 * @param graph
	 *            The new graph for this panel.
	 */
	public void setForm(IndividualForm iform) {
		this.iform = iform;
	}

	/**
	 * Paint the graph on the given Graphics object.
	 * 
	 * @param g
	 *            The Graphics object to draw on.
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			iform.draw(g, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
