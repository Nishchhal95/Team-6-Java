import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;

public class Customer_Profile extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		
		ArrayList<AgmsCountry> agmsCountries = new ArrayList<AgmsCountry>();
		ArrayList<AgmsArtisticStyle> agmsArtisticStyles = new ArrayList<AgmsArtisticStyle>();
		AgmsProfile agmsProfile = new AgmsProfile();
		
		//TODO: Fetch Data of the current Event
		if(login_page.UserID == -1) {
			return;
		}
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
		
		try {
            Connection connection = DriverManager.getConnection(JavaDatabaseConnection.dbURL + JavaDatabaseConnection.dbName, 
            		JavaDatabaseConnection.userName, JavaDatabaseConnection.password);
            String query = "SELECT fName, lName, emailAddress, countryName, userPassword from " 
            		+ JavaDatabaseConnection.userTable + " inner join " 
            		+ JavaDatabaseConnection.userAccountTable 
            		+ " ON user.userID = useraccount.userAccountID inner join " 
            		+ JavaDatabaseConnection.countryTable + " ON user.countryID = country.countryID "
            		+ "where userID = " + login_page.UserID;
            Statement sta = connection.createStatement();
            ResultSet rs = sta.executeQuery(query);
            
            while (rs.next()) {
            	agmsProfile.firstName = rs.getString("fName");
            	agmsProfile.lastName = rs.getString("lName");
            	agmsProfile.emailID = rs.getString("emailAddress");
            	agmsProfile.password = rs.getString("userPassword");
            	agmsProfile.countryName = rs.getString("countryName");
              }
            
            connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
		
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
		
		textField = new JTextField(agmsProfile.firstName);
		textField.setBounds(302, 71, 189, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(agmsProfile.lastName);
		textField_1.setBounds(302, 116, 189, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField(agmsProfile.emailID);
		textField_2.setBounds(302, 164, 188, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField(agmsProfile.password);
		textField_3.setBounds(302, 218, 186, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Cancel");
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
		
		JSpinner spinner = new JSpinner();
		String[] countriesArray = new String[agmsCountries.size()];
		for(int i = 0; i < agmsCountries.size(); i++) {
			countriesArray[i] = agmsCountries.get(i).countryName;
		}
		spinner.setModel(new SpinnerListModel(countriesArray));
		spinner.setValue(agmsProfile.countryName);
		spinner.setBounds(302, 274, 188, 26);
		
		contentPane.add(spinner);
		
		JButton btnNewButton_1 = new JButton("Save Changes");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
		            Connection connection = DriverManager.getConnection(JavaDatabaseConnection.dbURL + JavaDatabaseConnection.dbName, 
		            		JavaDatabaseConnection.userName, JavaDatabaseConnection.password);
		            CallableStatement sta = connection.prepareCall("{call UpdateProfile(?, ?, ?, ?, ?, ?)}");
		            sta.setInt(1, login_page.UserID);
		            sta.setString(2, textField.getText().trim());
		            sta.setString(3, textField_1.getText().trim());
		            sta.setString(4, textField_2.getText().trim());
		            sta.setString(5, textField_3.getText().trim());
		            sta.setString(6, spinner.getValue().toString());
		            sta.execute();
		            connection.close();
		        } catch (Exception exception) {
		            exception.printStackTrace();
		        }
				JOptionPane.showMessageDialog(null, "Changes Saved! ");
			}
		});
		
		btnNewButton_1.setBounds(406, 436, 117, 29);
		contentPane.add(btnNewButton_1);
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
	
	public class AgmsProfile
	{
		public String firstName;
		public String lastName;
		public String emailID;
		public String password;
		public String countryName;
		public String artisticStyleName;
	}
}
