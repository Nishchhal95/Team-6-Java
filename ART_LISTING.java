import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ART_LISTING extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ART_LISTING frame = new ART_LISTING();
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
	public ART_LISTING() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 650, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("Dashboard");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dashboard D4 = new Dashboard();
				D4.setVisible(true);
				
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_4.setBounds(142, 376, 117, 29);
		contentPane.add(btnNewButton_4);
				
		//TODO: DB Call to fetch all Events
				ArrayList<AgmsArt> agmsArts = new ArrayList<AgmsArt>();
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
		            		+ JavaDatabaseConnection.artisticStyleTable + ".artisticStyleID = " 
		            		+ JavaDatabaseConnection.artisticStyleTable + ".artisticStyleID" 
		            		+ " LIMIT 10";
		            Statement sta = connection.createStatement();
		            ResultSet rs = sta.executeQuery(query);
		            System.out.println(rs.ne);
		            
		            while (rs.next()) {
		            	AgmsArt agmsArt = new AgmsArt();
		            	agmsArt.artId = rs.getInt("artID");
		            	agmsArt.title = rs.getString("title");
		            	agmsArt.desc = rs.getString("description");
		            	agmsArt.price = rs.getInt("price");
		            	agmsArt.artistFullName = rs.getString("fullName");
		            	agmsArt.status = rs.getString("statusType");
		            	agmsArt.artisticStyle = rs.getString("artisticStyleName");
		            	agmsArts.add(agmsArt);
		              }
		            
		            connection.close();
		        } catch (Exception exception) {
		            exception.printStackTrace();
		        }
			
				int rowHeight = 35;
				
				for(int i = 0; i < agmsArts.size(); i++) {
					final int x = i;
					JLabel label = new JLabel(agmsArts.get(i).title);
					label.setBounds(30, 60 + (i * rowHeight), 220, 25);
					contentPane.add(label);
					
					JButton viewInfoButton = new JButton("View More Info");
					viewInfoButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							Event_info.eventID = agmsArts.get(x).artId;
							Event_info eventInfo = new Event_info();
							eventInfo.setVisible(true);

							setVisible(false);
							dispose();
						}
					});
					viewInfoButton.setBounds(300, 60 + (i * rowHeight), 120, 25);
					contentPane.add(viewInfoButton);
					
					JButton bookButton = new JButton("Book Ticket");
					bookButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							JOptionPane.showMessageDialog(null,"Ticket Booked");
							// TODO: DB call to add entry in Event Registrations
//							try {
//					            Connection connection = DriverManager.getConnection(JavaDatabaseConnection.dbURL + JavaDatabaseConnection.dbName, 
//					            		JavaDatabaseConnection.userName, JavaDatabaseConnection.password);
//					            String query = "INSERT INTO eventregistrartion (eventID, userID, amount) values ('" + agmsArts.get(x).eventID + "','" + login_page.UserID + "','" + agmsArts.get(x).eventFee + "')";
//								Statement sta = connection.createStatement();
//								int x = sta.executeUpdate(query);
//								if (x == 0) {
//								JOptionPane.showMessageDialog(null, "This is alredy exist");
//								} else {
//								JOptionPane.showMessageDialog(null,"Ticket Booked");
//								}
//								connection.close();
//								} catch (Exception exception) {
//								exception.printStackTrace();
//								}
						}
					});
					bookButton.setBounds(450, 60 + (i * rowHeight), 120, 25);
					contentPane.add(bookButton);
				}
	}
	
	public class AgmsArt
	{
		public int artId;
		public String title;
		public String artistFullName;
		public String desc;
		public int price;
		public String status;
		public String artisticStyle;
	}

}
