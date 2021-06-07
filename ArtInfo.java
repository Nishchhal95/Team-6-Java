import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class ArtInfo extends JFrame {

	public static int artID = -1;
	private JPanel buyNowButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArtInfo frame = new ArtInfo();
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
	public ArtInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 800, 600);
		buyNowButton = new JPanel();
		buyNowButton.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(buyNowButton);
		buyNowButton.setLayout(null);
		
		//TODO: Fetch Data from DB
		if(artID == -1) {
			return;
		}
		AgmsArtFull agmsArtFull = new AgmsArtFull();
		try {
            Connection connection = DriverManager.getConnection(JavaDatabaseConnection.dbURL + JavaDatabaseConnection.dbName, 
            		JavaDatabaseConnection.userName, JavaDatabaseConnection.password);
            String query = "SELECT artID, title, description, price, concat(fName, ' ', lName) as fullName, statusType, artisticStyleName "
            		+ "from " + JavaDatabaseConnection.userTable + " inner join " + JavaDatabaseConnection.artTable 
            		+" ON " + JavaDatabaseConnection.userTable + ".userID = " 
            		+ JavaDatabaseConnection.artTable +".artistID "
            		+ "inner join " + JavaDatabaseConnection.StatusTypeTable +" ON " 
            		+ JavaDatabaseConnection.artTable + ".statusID = " 
            		+ JavaDatabaseConnection.StatusTypeTable +".statusID "
            		+ "inner join " + JavaDatabaseConnection.artisticStyleTable + " ON "
            		+ JavaDatabaseConnection.artTable + ".artisticStyleID = " 
            		+ JavaDatabaseConnection.artisticStyleTable + ".artisticStyleID" 
            		+ " where artID = " + artID;
            Statement sta = connection.createStatement();
            ResultSet rs = sta.executeQuery(query);
            
            while (rs.next()) {
            	agmsArtFull.artTitle = rs.getString("title");
            	agmsArtFull.artDesc = rs.getString("description");
            	agmsArtFull.artistName = rs.getString("fullName");
            	agmsArtFull.artStatus = rs.getString("statusType");
            	agmsArtFull.artisticStyleName = rs.getString("artisticStyleName");
            	agmsArtFull.artPrice = rs.getInt("price");
              }
            
            connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
		
		JLabel artTitle = new JLabel(agmsArtFull.artTitle);
		artTitle.setHorizontalAlignment(SwingConstants.CENTER);
		artTitle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		artTitle.setBounds(280, 30, 200, 50);
		buyNowButton.add(artTitle);
		
		JLabel artDesc = new JLabel(agmsArtFull.artDesc);
		artDesc.setVerticalAlignment(SwingConstants.TOP);
		artDesc.setHorizontalAlignment(SwingConstants.LEFT);
		artDesc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		artDesc.setBounds(119, 79, 554, 184);
		buyNowButton.add(artDesc);
		
		JLabel artistName = new JLabel("Artist: " + agmsArtFull.artistName);
		artistName.setBounds(80, 330, 220, 25);
		buyNowButton.add(artistName);
		
		JLabel status = new JLabel("Status: " + agmsArtFull.artStatus);
		status.setBounds(306, 452, 125, 35);
		buyNowButton.add(status);
		
		JButton btnNewButton = new JButton("Buy now for $" + agmsArtFull.artPrice);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Art Purchased");
			}
			
		});
		btnNewButton.setBounds(281, 499, 150, 20);
		buyNowButton.add(btnNewButton);
		btnNewButton.setEnabled(agmsArtFull.artStatus.equals("sold") ? false : true);
		
		JLabel artisticStyle = new JLabel("Artistic Style: " + agmsArtFull.artisticStyleName);
		artisticStyle.setBounds(500, 330, 220, 25);
		buyNowButton.add(artisticStyle);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ART_LISTING artListing = new ART_LISTING();
				artListing.setVisible(true);

				setVisible(false);
				dispose();
			}
			
		});
		backButton.setBounds(10, 10, 85, 21);
		buyNowButton.add(backButton);
	}
	
	public class AgmsArtFull
	{
		public int artID;
		public String artTitle;
		public String artDesc;
		public String artistName;
		public String artStatus;
		public String artisticStyleName;
		public int artPrice;
	}
}
