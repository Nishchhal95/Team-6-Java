import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ArtistListing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArtistListing frame = new ArtistListing();
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
	public ArtistListing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ArrayList<AgmsArtist> agmsArtists = new ArrayList<AgmsArtist>();
		try {
            Connection connection = DriverManager.getConnection(JavaDatabaseConnection.dbURL + JavaDatabaseConnection.dbName, 
            		JavaDatabaseConnection.userName, JavaDatabaseConnection.password);
            String query = "SELECT userID, concat(fName, ' ', lName) as fullName from " + JavaDatabaseConnection.userTable + " where userType = 1"
            		+ " LIMIT 10";
            Statement sta = connection.createStatement();
            ResultSet rs = sta.executeQuery(query);
            
            while (rs.next()) {
            	AgmsArtist agmsArtist = new AgmsArtist();
            	agmsArtist.artistID = rs.getInt("userID");
            	agmsArtist.artistName = rs.getString("fullName");
            	agmsArtists.add(agmsArtist);
              }
            
            connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
	
		int rowHeight = 35;
		
		for(int i = 0; i < agmsArtists.size(); i++) {
			final int x = i;
			JLabel label = new JLabel(agmsArtists.get(i).artistName);
			label.setBounds(30, 60 + (i * rowHeight), 220, 25);
			contentPane.add(label);
			
			JButton viewInfoButton = new JButton("View More Info");
			viewInfoButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					ArtistInfo.artistID = agmsArtists.get(x).artistID;
					ArtistInfo artistInfo = new ArtistInfo();
					artistInfo.setVisible(true);

					setVisible(false);
					dispose();
				}
			});
			viewInfoButton.setBounds(300, 60 + (i * rowHeight), 120, 25);
			contentPane.add(viewInfoButton);
			
//			JButton bookButton = new JButton("Buy");
//			bookButton.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent e) {
//					
//					JOptionPane.showMessageDialog(null,"Art Purchased.");
//					// TODO: DB call to add entry in Event Registrations
////					try {
////			            Connection connection = DriverManager.getConnection(JavaDatabaseConnection.dbURL + JavaDatabaseConnection.dbName, 
////			            		JavaDatabaseConnection.userName, JavaDatabaseConnection.password);
////			            String query = "INSERT INTO eventregistrartion (eventID, userID, amount) values ('" + agmsArts.get(x).eventID + "','" + login_page.UserID + "','" + agmsArts.get(x).eventFee + "')";
////						Statement sta = connection.createStatement();
////						int x = sta.executeUpdate(query);
////						if (x == 0) {
////						JOptionPane.showMessageDialog(null, "This is alredy exist");
////						} else {
////						JOptionPane.showMessageDialog(null,"Ticket Booked");
////						}
////						connection.close();
////						} catch (Exception exception) {
////						exception.printStackTrace();
////						}
//				}
//			});
//			bookButton.setBounds(450, 60 + (i * rowHeight), 80, 25);
//			contentPane.add(bookButton);
		}
	}
	
	public class AgmsArtist
	{
		public int artistID;
		public String artistName;
	}

}
