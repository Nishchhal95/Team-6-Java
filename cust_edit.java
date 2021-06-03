import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  

public class cust_edit extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cust_edit frame = new cust_edit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public cust_edit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 650, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer Profile");
		lblNewLabel.setBounds(259, 14, 131, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(158, 78, 78, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setBounds(156, 125, 96, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email ID");
		lblNewLabel_3.setBounds(157, 174, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setBounds(155, 223, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Country");
		lblNewLabel_5.setBounds(154, 275, 61, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Preference");
		lblNewLabel_6.setBounds(155, 326, 95, 16);
		contentPane.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(306, 71, 185, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(308, 116, 183, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(310, 164, 180, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(312, 218, 176, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(314, 270, 176, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(315, 322, 173, 26);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("All Transaction");
		lblNewLabel_7.setBounds(155, 378, 110, 16);
		contentPane.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(314, 371, 175, 26);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton = new JButton("Dashboard");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dashboard d = new Dashboard();
				d.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBounds(119, 440, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
               String ss = null;
               String m_password = null;
               
              
					ss = textField_2.getText();
					m_password = textField_3.getText();
					
					if((ss == null) || (ss.equals(""))) {
			               JOptionPane.showMessageDialog(null, "Invalid Email!");
			               
			             }
			             else if(m_password == null) {
			                    JOptionPane.showMessageDialog(null, "Password cannot be empty!");
			                   
			             }
			             
					else
					{	
				
				        JOptionPane.showMessageDialog(null, "Changes Saved!");
				        Dashboard ds = new Dashboard();
						ds.setVisible(true);
						

						setVisible(false);
						dispose();
					}   
			}
		});
		btnNewButton_1.setBounds(406, 436, 117, 29);
		contentPane.add(btnNewButton_1);
	}

}
