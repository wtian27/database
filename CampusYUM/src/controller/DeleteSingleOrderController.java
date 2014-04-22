package controller;

/**
 * The DeleteSingleOrderController class handles the delete Order use case.
 * 
 * @author (Jessie) Nan Jiang
 * @author Weirong Tian
 * @version April 19, 2014
 */

import java.io.IOException;

import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.services.simpledb.AmazonSimpleDB;
import com.amazonaws.services.simpledb.AmazonSimpleDBClient;
import com.amazonaws.services.simpledb.model.Attribute;
import com.amazonaws.services.simpledb.model.DeleteAttributesRequest;
import com.amazonaws.services.simpledb.model.Item;
import com.amazonaws.services.simpledb.model.SelectRequest;

import view.MainForm;
import model.Model;

public class DeleteSingleOrderController {
	
	Model model;
	
	public static final String myDomain = "CC_Order";
	 
	public DeleteSingleOrderController(Model model) {
		this.model = model;
	}
	
	public boolean act(MainForm mform) throws IOException {	
		// get access to the database
		 AmazonSimpleDB sdb = new AmazonSimpleDBClient(new PropertiesCredentials(
				 DeleteSingleOrderController.class.getResourceAsStream("AwsCredentials.properties"))); 

	        System.out.println("===========================================");
	        System.out.println("Getting Started with Amazon SimpleDB");
	        System.out.println("===========================================\n");

	     // select query   
		String selectExpression = "select " +  "*" + " from `" + myDomain  + "`";
        System.out.println("Selecting: " + selectExpression + "\n");
        SelectRequest selectRequest = new SelectRequest(selectExpression);
        
        int NumOfOrders = sdb.select(selectRequest).getItems().size(); 
						  
		// check the order
		if (NumOfOrders<1){ 
			
			return false;
			
		}else{ 
			// delete the oldest order
			sdb.deleteAttributes(new DeleteAttributesRequest(myDomain, sdb.select(selectRequest).getItems().get(0).getName()));
	        
	        for (Item item : sdb.select(selectRequest).getItems()) {
	            System.out.println("  Item");
	            System.out.println("    Name: " + item.getName());
	            for (Attribute attribute : item.getAttributes()) {
	                System.out.println("      Attribute");
	                System.out.println("        Name:  " + attribute.getName());
	                System.out.println("        Value: " + attribute.getValue());
	            }
	        }
	        System.out.println();
			return true;
		}
		
		}
	}

