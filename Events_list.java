import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.TextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Events_list extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Events_list frame = new Events_list();
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
	public Events_list() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 650, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Dashboard");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dashboard dbs = new Dashboard();
				dbs.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_1.setBounds(10, 10, 117, 29);
		contentPane.add(btnNewButton_1);
		
		//TODO: DB Call to fetch all Events
		ArrayList<AgmsEvent> agmsEvents = new ArrayList<AgmsEvent>();
		try {
            Connection connection = DriverManager.getConnection(JavaDatabaseConnection.dbURL + JavaDatabaseConnection.dbName, 
            		JavaDatabaseConnection.userName, JavaDatabaseConnection.password);
            String query = "SELECT * from " + JavaDatabaseConnection.eventTable + " LIMIT 10";
            Statement sta = connection.createStatement();
            ResultSet rs = sta.executeQuery(query);
            
            while (rs.next()) {
            	AgmsEvent agmsEvent = new AgmsEvent();
            	agmsEvent.eventID = rs.getInt("eventID");
            	agmsEvent.eventTitle = rs.getString("eventName");
            	agmsEvent.eventFee = rs.getInt("eventFee");
            	agmsEvents.add(agmsEvent);
              }
            
            connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
	
		int rowHeight = 35;
		
		for(int i = 0; i < agmsEvents.size(); i++) {
			final int x = i;
			JLabel label = new JLabel(agmsEvents.get(i).eventTitle);
			label.setBounds(30, 60 + (i * rowHeight), 220, 25);
			contentPane.add(label);
			
			JButton viewInfoButton = new JButton("View More Info");
			viewInfoButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Event_info.eventID = agmsEvents.get(x).eventID;
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
					
					// TODO: DB call to add entry in Event Registrations
					try {
			            Connection connection = DriverManager.getConnection(JavaDatabaseConnection.dbURL + JavaDatabaseConnection.dbName, 
			            		JavaDatabaseConnection.userName, JavaDatabaseConnection.password);
			            String query = "INSERT INTO eventregistrartion (eventID, userID, amount) values ('" + agmsEvents.get(x).eventID + "','" + login_page.UserID + "','" + agmsEvents.get(x).eventFee + "')";
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
			bookButton.setBounds(450, 60 + (i * rowHeight), 120, 25);
			contentPane.add(bookButton);
		}
	}
	
	public class AgmsEvent
	{
		public int eventID;
		public String eventTitle;
		public int eventFee;
	}
}
