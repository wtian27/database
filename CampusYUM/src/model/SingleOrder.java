package model;

/**
 * The SingleOrder class stores information about an order which includes id,
 * last name, quantity of different dishes and notes. numbers. These numbers are
 * 
 * @author (Jessie) Nan Jiang
 * @author Weirong Tian
 * @version April 19, 2014
 */

public class SingleOrder {

	int id;
	String LastName;
	int qty_ChesPizza_SM;
	int qty_ChesPizza_LG;
	int qty_PePizza_SM;
	int qty_PePizza_LG;
	int qty_HaPizza_SM;
	int qty_HaPizza_LG;
	int qty_ShaqPizza_LG;
	int qty_Calzone_Veg;
	int qty_Calzone_Meat;
	String notes;
	Double TotalAmount;
	
	/**
	 * Create a order with the given values.
	 * 
	 */
	
	public SingleOrder(int id, String LastName, int qty_ChesPizza_SM,
			int qty_ChesPizza_LG, int qty_PePizza_SM, int qty_PePizza_LG,
			int qty_HaPizza_SM, int qty_HaPizza_LG, int qty_ShaqPizza_LG,
			int qty_Calzone_Veg, int qty_Calzone_Meat, String notes,
			Double TotalAmount) {
		this.id = id;
		this.LastName = LastName;
		this.qty_ChesPizza_SM = qty_ChesPizza_SM;
		this.qty_ChesPizza_LG = qty_ChesPizza_LG;
		this.qty_PePizza_SM = qty_PePizza_SM;
		this.qty_PePizza_LG = qty_PePizza_LG;
		this.qty_HaPizza_SM = qty_HaPizza_SM;
		this.qty_HaPizza_LG = qty_HaPizza_LG;
		this.qty_ShaqPizza_LG = qty_ShaqPizza_LG;
		this.qty_Calzone_Veg = qty_Calzone_Veg;
		this.qty_Calzone_Meat = qty_Calzone_Meat;
		this.notes = notes;
		this.TotalAmount = TotalAmount;
	}
	
	/**
	 * Get the id value of the order.
	 * 
	 * @return The id value of the order.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set the id value of the order.
	 * 
	 * @param id
	 *            The id value for the order.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Get the LastName value of the order.
	 * 
	 * @return The id value of the order.
	 */
	public String getLastName() {
		return LastName;
	}

	/**
	 * Set the lastName value of the order.
	 * 
	 * @param lastName
	 *            The lastName value for the order.
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}

	/**
	 * Get the quantity of small cheese pizza value of the order.
	 * 
	 * @return The qty_ChesPizza_SM value of the order.
	 */
	public int getQty_ChesPizza_SM() {
		return qty_ChesPizza_SM;
	}


	/**
	 * Set the quantity of small cheese pizza value of the order.
	 * 
	 * @param qty_ChesPizza_SM
	 *            The qty_ChesPizza_SM value for the order.
	 */
	public void setQty_ChesPizza_SM(int qty_ChesPizza_SM) {
		this.qty_ChesPizza_SM = qty_ChesPizza_SM;
	}


	/**
	 * Get the quantity of large cheese pizza value of the order.
	 * 
	 * @return The qty_ChesPizza_LG value of the order.
	 */
	public int getQty_ChesPizza_LG() {
		return qty_ChesPizza_LG;
	}

	/**
	 * Set the quantity of large cheese pizza value of the order.
	 * 
	 * @param qty_ChesPizza_LG
	 *            The qty_ChesPizza_LG value for the order.
	 */
	public void setQty_ChesPizza_LG(int qty_ChesPizza_LG) {
		this.qty_ChesPizza_LG = qty_ChesPizza_LG;
	}

	/**
	 * Get the quantity of small pepperoni pizza value of the order.
	 * 
	 * @return The qty_PePizza_SM value of the order.
	 */
	public int getQty_PePizza_SM() {
		return qty_PePizza_SM;
	}
	
	/**
	 * Set the quantity of small pepperoni pizza value of the order.
	 * 
	 * @param qty_PePizza_LG
	 *            The qty_PePizza_LG value for the order.
	 */
	public void setQty_PePizza_SM(int qty_PePizza_SM) {
		this.qty_PePizza_SM = qty_PePizza_SM;
	}

	/**
	 * Get the quantity of large pepperoni pizza value of the order.
	 * 
	 * @return The qty_PePizza_LG value of the order.
	 */
	public int getQty_PePizza_LG() {
		return qty_PePizza_LG;
	}
	
	/**
	 * Set the quantity of large pepperoni pizza value of the order.
	 * 
	 * @param qty_PePizza_LG
	 *            The qty_PePizza_LG value for the order.
	 */
	public void setQty_PePizza_LG(int qty_PePizza_LG) {
		this.qty_PePizza_LG = qty_PePizza_LG;
	}


	/**
	 * Get the quantity of small hawaii pizza value of the order.
	 * 
	 * @return The qty_HaPizza_SM value of the order.
	 */
	public int getQty_HaPizza_SM() {
		return qty_HaPizza_SM;
	}

	/**
	 * Set the quantity of small hawaii pizza value of the order.
	 * 
	 * @param qty_HaPizza_SM
	 *            The qty_HaPizza_SM value for the order.
	 */
	public void setQty_HaPizza_SM(int qty_HaPizza_SM) {
		this.qty_HaPizza_SM = qty_HaPizza_SM;
	}
	
	/**
	 * Get the quantity of large hawaii pizza value of the order.
	 * 
	 * @return The qty_HaPizza_LG value of the order.
	 */
	public int getQty_HaPizza_LG() {
		return qty_HaPizza_LG;
	}

	/**
	 * Set the quantity of large hawaii pizza value of the order.
	 * 
	 * @param qty_HaPizza_LG
	 *            The qty_HaPizza_LG value for the order.
	 */
	public void setQty_HaPizza_LG(int qty_HaPizza_LG) {
		this.qty_HaPizza_LG = qty_HaPizza_LG;
	}
	
	/**
	 * Get the quantity of large Shaq pizza value of the order.
	 * 
	 * @return The qty_ShaqPizza_LG value of the order.
	 */
	public int getQty_ShaqPizza_LG() {
		return qty_ShaqPizza_LG;
	}

	/**
	 * Set the quantity of large Shaq pizza value of the order.
	 * 
	 * @param qty_ShaqPizza_LG
	 *            The qty_ShaqPizza_LG value for the order.
	 */
	public void setQty_ShaqPizza_LG(int qty_ShaqPizza_LG) {
		this.qty_ShaqPizza_LG = qty_ShaqPizza_LG;
	}
	
	/**
	 * Get the quantity of Calzone with vege value of the order.
	 * 
	 * @return The qty_Calzone_Veg value of the order.
	 */
	public int getQty_Calzone_Veg() {
		return qty_Calzone_Veg;
	}

	/**
	 * Set the quantity of Calzone with vege value of the order.
	 * 
	 * @param qty_Calzone_Veg
	 *            The qty_Calzone_Veg value for the order.
	 */
	public void setQty_Calzone_Veg(int qty_Calzone_Veg) {
		this.qty_Calzone_Veg = qty_Calzone_Veg;
	}

	/**
	 * Get the quantity of Calzone with meat value of the order.
	 * 
	 * @return The qty_Calzone_Meat value of the order.
	 */
	public int getQty_Calzone_Meat() {
		return qty_Calzone_Meat;
	}

	/**
	 * Set the quantity of Calzone with meat value of the order.
	 * 
	 * @param qty_Calzone_Meat
	 *            The qty_Calzone_Meat value for the order.
	 */
	public void setQty_Calzone_Meat(int qty_Calzone_Meat) {
		this.qty_Calzone_Meat = qty_Calzone_Meat;
	}
	
	/**
	 * Get the notes of the order.
	 * 
	 * @return The notes value of the order.
	 */
	public String getNotes() {
		return notes;
	}
	
	/**
	 * Set the notes of the order.
	 * 
	 * @param notes
	 *            The notes value for the order.
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}

	/**
	 * Get the Total Amounts of the order.
	 * 
	 * @return The TotalAmount value of the order.
	 */
	public Double getTotalAmount() {
		return TotalAmount;
	}


	/**
	 * Set the Total Amounts of the order.
	 * 
	 * @param TotalAmount
	 *            The TotalAmount for the order.
	 */
	public void setTotalAmount(Double totalAmount) {
		TotalAmount = totalAmount;
	}

}
