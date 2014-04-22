package controller;

/**
 * The ClearSingleOrderController class handles the clear Order use case.
 * 
 * @author (Jessie) Nan Jiang
 * @author Weirong Tian
 * @version April 19, 2014
 */

import javax.swing.JTextField;


import model.Model;
import view.OrderForm;

public class ClearSingleOrderController {
	Model model;

	/**
	 * Create a controller for the given model.
	 * 
	 * @param model
	 *            The model for this controller.
	 */
	public ClearSingleOrderController(Model model) {
		this.model = model;
	}

	/**
	 * Act on the given form by clearing the order information.
	 * 
	 * @param oform
	 *            The OrderForm to act on.
	 * @return True if the action was successful.
	 */
	public boolean act(OrderForm oform) { 
			// get each value
			
		JTextField idInput = oform.gettextField_id();
			JTextField LastNameInput = oform.gettextField_LastName();
			JTextField ChesPizza_SM = oform.gettextField_ChesPizza_SM();
			JTextField ChesPizza_LG = oform.gettextField_ChesPizza_LG();
			JTextField PePizza_SM = oform.gettextField_PePizza_SM();
			JTextField PePizza_LG = oform.gettextField_PePizza_LG();
			JTextField HaPizza_SM = oform.gettextField_HaPizza_SM();
			JTextField HaPizza_LG = oform.gettextField_HaPizza_LG();
			JTextField ShaqPizza_LG = oform.gettextField_ShaqPizza_LG();
			JTextField Calzone_Veg = oform.gettextField_Calzone_Veg();
			JTextField Calzone_Meat = oform.gettextField_Calzone_Meat();
			JTextField PizzaNotesInput = oform.gettextField_PizzaNotes();
			// set each value to be initial values.
            oform.gettextField_id().setText("");
			idInput.setText("");
			LastNameInput.setText("");
			ChesPizza_SM.setText("0");
			ChesPizza_LG.setText("0");
			PePizza_SM.setText("0");
			PePizza_LG.setText("0");
			HaPizza_SM.setText("0");
			HaPizza_LG.setText("0");
			ShaqPizza_LG.setText("0");
			Calzone_Veg.setText("0");
			Calzone_Meat.setText("0");
			PizzaNotesInput.setText("");
			return true;

	}
}
