package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.JTextField;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpledb.AmazonSimpleDB;
import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.services.simpledb.AmazonSimpleDBClient;
import com.amazonaws.services.simpledb.model.Attribute;
import com.amazonaws.services.simpledb.model.BatchPutAttributesRequest;
import com.amazonaws.services.simpledb.model.Item;
import com.amazonaws.services.simpledb.model.ReplaceableAttribute;
import com.amazonaws.services.simpledb.model.ReplaceableItem;
import com.amazonaws.services.simpledb.model.SelectRequest;

import model.Model;
import model.Prices;
import view.OrderForm;

/**
 * The AddSingleOrderController class handles the add Order use case.
 * 
 * @author (Jessie) Nan Jiang
 * @author Weirong Tian 
 * @version April 19, 2014
 */
 
public class AddSingleOrderController {

	public static final String myDomain = "CC_Order";
	Model model;
	Prices price;

	/**
	 * Create a controller for the given model.
	 * 
	 * @param model
	 *            The model for this controller.
	 */
	public AddSingleOrderController(Model model) {
		this.model = model;
	}

	/**
	 * Act on the given form by adding a order.
	 * 
	 * @param oform
	 *            The OrderForm to act on.
	 * @return True if the action was successful.
	 */
	public boolean act(OrderForm oform) throws IOException {

		try {
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

			int id = Integer.parseInt(idInput.getText());
			String LastName = LastNameInput.getText();
			int qty_ChesPizza_SM = Integer.parseInt(ChesPizza_SM.getText());
			int qty_ChesPizza_LG = Integer.parseInt(ChesPizza_LG.getText());
			int qty_PePizza_SM = Integer.parseInt(PePizza_SM.getText());
			int qty_PePizza_LG = Integer.parseInt(PePizza_LG.getText());
			int qty_HaPizza_SM = Integer.parseInt(HaPizza_SM.getText());
			int qty_HaPizza_LG = Integer.parseInt(HaPizza_LG.getText());
			int qty_ShaqPizza_LG = Integer.parseInt(ShaqPizza_LG.getText());
			int qty_Calzone_Veg = Integer.parseInt(Calzone_Veg.getText());
			int qty_Calzone_Meat = Integer.parseInt(Calzone_Meat.getText());
			String PizzaNotes = PizzaNotesInput.getText();

			Double totalAmounts = qty_ChesPizza_SM * Prices.C_ChesPizza_SM
					+ qty_ChesPizza_LG * Prices.C_ChesPizza_LG + qty_PePizza_SM
					* Prices.C_PePizza_SM + qty_PePizza_LG
					* Prices.C_PePizza_LG + qty_HaPizza_SM
					* Prices.C_HaPizza_SM + qty_HaPizza_LG
					* Prices.C_HaPizza_LG + qty_ShaqPizza_LG
					* Prices.C_ShaqPizza_LG + qty_Calzone_Veg 
					* Prices.C_Calzone_Veg + qty_Calzone_Meat
					* Prices.C_Calone_Meat;
			
			// add it to the model
			Calendar calendar = Calendar.getInstance();
			Date timestamp = calendar.getTime();
			String itemName = "" + timestamp;
			System.out.println(itemName);

			ReplaceableItem rItem = new ReplaceableItem();
			List<ReplaceableItem> sampleData = new ArrayList<ReplaceableItem>();
			List<ReplaceableAttribute> rlist = new ArrayList<ReplaceableAttribute>();

			if (id != 0 & LastName != null) {
				addnewAttribute("WPI ID", "" + id, rlist);
				addnewAttribute("Last Name", LastName, rlist);
			}

			if (qty_ChesPizza_SM != 0) {
				addnewAttribute("Small Cheese Pizza", "" + qty_ChesPizza_SM,
						rlist);
			}

			if (qty_ChesPizza_LG != 0) {
				addnewAttribute("Large Cheese Pizza", "" + qty_ChesPizza_LG,
						rlist);
			}

			if (qty_PePizza_SM != 0) {
				addnewAttribute("Small Pepporoni Pizza", "" + qty_PePizza_SM,
						rlist);
			}

			if (qty_PePizza_LG != 0) {
				addnewAttribute("Large Pepporoni Pizza", "" + qty_PePizza_LG,
						rlist);
			}

			if (qty_HaPizza_SM != 0) {
				addnewAttribute("Small Hawaii Pizza", "" + qty_PePizza_SM,
						rlist);
			}

			if (qty_HaPizza_LG != 0) {
				addnewAttribute("Large Hawaii Pizza", "" + qty_HaPizza_LG,
						rlist);
			}

			if (qty_ShaqPizza_LG != 0) {
				addnewAttribute("Large Shaq Pizza", "" + qty_ShaqPizza_LG,
						rlist);
			}

			if (qty_Calzone_Veg != 0) {
				addnewAttribute("Calzone with Vege", "" + qty_Calzone_Veg,
						rlist);
			}

			if (qty_Calzone_Meat != 0) {
				addnewAttribute("Calzone with Meat", "" + qty_Calzone_Meat,
						rlist);
			}

			if (PizzaNotes != null) {
				addnewAttribute("Notes", PizzaNotes, rlist);
			}

			if (totalAmounts != 0) {
				addnewAttribute("Total Amounts", "" + totalAmounts, rlist);
			}

			sampleData.add(rItem.withName(itemName).withAttributes(rlist));
			AmazonSimpleDB sdb = new AmazonSimpleDBClient(
					new PropertiesCredentials(AddSingleOrderController.class
							.getResourceAsStream("AwsCredentials.properties")));
			sdb.batchPutAttributes(new BatchPutAttributesRequest(myDomain,
					sampleData));

			// set the initial value
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

			// Select data from a domain
			String selectExpression = "select * from `" + myDomain + "`";
			SelectRequest selectRequest = new SelectRequest(selectExpression);
			for (Item item : sdb.select(selectRequest).getItems()) {
				System.out.println("  Item");
				System.out.println("    Name: " + item.getName());
				for (Attribute attribute : item.getAttributes()) {
					System.out.println("      Attribute");
					System.out.println("        Name:  " + attribute.getName());
					System.out
							.println("        Value: " + attribute.getValue());
				}
			}
			System.out.println();

		} catch (NumberFormatException e) {
			// bad input
			return false;
		} catch (AmazonServiceException ase) {
			System.out
					.println("Caught an AmazonServiceException, which means your request made it "
							+ "to Amazon SimpleDB, but was rejected with an error response for some reason.");
			System.out.println("Error Message:    " + ase.getMessage());
			System.out.println("HTTP Status Code: " + ase.getStatusCode());
			System.out.println("AWS Error Code:   " + ase.getErrorCode());
			System.out.println("Error Type:       " + ase.getErrorType());
			System.out.println("Request ID:       " + ase.getRequestId());
		} catch (AmazonClientException ace) {
			System.out
					.println("Caught an AmazonClientException, which means the client encountered "
							+ "a serious internal problem while trying to communicate with SimpleDB, "
							+ "such as not being able to access the network.");
			System.out.println("Error Message: " + ace.getMessage());

		}
		return true;

	}

	private static void addnewAttribute(String name, String value,
			List<ReplaceableAttribute> rlist) {
		ReplaceableAttribute rAttri = new ReplaceableAttribute();
		rAttri.setName(name);
		rAttri.setValue(value);
		rlist.add(rAttri);

	}

}
