import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Choice;
import java.awt.List;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration_page extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_page frame = new Registration_page();
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
	public Registration_page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 650, 500);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(getContentPane(), popupMenu);
		getContentPane().setLayout(null);
		
		JLabel reg_name = new JLabel("First Name");
		reg_name.setBounds(94, 69, 63, 27);
		getContentPane().add(reg_name);
		
		JLabel regi_lname = new JLabel("Last name");
		regi_lname.setBounds(94, 118, 63, 15);
		getContentPane().add(regi_lname);
		
		JLabel email = new JLabel("Email Id");
		email.setBounds(94, 161, 57, 15);
		getContentPane().add(email);
		
		JLabel pass_re = new JLabel("Password");
		pass_re.setBounds(94, 203, 57, 15);
		getContentPane().add(pass_re);
		
		JLabel lblNewLabel_5 = new JLabel("Preference");
		lblNewLabel_5.setBounds(94, 287, 73, 15);
		getContentPane().add(lblNewLabel_5);
		
		JLabel header2 = new JLabel("Registration Profile");
		header2.setBounds(262, 25, 171, 15);
		getContentPane().add(header2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Pop Art");
		chckbxNewCheckBox.setBounds(179, 350, 110, 18);
		getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Modern");
		chckbxNewCheckBox_1.setBounds(301, 350, 110, 18);
		getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Fantasy");
		chckbxNewCheckBox_2.setBounds(423, 350, 110, 18);
		getContentPane().add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Abstract");
		chckbxNewCheckBox_3.setBounds(179, 320, 110, 18);
		getContentPane().add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Contemporary");
		chckbxNewCheckBox_4.setBounds(301, 320, 110, 18);
		getContentPane().add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Graffiti");
		chckbxNewCheckBox_5.setBounds(423, 320, 110, 18);
		getContentPane().add(chckbxNewCheckBox_5);
		
		JButton btnNewButton = new JButton("Complete Registration");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ss = null;
	            String m_password = null;
	               
	              
						ss = textField.getText();
						m_password = passwordField.getText();
						
						if((ss == null) || (ss.equals(""))) {
				               JOptionPane.showMessageDialog(null, "Invalid Email!");
				               
				             }
				             else if(m_password == null) {
				                    JOptionPane.showMessageDialog(null, "Password cannot be empty!");
				                   
				             }
				             
						else
						{	
					
					        JOptionPane.showMessageDialog(null, "Changes Saved!");
					        Dashboard e1 = new Dashboard();
							e1.setVisible(true);
							setVisible(false);
							dispose();
						}   
				
			}
		});
		btnNewButton.setBounds(234, 396, 177, 27);
		getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(179, 69, 343, 27);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(179, 112, 343, 27);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(179, 155, 343, 27);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JPopupMenu popupMenu_1 = new JPopupMenu();
		popupMenu_1.setBounds(179, 236, 200, 50);
		getContentPane().add(popupMenu_1);
		
		JComboBox location_reg = new JComboBox();
		location_reg.setMaximumRowCount(100);
		location_reg.setModel(new DefaultComboBoxModel(new String[] {"Gabon", "Gambia, The", "Georgia", "Germany", "Ghana", "Grand Duchy of Tuscany, The*", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana"}));
		location_reg.setBounds(179, 241, 217, 25);
		getContentPane().add(location_reg);
		
		JLabel lblNewLabel_4 = new JLabel("Country");
		lblNewLabel_4.setBounds(94, 246, 57, 15);
		getContentPane().add(lblNewLabel_4);
		
		passwordField = new JTextField();
		passwordField.setBounds(179, 197, 343, 27);
		getContentPane().add(passwordField);
		passwordField.setColumns(10);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
