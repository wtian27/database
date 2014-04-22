package view;

/**
 * The MainForm contains the manage order GUI for the chef.
 * 
 * @author (Jessie) Nan Jiang
 * @author Weirong Tian
 * @version April 19, 2014
 */

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ScrollPaneConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import model.Model;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.io.IOException;


import controller.DeleteSingleOrderController;
import javax.swing.JScrollPane;

import view.FormPanel;


/**
 * The MainForm contains the main GUI for the grapher.
 * 

 * @version December 13, 2013
 */


@SuppressWarnings("serial")
public class MainForm extends JFrame {

	Model model;

	FormPanel formPanel;
	
	

	private JPanel contentPane;


	public MainForm() {
		setTitle("CampusYUM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600
			); 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		// add the model
		this.model = new Model();
		
		JPanel IndividualForm = new JPanel();
		IndividualForm.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\njiang\\Dropbox\\542 DataBase\\CampusYUM\\CampusYUM.png"));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(30, Short.MAX_VALUE)
					.addComponent(IndividualForm, GroupLayout.PREFERRED_SIZE, 734, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(246)
					.addComponent(lblNewLabel)
					.addContainerGap(482, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(26, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(IndividualForm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		
		JButton btnComplete = new JButton("Complete");
		btnComplete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				try {
					new DeleteSingleOrderController(MainForm.this.model).act(MainForm.this);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	
		btnComplete.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblOrder = new JLabel("Order");
		lblOrder.setFont(new Font("Elephant", Font.BOLD, 18));
		
		JScrollPane FormscrollPane = new JScrollPane();
		FormscrollPane
		.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		formPanel = new FormPanel(model.getform());
		FormscrollPane.setViewportView(formPanel);
		
		
		
		GroupLayout gl_IndividualForm = new GroupLayout(IndividualForm);
		gl_IndividualForm.setHorizontalGroup(
			gl_IndividualForm.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_IndividualForm.createSequentialGroup()
					.addGap(327)
					.addComponent(lblOrder, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_IndividualForm.createSequentialGroup()
					.addGap(45)
					.addGroup(gl_IndividualForm.createParallelGroup(Alignment.TRAILING)
						.addComponent(FormscrollPane, GroupLayout.PREFERRED_SIZE, 621, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnComplete)))
		);
		gl_IndividualForm.setVerticalGroup(
			gl_IndividualForm.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_IndividualForm.createSequentialGroup()
					.addGap(11)
					.addComponent(lblOrder)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(FormscrollPane, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
					.addGap(46)
					.addComponent(btnComplete, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
		);
		IndividualForm.setLayout(gl_IndividualForm);
		contentPane.setLayout(gl_contentPane);
	}	
	
	public FormPanel getFormPanel() {
		return formPanel;
	}
	
	
}
