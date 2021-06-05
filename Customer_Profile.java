import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Customer_Profile extends JFrame {

	private JPanel contentPane;
	private JTextField fn;
	private JTextField ln;
	private JTextField em;
	private JTextField pa;
	private JTextField cn;
	private JTextField textField_5;
	private JTextField at;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_Profile frame = new Customer_Profile();
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
	public Customer_Profile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 650, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer Profile");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
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
		
		fn = new JTextField();
		fn.setBounds(306, 71, 185, 26);
		contentPane.add(fn);
		fn.setColumns(10);
		
		ln = new JTextField();
		ln.setBounds(308, 116, 183, 26);
		contentPane.add(ln);
		ln.setColumns(10);
		
		em = new JTextField();
		em.setBounds(310, 164, 180, 26);
		contentPane.add(em);
		em.setColumns(10);
		
		pa = new JTextField();
		pa.setBounds(312, 218, 176, 26);
		contentPane.add(pa);
		pa.setColumns(10);
		
		cn = new JTextField();
		cn.setBounds(314, 270, 176, 26);
		contentPane.add(cn);
		cn.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(315, 322, 173, 26);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("All Transaction");
		lblNewLabel_7.setBounds(155, 378, 110, 16);
		contentPane.add(lblNewLabel_7);
		
		at = new JTextField();
		at.setBounds(314, 371, 175, 26);
		contentPane.add(at);
		at.setColumns(10);
		
		JButton btnNewButton = new JButton("Dashboard");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dashboard d = new Dashboard();
				d.setVisible(true);
				

				setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBounds(432, 448, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Details are not saved");
			}
		});
		btnNewButton_1.setBounds(279, 448, 110, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Save");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String fname = null;
	               String EmailId = null;
	               String Password=null;
	               
	               fname = fn.getText();
	               EmailId = em.getText();
	               Password=pa.getText();
	               
	               if ((fname == null )|| (fname.equals("")))
	               {
	            	   JOptionPane.showMessageDialog(null, "First name should not be empty");
	               }
	               else if  ((EmailId == null )|| (EmailId.equals("")))
	               {
	            	   JOptionPane.showMessageDialog(null, "EmailId should not be empty");
	               }
	               else if  ((Password == null )|| (Password.equals(""))) 
	               {
	            	   JOptionPane.showMessageDialog(null, "Password should not be empty");
	               }
	               else {
				 JOptionPane.showMessageDialog(null, "Customer Detils saved succesfully");
	               }
				//setVisible(false);
				
				
			}
		});
		btnNewButton_2.setBounds(142, 448, 94, 29);
		contentPane.add(btnNewButton_2);
	}
}
