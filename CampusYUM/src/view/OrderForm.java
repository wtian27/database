package view;

/**
 * The OrderForm contains the order GUI for the chef.
 * 
 * @author (Jessie) Nan Jiang
 * @author Weirong Tian
 * @version April 19, 2014
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import controller.AddSingleOrderController;
import controller.ClearSingleOrderController;
import model.Model;

import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.io.IOException;

@SuppressWarnings("serial")
public class OrderForm extends JFrame {

	Model model;
	private JPanel contentPane;
	private JTextField textField_id;
	private JTextField textField_LastName;
	private JTextField textField_ChesPizza_SM;
	private JTextField textField_PizzaNotes;
	private JTextField textField_PePizza_SM;
	private JTextField textField_HaPizza_SM;
	private JTextField textField_Calzone_Veg;
	private JTextField textField_Calzone_Meat;
	private JTextField textField_ChesPizza_LG;
	private JTextField textField_PePizza_LG;
	private JTextField textField_HaPizza_LG;
	private JTextField textField_ShaqPizza_LG;

	/**
	 * Create the frame.
	 */
	public OrderForm() {
		setTitle("CampusYUM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		setContentPane(contentPane);

		JLabel lblWpiId = new JLabel("WPI ID :");
		lblWpiId.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 11));

		textField_id = new JTextField();
		textField_id.setToolTipText("Please enter your WPI ID");
		textField_id.setColumns(10);

		textField_LastName = new JTextField();
		textField_LastName.setToolTipText("Please enter your Last Name");
		textField_LastName.setColumns(10);

		JButton btnOrder = new JButton("ORDER");
		btnOrder.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnOrder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				try {
					new AddSingleOrderController(OrderForm.this.model)
							.act(OrderForm.this);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("can't process");
					e.printStackTrace();
				}
			}
		});

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				new ClearSingleOrderController(OrderForm.this.model)
						.act(OrderForm.this);

			}
		});

		JLayeredPane panel = new JLayeredPane();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));

		JLabel lblCheesePizza = new JLabel("Cheese Pizza");
		lblCheesePizza.setFont(new Font("����", Font.PLAIN, 14));

		JLabel lblGompeisPizza = new JLabel("GOMPEI'S PIZZA");
		lblGompeisPizza.setFont(new Font("����", Font.BOLD, 18));

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(18)
																		.addComponent(
																				panel,
																				GroupLayout.PREFERRED_SIZE,
																				628,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(51)
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								gl_contentPane
																										.createSequentialGroup()
																										.addComponent(
																												lblWpiId)
																										.addGap(33)
																										.addComponent(
																												textField_id,
																												GroupLayout.PREFERRED_SIZE,
																												75,
																												GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								gl_contentPane
																										.createSequentialGroup()
																										.addComponent(
																												lblLastName,
																												GroupLayout.PREFERRED_SIZE,
																												70,
																												GroupLayout.PREFERRED_SIZE)
																										.addGap(4)
																										.addComponent(
																												textField_LastName,
																												GroupLayout.PREFERRED_SIZE,
																												75,
																												GroupLayout.PREFERRED_SIZE)))
																		.addGap(94)
																		.addComponent(
																				btnOrder,
																				GroupLayout.PREFERRED_SIZE,
																				150,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(53)
																		.addComponent(
																				btnClear,
																				GroupLayout.PREFERRED_SIZE,
																				81,
																				GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(132, Short.MAX_VALUE)));
		gl_contentPane
				.setVerticalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGap(17)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.TRAILING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								gl_contentPane
																										.createSequentialGroup()
																										.addGap(6)
																										.addComponent(
																												lblWpiId))
																						.addGroup(
																								gl_contentPane
																										.createSequentialGroup()
																										.addGap(5)
																										.addComponent(
																												textField_id,
																												GroupLayout.PREFERRED_SIZE,
																												15,
																												GroupLayout.PREFERRED_SIZE)))
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								gl_contentPane
																										.createSequentialGroup()
																										.addGap(4)
																										.addComponent(
																												lblLastName))
																						.addGroup(
																								gl_contentPane
																										.createSequentialGroup()
																										.addGap(3)
																										.addComponent(
																												textField_LastName,
																												GroupLayout.PREFERRED_SIZE,
																												15,
																												GroupLayout.PREFERRED_SIZE)))
																		.addGap(11))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.BASELINE)
																						.addComponent(
																								btnOrder)
																						.addComponent(
																								btnClear,
																								GroupLayout.PREFERRED_SIZE,
																								25,
																								GroupLayout.PREFERRED_SIZE))
																		.addGap(18)))
										.addComponent(panel,
												GroupLayout.PREFERRED_SIZE,
												452, GroupLayout.PREFERRED_SIZE)
										.addContainerGap(22, Short.MAX_VALUE)));

		JLabel lblPepporaniPizza = new JLabel("Pepporani Pizza");
		lblPepporaniPizza.setFont(new Font("����", Font.PLAIN, 14));

		JLabel lblHawaiiPizza = new JLabel("Hawaii Pizza");
		lblHawaiiPizza.setFont(new Font("����", Font.PLAIN, 14));

		JLabel lblShaqPizza = new JLabel("Shaq Pizza");
		lblShaqPizza.setFont(new Font("����", Font.PLAIN, 14));

		JLabel lblCalzoneWithVegetables = new JLabel("Calzone with Vege");
		lblCalzoneWithVegetables.setFont(new Font("����", Font.PLAIN, 14));

		JLabel lblCalzoneWithMeat = new JLabel("Calzone with Meat");
		lblCalzoneWithMeat.setFont(new Font("����", Font.PLAIN, 14));

		JLabel lblSmall = new JLabel("Small");
		lblSmall.setFont(new Font("����", Font.BOLD, 15));

		JLabel lblLarge = new JLabel("Large");
		lblLarge.setFont(new Font("����", Font.BOLD, 16));

		textField_ChesPizza_SM = new JTextField();
		textField_ChesPizza_SM.setText("0");
		textField_ChesPizza_SM.setColumns(10);

		JLabel lblNotes = new JLabel("Notes :");

		textField_PizzaNotes = new JTextField();
		textField_PizzaNotes.setColumns(10);

		JLabel lblNewLabel = new JLabel("6.29");

		JLabel label = new JLabel("8.99");

		JLabel label_1 = new JLabel("6.89");

		JLabel label_2 = new JLabel("9.99");

		JLabel label_3 = new JLabel("7.49");

		JLabel label_4 = new JLabel("11.50");

		JLabel label_5 = new JLabel("13.99");

		JLabel label_6 = new JLabel("6.95");

		JLabel label_7 = new JLabel("6.95");
		
		textField_PePizza_SM = new JTextField();
		textField_PePizza_SM.setText("0");
		textField_PePizza_SM.setColumns(10);
		
		textField_HaPizza_SM = new JTextField();
		textField_HaPizza_SM.setText("0");
		textField_HaPizza_SM.setColumns(10);
		
		textField_Calzone_Veg = new JTextField();
		textField_Calzone_Veg.setText("0");
		textField_Calzone_Veg.setColumns(10);
		
		textField_Calzone_Meat = new JTextField();
		textField_Calzone_Meat.setText("0");
		textField_Calzone_Meat.setColumns(10);
		
		textField_ChesPizza_LG = new JTextField();
		textField_ChesPizza_LG.setText("0");
		textField_ChesPizza_LG.setColumns(10);
		
		textField_PePizza_LG = new JTextField();
		textField_PePizza_LG.setText("0");
		textField_PePizza_LG.setColumns(10);
		
		textField_HaPizza_LG = new JTextField();
		textField_HaPizza_LG.setText("0");
		textField_HaPizza_LG.setColumns(10);
		
		textField_ShaqPizza_LG = new JTextField();
		textField_ShaqPizza_LG.setText("0");
		textField_ShaqPizza_LG.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(41)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(46)
									.addComponent(lblNotes)
									.addGap(18)
									.addComponent(textField_PizzaNotes, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblShaqPizza, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(lblCheesePizza, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblPepporaniPizza)
												.addComponent(lblHawaiiPizza, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblCalzoneWithMeat, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblCalzoneWithVegetables, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
											.addGap(84)
											.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
												.addComponent(textField_ChesPizza_SM, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_PePizza_SM, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_HaPizza_SM, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_Calzone_Veg, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_Calzone_Meat, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblSmall, Alignment.LEADING))))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
												.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
													.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(lblNewLabel)
														.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
														.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
													.addGap(60)
													.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(textField_ChesPizza_LG, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
														.addComponent(textField_PePizza_LG, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
														.addComponent(textField_HaPizza_LG, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
														.addComponent(textField_ShaqPizza_LG, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
												.addComponent(lblLarge))
											.addGap(24)
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(label, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_4)
												.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
										.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(205)
							.addComponent(lblGompeisPizza, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)))
					.addGap(93))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblGompeisPizza, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSmall)
						.addComponent(lblLarge))
					.addGap(19)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCheesePizza, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_ChesPizza_SM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel)
						.addComponent(textField_ChesPizza_LG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPepporaniPizza, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2)
						.addComponent(label_1)
						.addComponent(textField_PePizza_SM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_PePizza_LG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHawaiiPizza, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3)
						.addComponent(textField_HaPizza_SM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4)
						.addComponent(textField_HaPizza_LG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShaqPizza, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_5)
						.addComponent(textField_ShaqPizza_LG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCalzoneWithVegetables, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_6)
						.addComponent(textField_Calzone_Veg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCalzoneWithMeat, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_7)
						.addComponent(textField_Calzone_Meat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(51)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_PizzaNotes, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNotes))
					.addGap(8))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);

	}

	/**
	 * Get the JTextField for wpi id.
	 * 
	 */
	public JTextField gettextField_id() {
		return textField_id;
	}

	/**
	 * Get the JTextField for Small Cheese Pizza.
	 * 
	 */
	public JTextField gettextField_LastName() {
		return textField_LastName;
	}

	/**
	 * Get the JTextField for Small Cheese Pizza.
	 * 
	 */
	public JTextField gettextField_ChesPizza_SM() {
		return textField_ChesPizza_SM;
	}

	/**
	 * Get the JTextField for Large Cheese Pizza.
	 * 
	 */
	public JTextField gettextField_ChesPizza_LG() {
		return textField_ChesPizza_LG;
	}

	/**
	 * Get the JTextField for small pepporoni Pizza.
	 * 
	 */
	public JTextField gettextField_PePizza_SM() {
		return textField_PePizza_SM;
	}

	/**
	 * Get the JTextField for Large pepporoni Pizza.
	 * 
	 */
	public JTextField gettextField_PePizza_LG() {
		return textField_PePizza_LG;
	}

	/**
	 * Get the JTextField for Large hawaii Pizza.
	 * 
	 */
	public JTextField gettextField_HaPizza_SM() {
		return textField_HaPizza_SM;
	}

	/**
	 * Get the JTextField for Large hawaii Pizza.
	 * 
	 */
	public JTextField gettextField_HaPizza_LG() {
		return textField_HaPizza_LG;
	}

	/**
	 * Get the JTextField for Large shaq Pizza.
	 * 
	 */
	public JTextField gettextField_ShaqPizza_LG() {
		return textField_ShaqPizza_LG;
	}

	/**
	 * Get the JTextField for vege calzone.
	 * 
	 */
	public JTextField gettextField_Calzone_Veg() {
		return textField_Calzone_Veg;
	}

	/**
	 * Get the JTextField for meat calzone.
	 * 
	 */
	public JTextField gettextField_Calzone_Meat() {
		return textField_Calzone_Meat;
	}

	/**
	 * Get the JTextField for meat calzone.
	 * 
	 */
	public JTextField gettextField_PizzaNotes() {
		return textField_PizzaNotes;
	}
}
