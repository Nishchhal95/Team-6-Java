import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stafff extends JFrame {

	private JPanel contentPane;
	private JTextField staffname_txt;
	private JTextField stafflastname_txt;
	private JTextField stafflocation_txt;
	private JTextField staffdesignation_txt;
	private JTextField staffPhno_txt;
	private JTextField staffEmail_txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Staff frame = new Staff();
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
	public Stafff() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 650, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		staffname_txt = new JTextField();
		staffname_txt.setBounds(230, 54, 159, 25);
		contentPane.add(staffname_txt);
		staffname_txt.setColumns(10);
				JLabel staffFirstName = new JLabel("First Name");
		staffFirstName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		staffFirstName.setBounds(85, 56, 145, 19);
		contentPane.add(staffFirstName);
		
		JLabel lblNewLabel_1 = new JLabel("Staff Details");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(230, 10, 96, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel staffLastName = new JLabel("Last Name");
		staffLastName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		staffLastName.setBounds(85, 108, 127, 35);
		contentPane.add(staffLastName);
		
		stafflastname_txt = new JTextField();
		stafflastname_txt.setBounds(230, 108, 159, 25);
		contentPane.add(stafflastname_txt);
		stafflastname_txt.setColumns(10);
		
		JLabel staffWorklocation = new JLabel("Work Location");
		staffWorklocation.setFont(new Font("Tahoma", Font.PLAIN, 12));
		staffWorklocation.setBounds(85, 177, 91, 25);
		contentPane.add(staffWorklocation);
		
		stafflocation_txt = new JTextField();
		stafflocation_txt.setBounds(230, 171, 159, 25);
		contentPane.add(stafflocation_txt);
		stafflocation_txt.setColumns(10);
		
		JLabel staffDesignation = new JLabel("Designation");
		staffDesignation.setFont(new Font("Tahoma", Font.PLAIN, 12));
		staffDesignation.setBounds(85, 242, 78, 25);
		contentPane.add(staffDesignation);
		
		staffdesignation_txt = new JTextField();
		staffdesignation_txt.setBounds(230, 237, 159, 25);
		contentPane.add(staffdesignation_txt);
		staffdesignation_txt.setColumns(10);
		
		JLabel staffMobileNo = new JLabel("Phone Number");
		staffMobileNo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		staffMobileNo.setBounds(85, 312, 91, 25);
		contentPane.add(staffMobileNo);
		
		staffPhno_txt = new JTextField();
		staffPhno_txt.setBounds(230, 312, 159, 23);
		contentPane.add(staffPhno_txt);
		staffPhno_txt.setColumns(10);
		
		JLabel staffEmailID = new JLabel("Email ID");
		staffEmailID.setFont(new Font("Tahoma", Font.PLAIN, 12));
		staffEmailID.setBounds(85, 396, 78, 25);
		contentPane.add(staffEmailID);
		
		staffEmail_txt = new JTextField();
		staffEmail_txt.setBounds(230, 379, 159, 25);
		contentPane.add(staffEmail_txt);
		staffEmail_txt.setColumns(10);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String staffFirstName = null;
	               String staffWorklocation = null;
	               String staffDesignation=null;
	               
	               staffFirstName = staffname_txt.getText();
	               staffWorklocation = stafflocation_txt.getText();
	               staffDesignation=staffdesignation_txt.getText();
	               
	               if ((staffFirstName == null )|| (staffFirstName.equals("")))
	               {
	            	   JOptionPane.showMessageDialog(null, "First name should not be empty");
	               }
	               else if  ((staffWorklocation == null )|| (staffWorklocation.equals("")))
	               {
	            	   JOptionPane.showMessageDialog(null, "Work location should not be empty");
	               }
	               else if  ((staffDesignation == null )|| (staffDesignation.equals(""))) 
	               {
	            	   JOptionPane.showMessageDialog(null, "Designation should not be empty");
	               }
	               else {
				 JOptionPane.showMessageDialog(null, "Customer Detils saved succesfully");
	               }
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(99, 452, 96, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 JOptionPane.showMessageDialog(null, "Details are not saved");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(259, 452, 116, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Dashboard");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dashboard d = new Dashboard();
				d.setVisible(true);
				

				//setVisible(false);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(420, 452, 116, 35);
		contentPane.add(btnNewButton_2);
		
		// TEST COMMENT
	}
}
