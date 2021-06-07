import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class ArtistInfo extends JFrame {

	public static int artistID = -1;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArtistInfo frame = new ArtistInfo();
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
	public ArtistInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//TODO: Fetch Data of the current Event
				if(artistID == -1) {
					return;
				}
				AgmsArtistFull agmsEventFull = new AgmsArtistFull();
				try {
		            Connection connection = DriverManager.getConnection(JavaDatabaseConnection.dbURL + JavaDatabaseConnection.dbName, 
		            		JavaDatabaseConnection.userName, JavaDatabaseConnection.password);
		            String query = "SELECT userID, userType, concat(fName, ' ', lName) as fullName, "
		            		+ "dob, user.countryID, countryOfBirthID, c.countryName as countryOfBirthName, "
		            		+ "co.countryName as currentCountry from user inner join artist ON user.userID = artist.artistID "
		            		+ "inner join country c ON c.countryID = artist.countryOfBirthID inner join country co ON user.countryID = co.countryID;";
		            Statement sta = connection.createStatement();
		            ResultSet rs = sta.executeQuery(query);
		            
		            while (rs.next()) {
		            	agmsEventFull.artistID = rs.getInt("userID");
		            	agmsEventFull.artistName = rs.getString("fullName");
		            	agmsEventFull.artistDOB = rs.getString("dob");
		            	agmsEventFull.artistCountryOfBirth = rs.getString("countryOfBirthName");
		            	agmsEventFull.artistCurrentCountry = rs.getString("currentCountry");
		              }
		            
		            connection.close();
		        } catch (Exception exception) {
		            exception.printStackTrace();
		        }
				
				try {
		            Connection connection = DriverManager.getConnection(JavaDatabaseConnection.dbURL + JavaDatabaseConnection.dbName, 
		            		JavaDatabaseConnection.userName, JavaDatabaseConnection.password);
		            String query = "SELECT artisttostyle.artisticStyleID, "
		            		+ "artisticStyleName from artisttostyle inner join "
		            		+ "artisticstyle ON artisttostyle.artisticStyleID = artisticstyle.artisticStyleID"
		            		+ " where artisttostyle.artistID = " + agmsEventFull.artistID;
		            Statement sta = connection.createStatement();
		            ResultSet rs = sta.executeQuery(query);
		            
		            while (rs.next()) {
		            	agmsEventFull.artistArtisticStyles.add(rs.getString("artisticStyleName"));
		              }
		            
		            connection.close();
		        } catch (Exception exception) {
		            exception.printStackTrace();
		        }
				
				String artStyleConcat = "";
				
				for(int i = 0; i < agmsEventFull.artistArtisticStyles.size(); i++) {
					artStyleConcat += agmsEventFull.artistArtisticStyles.get(i) + (i == agmsEventFull.artistArtisticStyles.size() - 1 ? "" : ", ");
				}
				
				JLabel artistName = new JLabel(agmsEventFull.artistName);
				artistName.setBounds(159, 66, 495, 31);
				contentPane.add(artistName);
				
				JLabel artistDOB = new JLabel(agmsEventFull.artistDOB);
				artistDOB.setBounds(159, 109, 495, 31);
				contentPane.add(artistDOB);
				
				JLabel artistCountryOfBirth = new JLabel(agmsEventFull.artistCountryOfBirth);
				artistCountryOfBirth.setBounds(159, 159, 495, 31);
				contentPane.add(artistCountryOfBirth);
				
				JLabel artistCurrentCountry = new JLabel(agmsEventFull.artistCurrentCountry);
				artistCurrentCountry.setBounds(159, 211, 495, 31);
				contentPane.add(artistCurrentCountry);
				
				JLabel artistArtStyles = new JLabel(artStyleConcat);
				artistArtStyles.setBounds(159, 267, 495, 31);
				contentPane.add(artistArtStyles);
				
				JLabel lblArtistName = new JLabel("Artist Name :");
				lblArtistName.setBounds(33, 66, 107, 31);
				contentPane.add(lblArtistName);
				
				JLabel lblDob = new JLabel("DOB");
				lblDob.setBounds(33, 109, 107, 31);
				contentPane.add(lblDob);
				
				JLabel lblCountryOfBirth = new JLabel("Country of Birth");
				lblCountryOfBirth.setBounds(33, 159, 107, 31);
				contentPane.add(lblCountryOfBirth);
				
				JLabel lblCurrentCountry = new JLabel("Current Country");
				lblCurrentCountry.setBounds(33, 211, 107, 31);
				contentPane.add(lblCurrentCountry);
				
				JLabel lblArtstyles = new JLabel("Artstyles");
				lblArtstyles.setBounds(33, 267, 107, 31);
				contentPane.add(lblArtstyles);
				
	}
	
	public class AgmsArtistFull
	{
		public int artistID;
		public String artistName;
		public String artistDOB;
		public String artistCountryOfBirth;
		public String artistCurrentCountry;
		public ArrayList<String> artistArtisticStyles = new ArrayList<String>();;
	}
}
