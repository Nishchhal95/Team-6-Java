import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Event_info extends JFrame {

	public static int eventID = -1;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Event_info frame = new Event_info();
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
	public Event_info() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 612, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_8 = new JButton("Back");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Events_list eventListing = new Events_list();
				eventListing.setVisible(true);

				setVisible(false);
				dispose();
			}
			
		});
		btnNewButton_8.setBounds(217, 374, 117, 29);
		contentPane.add(btnNewButton_8);
		
		//TODO: Fetch Data of the current Event
		if(eventID == -1) {
			return;
		}
		AgmsEventFull agmsEventFull = new AgmsEventFull();
		try {
            Connection connection = DriverManager.getConnection(JavaDatabaseConnection.dbURL + JavaDatabaseConnection.dbName, 
            		JavaDatabaseConnection.userName, JavaDatabaseConnection.password);
            String query = "SELECT * from " + JavaDatabaseConnection.eventTable + " where eventID = " + "'" + eventID + "'";
            Statement sta = connection.createStatement();
            ResultSet rs = sta.executeQuery(query);
            
            while (rs.next()) {
            	agmsEventFull.eventTitle = rs.getString("eventName");
            	agmsEventFull.eventDesc = rs.getString("eventDescription");
            	agmsEventFull.eventStartDate = rs.getString("eventStartDate");
            	agmsEventFull.eventEndDate = rs.getString("eventEndDate");
            	agmsEventFull.eventFee = rs.getInt("eventFee");
              }
            
            connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
		
		JLabel eventTitle = new JLabel(agmsEventFull.eventTitle);
		eventTitle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		eventTitle.setHorizontalAlignment(SwingConstants.CENTER);
		eventTitle.setBounds(139, 21, 300, 40);
		contentPane.add(eventTitle);
		
		JLabel eventDescription = new JLabel(agmsEventFull.eventDesc);
		eventDescription.setFont(new Font("Tahoma", Font.PLAIN, 12));
		eventDescription.setVerticalAlignment(SwingConstants.TOP);
		eventDescription.setHorizontalAlignment(SwingConstants.LEFT);
		eventDescription.setBounds(61, 75, 472, 83);
		contentPane.add(eventDescription);
		
		JLabel eventStartDate = new JLabel("From : " + agmsEventFull.eventStartDate);
		eventStartDate.setBounds(60, 200, 120, 20);
		contentPane.add(eventStartDate);
		
		JLabel eventEndDate = new JLabel("To : " + agmsEventFull.eventEndDate);
		eventEndDate.setBounds(400, 200, 120, 20);
		contentPane.add(eventEndDate);
		
		JLabel eventFee = new JLabel("Entry Fee : " + agmsEventFull.eventFee);
		eventFee.setBounds(217, 235, 120, 20);
		contentPane.add(eventFee);
		
		JButton bookButton = new JButton("Book");
		bookButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// TODO: DB call to add entry in Event Registrations
				try {
		            Connection connection = DriverManager.getConnection(JavaDatabaseConnection.dbURL + JavaDatabaseConnection.dbName, 
		            		JavaDatabaseConnection.userName, JavaDatabaseConnection.password);
		            String query = "INSERT INTO eventregistrartion (eventID, userID, amount) values ('" + eventID + "','" + login_page.UserID + "','" + agmsEventFull.eventFee + "')";
					Statement sta = connection.createStatement();
					int x = sta.executeUpdate(query);
					if (x == 0) {
					JOptionPane.showMessageDialog(null, "This is alredy exist");
					} else {
					JOptionPane.showMessageDialog(null,"Ticket Booked");
					}
					connection.close();
					} catch (Exception exception) {
					exception.printStackTrace();
					}
			}
		});
		bookButton.setBounds(231, 301, 85, 21);
		contentPane.add(bookButton);
	}
	
	public class AgmsEventFull
	{
		public int eventID;
		public String eventTitle;
		public String eventDesc;
		public String eventStartDate;
		public String eventEndDate;
		public int eventFee;
	}

}
