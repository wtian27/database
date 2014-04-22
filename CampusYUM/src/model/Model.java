package model;

import model.SingleOrder;

/**
 * The Model class stores information about the entire model, such as the order
 * and the form.
 * 
 * @author (Jessie) Nan Jiang
 * @author Weirong Tian
 * @version April 19, 2014
 */
public class Model {

	SingleOrder so;
	IndividualForm iform;
	Prices prices;

	/**
	 * Create a model with a new, empty order and a new form. This from will be
	 * IndividualForm.
	 */
	public Model() {

		so = new SingleOrder(0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null);
		iform = new IndividualForm();
		iform.setSingleOrder(so);
	}

	/**
	 * Get a reference to this model's single order.
	 * 
	 * @return This model's single order.
	 */
	public SingleOrder getSingleOrder() {
		return so;
	}

	/**
	 * Get a reference to this model's current individual form.
	 * 
	 * @return This model's current individual form.
	 */
	public IndividualForm getform() {
		return iform;
	}

	/**
	 * Set the individual form of this model.
	 * 
	 * @param iform
	 *            The new individual form for this model.
	 */
	public void setForm(IndividualForm iform) {
		this.iform = iform;
		this.iform.setSingleOrder(this.so);
	}

	public Prices getPrices() {
		return prices;
	}
}
