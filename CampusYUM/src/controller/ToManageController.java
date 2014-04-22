package controller;

/**
 * The ToManageOrderController class handles the switch to manage order form use case.
 * 
 * @author (Jessie) Nan Jiang
 * @author Weirong Tian
 * @version April 19, 2014
 */

import model.*;
import view.MainForm;
import view.WelcomeForm;

/**
 * The ToManageOrderController class handles the change form type to manage
 * order use case.
 * 
 * @author (Jessie) Nan Jiang
 * @author Weirong Tian
 * @version April 19, 2014
 */
public class ToManageController {

	Model model;

	/**
	 * Create a controller for the given model.
	 * 
	 * @param model
	 *            The model for this controller.
	 */
	public ToManageController(Model model) {
		this.model = model;
	}

	/**
	 * Act on the given form by changing the form type to manage order.
	 * 
	 * @param wform
	 *            The WelcomeForm to act on.
	 * @return True if the action was successful.
	 */
	public boolean act(WelcomeForm wform) {
		// close the welcome form
		wform.setVisible(false);
		// create a new main form
		MainForm mform = new MainForm();
		// set visible
		mform.setVisible(true);
		return true;
	}
}
