import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
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
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.Choice;
import java.awt.List;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;

public class Registration_page extends JFrame {
	private JTextField userNameField;
	private JTextField lastNameField;
	private JTextField emailIDField;
	private JTextField passwordField;
	private JTextField firstNameField;
	private JTextField addressField;
	private JTextField dobField;

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
		getContentPane().setLayout(null);
		
		ArrayList<AgmsCountry> agmsCountries = new ArrayList<AgmsCountry>();
		ArrayList<AgmsArtisticStyle> agmsArtisticStyles = new ArrayList<AgmsArtisticStyle>();
		
		//TODO: Fetch Data of the current Event
		try {
            Connection connection = DriverManager.getConnection(JavaDatabaseConnection.dbURL + JavaDatabaseConnection.dbName, 
            		JavaDatabaseConnection.userName, JavaDatabaseConnection.password);
            String query = "SELECT * from " + JavaDatabaseConnection.countryTable;
            Statement sta = connection.createStatement();
            ResultSet rs = sta.executeQuery(query);
            
            while (rs.next()) {
            	AgmsCountry agmsCountry = new AgmsCountry();
            	agmsCountry.countryID = rs.getInt("countryID");
            	agmsCountry.countryName = rs.getString("countryName");
            	agmsCountries.add(agmsCountry);
              }
            
            connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
		
		try {
            Connection connection = DriverManager.getConnection(JavaDatabaseConnection.dbURL + JavaDatabaseConnection.dbName, 
            		JavaDatabaseConnection.userName, JavaDatabaseConnection.password);
            String query = "SELECT * from " + JavaDatabaseConnection.artisticStyleTable;
            Statement sta = connection.createStatement();
            ResultSet rs = sta.executeQuery(query);
            
            while (rs.next()) {
            	AgmsArtisticStyle agmsArtisticStyle = new AgmsArtisticStyle();
            	agmsArtisticStyle.artisticStyleID = rs.getInt("artisticStyleID");
            	agmsArtisticStyle.artisticStyleName = rs.getString("artisticStyleName");
            	agmsArtisticStyles.add(agmsArtisticStyle);
              }
            
            connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
		
		JLabel reg_name = new JLabel("UserName");
		reg_name.setBounds(94, 69, 63, 27);
		getContentPane().add(reg_name);
		
		JLabel regi_lname = new JLabel("Last name");
		regi_lname.setBounds(94, 191, 63, 15);
		getContentPane().add(regi_lname);
		
		JLabel email = new JLabel("Email Id");
		email.setBounds(94, 234, 57, 15);
		getContentPane().add(email);
		
		JLabel pass_re = new JLabel("Password");
		pass_re.setBounds(94, 112, 57, 15);
		getContentPane().add(pass_re);
		
		JLabel lblNewLabel_5 = new JLabel("Preference");
		lblNewLabel_5.setBounds(94, 372, 73, 15);
		getContentPane().add(lblNewLabel_5);
		
		JLabel header2 = new JLabel("Registration Profile");
		header2.setBounds(262, 25, 171, 15);
		getContentPane().add(header2);
		
		userNameField = new JTextField();
		userNameField.setBounds(179, 69, 343, 27);
		getContentPane().add(userNameField);
		userNameField.setColumns(10);
		
		lastNameField = new JTextField();
		lastNameField.setBounds(179, 185, 343, 27);
		getContentPane().add(lastNameField);
		lastNameField.setColumns(10);
		
		emailIDField = new JTextField();
		emailIDField.setBounds(179, 228, 343, 27);
		getContentPane().add(emailIDField);
		emailIDField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Country");
		lblNewLabel_4.setBounds(94, 345, 57, 15);
		getContentPane().add(lblNewLabel_4);
		
		passwordField = new JTextField();
		passwordField.setBounds(179, 106, 343, 27);
		getContentPane().add(passwordField);
		passwordField.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(179, 338, 280, 22);
		String[] countriesArray = new String[agmsCountries.size()];
		for(int i = 0; i < agmsCountries.size(); i++) {
			countriesArray[i] = agmsCountries.get(i).countryName;
		}
		spinner.setModel(new SpinnerListModel(countriesArray));
		spinner.setValue(countriesArray[agmsCountries.size() - 1]);
		getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(179, 370, 280, 22);
		String[] artisticStyleArray = new String[agmsArtisticStyles.size()];
		for(int i = 0; i < agmsArtisticStyles.size(); i++) {
			artisticStyleArray[i] = agmsArtisticStyles.get(i).artisticStyleName;
		}
		spinner_1.setModel(new SpinnerListModel(artisticStyleArray));
		spinner_1.setValue(artisticStyleArray[agmsArtisticStyles.size() - 1]);
		getContentPane().add(spinner_1);
		
		JLabel reg_name_1 = new JLabel("First Name");
		reg_name_1.setBounds(94, 148, 63, 27);
		getContentPane().add(reg_name_1);
		
		firstNameField = new JTextField();
		firstNameField.setColumns(10);
		firstNameField.setBounds(179, 148, 343, 27);
		getContentPane().add(firstNameField);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(94, 306, 57, 15);
		getContentPane().add(lblAddress);
		
		addressField = new JTextField();
		addressField.setColumns(10);
		addressField.setBounds(179, 300, 343, 27);
		getContentPane().add(addressField);
		
		dobField = new JTextField();
		dobField.setColumns(10);
		dobField.setBounds(179, 259, 343, 27);
		getContentPane().add(dobField);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setBounds(94, 265, 57, 15);
		getContentPane().add(lblDob);
		
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ss = null;
	            String m_password = null;
	               
	              
						ss = userNameField.getText();
						m_password = passwordField.getText();
						
						if((ss == null) || (ss.equals(""))) {
				               JOptionPane.showMessageDialog(null, "Invalid Email!");
				               
				             }
				             else if(m_password == null) {
				                    JOptionPane.showMessageDialog(null, "Password cannot be empty!");
				                   
				             }
				             
						else
						{	
							try {
					            Connection connection = DriverManager.getConnection(JavaDatabaseConnection.dbURL + JavaDatabaseConnection.dbName, 
					            		JavaDatabaseConnection.userName, JavaDatabaseConnection.password);
					            CallableStatement sta = connection.prepareCall("{call addUserAccount(?, ?, ?, ?, ?, ?, ?, ?, ?)}");
					            sta.setString(1, userNameField.getText().trim());
					            sta.setString(2, passwordField.getText().trim());
					            sta.setString(3, firstNameField.getText().trim());
					            sta.setString(4, lastNameField.getText().trim());
					            sta.setString(5, addressField.getText().trim());
					            sta.setString(6, spinner.getValue().toString());
					            sta.setString(7, emailIDField.getText().trim());
					            sta.setString(8, dobField.getText().trim());
					            sta.setString(9, spinner_1.getValue().toString());
					            sta.execute();
					            connection.close();
					        } catch (Exception exception) {
					            exception.printStackTrace();
					        }
					        JOptionPane.showMessageDialog(null, "Profile Created");
					        login_page e1 = new login_page();
							e1.setVisible(true);
							setVisible(false);
							dispose();
						}   
				
			}
		});
		btnNewButton.setBounds(242, 426, 120, 27);
		getContentPane().add(btnNewButton);
	}
	
	public class AgmsCountry
	{
		public int countryID;
		public String countryName;
	}
	
	public class AgmsArtisticStyle
	{
		public int artisticStyleID;
		public String artisticStyleName;
	}

}
