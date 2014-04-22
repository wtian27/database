package model;

import java.awt.Dimension;
import java.awt.Graphics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.services.simpledb.AmazonSimpleDB;
import com.amazonaws.services.simpledb.AmazonSimpleDBClient;
import com.amazonaws.services.simpledb.model.Attribute;
import com.amazonaws.services.simpledb.model.Item;
import com.amazonaws.services.simpledb.model.SelectRequest;

import view.FormPanel;

/** 
* The IndividualForm class stores information about a Individual Form that contains the oldest order in the database
* and can be used to visualize it.
* @author (Jessie) Nan Jiang
* @author Weirong Tian
* @version April 19, 2014
* 
* */

public class IndividualForm extends Form {

	private static final String myDomain = "CC_Order";

	/**
	 * Create a IndividualForm.
	 */
	public IndividualForm() {
		super();
	}

	/**
	 * Register the order with form.
	 * 
	 * @param so
	 *            The single order to register.
	 */
	@Override
	public void setSingleOrder(SingleOrder so) {
		super.setSingleOrder(so);

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
	public void draw(Graphics g, JPanel panel) throws IOException {
		// Get access to the database.
		AmazonSimpleDB sdb = new AmazonSimpleDBClient(
				new PropertiesCredentials(IndividualForm.class
						.getResourceAsStream("AwsCredentials.properties")));

		// set the select query
		String selectExpression = "select " + "*" + " from `" + myDomain + "`";
		
		SelectRequest selectRequest = new SelectRequest(selectExpression);
		
		int NumOfOrders = sdb.select(selectRequest).getItems().size();
		int width = FormPanel.DEFAULT_PANEL_WIDTH;
		int height = FormPanel.DEFAULT_PANEL_HEIGHT;
		panel.setPreferredSize(new Dimension(width, height));
		panel.setSize(width, height);
		// check for orders
		if (this.so == null || NumOfOrders == 0) {
			String noOrder = "There is no orders.";
			g.drawString(noOrder, Form.PADDING, Form.PADDING);
			return; 
		}
 
		 
		
		// get the earliest order form the database
		 
		Item item = sdb.select(selectRequest).getItems().get(0); 

		// print the order in the scroll panel
		List<Attribute> attribute = new ArrayList<Attribute>();
		attribute = item.getAttributes();
		int attributeSize = attribute.size();
		for (int i = 0; i < attributeSize; i++) {
			String name = attribute.get(i).getName(); 
			String value = attribute.get(i).getValue();
			g.drawString(name, Form.PADDING, getYPixel(i+1)); 
			g.drawString(value, 10 * Form.PADDING , getYPixel(i+1));

		}
		
	
	}


	/**
	 * For given attribute, compute the pixel value of where to draw the string.
	 * 
	 * @param y
	 *            The y attribute to convert.
	 * @return The y attribute of the pixel location.
	 */
	private int getYPixel(int y) {

		return (int) (y * Form.PADDING);

	}

}
