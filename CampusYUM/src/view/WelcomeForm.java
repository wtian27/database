package view;

/**
 * The WelcomeForm presents a welcome GUI for the users.
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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import model.Model;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import controller.ToManageController;
import controller.ToOrderController;
 

/**
 * The MainForm contains the main GUI for the grapher.
 * 

 * @version December 13, 2013
 */
@SuppressWarnings("serial")
public class WelcomeForm extends JFrame {

	Model model;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	/**
	 * Create the frame.
	 */ 
	public WelcomeForm() {
		setTitle("CampusYUM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600
			);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		// add the model
		this.model = new Model();
		

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE))
		);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\njiang\\Dropbox\\542 DataBase\\CampusYUM\\CampusYUM.png"));
		
		JPanel panel_1 = new JPanel(); 
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(46)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE)
					.addGap(34))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(232)
					.addComponent(label)
					.addContainerGap(331, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(label)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(39, Short.MAX_VALUE))
		);
		
		JButton btnManageOrders = new JButton("Manage Orders");
		btnManageOrders.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnManageOrders.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				new ToManageController(WelcomeForm.this.model).act(WelcomeForm.this);
			}
		});
		
		JLabel lblLogInAs = new JLabel("Log in \r\nas a chef to\r\n");
		lblLogInAs.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
					.addContainerGap(83, Short.MAX_VALUE)
					.addComponent(btnManageOrders, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
					.addGap(71))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(62)
					.addComponent(lblLogInAs)
					.addContainerGap(108, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
					.addContainerGap(92, Short.MAX_VALUE)
					.addComponent(lblLogInAs)
					.addGap(56)
					.addComponent(btnManageOrders, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(123))
		);
		panel_2.setLayout(gl_panel_2);
		
		JButton btnOrder = new JButton("ORDER");
		btnOrder.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnOrder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				new ToOrderController(WelcomeForm.this.model).act(WelcomeForm.this);
			}
		}); 
		
		JLabel lblSignInTo = new JLabel("Sign in to");
		lblSignInTo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(41)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSignInTo, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnOrder, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(44, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(83)
					.addComponent(lblSignInTo, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(btnOrder, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(107, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);

	}	
}
