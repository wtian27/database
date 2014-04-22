package controller;

import model.*;
import view.OrderForm;
import view.WelcomeForm;

/**
 * The ToOrderController class handles the switch to order form use case.
 * 
 * @author (Jessie) Nan Jiang
 * @author Weirong Tian
 * @version April 19, 2014
 */

public class ToOrderController {

	Model model;

	/**
	 * Create a controller for the given model.
	 * 
	 * @param model
	 *            The model for this controller.
	 */
	public ToOrderController(Model model) {
		this.model = model;
	}

	/**
	 * Act on the given form by changing the form type to order form.
	 * 
	 * @param wform
	 *            The WelcomeForm to act on.
	 * @return True if the action was successful.
	 */
	public boolean act(WelcomeForm wform) {
		// close the welcome form
		wform.setVisible(false);
		// create a new order form
		OrderForm oform = new OrderForm();
		// set visible
		oform.setVisible(true);
		return true;
	}
}
