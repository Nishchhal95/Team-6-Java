import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class EventDetails extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventDetails frame = new EventDetails();
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
	public EventDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel eventName = new JLabel("Event Name");
		eventName.setHorizontalAlignment(SwingConstants.CENTER);
		eventName.setBounds(40, 50, 111, 31);
		contentPane.add(eventName);
		
		JLabel eventFee = new JLabel("EventFee");
		eventFee.setHorizontalAlignment(SwingConstants.CENTER);
		eventFee.setBounds(176, 50, 111, 31);
		contentPane.add(eventFee);
		
		JLabel lblEventcost = new JLabel("EventCost");
		lblEventcost.setHorizontalAlignment(SwingConstants.CENTER);
		lblEventcost.setBounds(297, 50, 111, 31);
		contentPane.add(lblEventcost);
		
		JLabel lblEventregistrations = new JLabel("EventRegistrations");
		lblEventregistrations.setHorizontalAlignment(SwingConstants.CENTER);
		lblEventregistrations.setBounds(418, 50, 111, 31);
		contentPane.add(lblEventregistrations);
		
		JLabel lblEventRevenue = new JLabel("Event Revenue");
		lblEventRevenue.setHorizontalAlignment(SwingConstants.CENTER);
		lblEventRevenue.setBounds(539, 50, 111, 31);
		contentPane.add(lblEventRevenue);
		
		JLabel lblProfitlossnpnl = new JLabel("Profit/Loss/NPNL");
		lblProfitlossnpnl.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfitlossnpnl.setBounds(660, 50, 111, 31);
		contentPane.add(lblProfitlossnpnl);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard d = new Dashboard();
				d.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 10, 85, 21);
		contentPane.add(btnNewButton);
		
		ArrayList<AgmsAdminEventDetail> eventDetails = new ArrayList<AgmsAdminEventDetail>();
		try {
            Connection connection = DriverManager.getConnection(JavaDatabaseConnection.dbURL + JavaDatabaseConnection.dbName, 
            		JavaDatabaseConnection.userName, JavaDatabaseConnection.password);
            CallableStatement statement = connection.prepareCall("{call getAdminEventDetails()}");
            boolean hadResults = statement.execute();
            while (hadResults) {
                ResultSet resultSet = statement.getResultSet();
                // process result set
                while (resultSet.next()) {
                	AgmsAdminEventDetail eventDetail = new AgmsAdminEventDetail();
                	eventDetail.eventName = resultSet.getString("eventName");
                	eventDetail.eventFee = resultSet.getInt("eventFee");
                	eventDetail.eventCost = resultSet.getInt("eventCost");
                	eventDetail.eventRegistrations = resultSet.getInt("eventRegistrations");
                	eventDetail.eventRevenue = resultSet.getInt("eventRevenue");
                	eventDetail.eventFinalRevenue = resultSet.getInt("eventFinalRevenue");
                	eventDetails.add(eventDetail);
                }
                hadResults = statement.getMoreResults();
            }
            statement.close();
            connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
	
		int rowHeight = 35;
		
		for(int i = 0; i < eventDetails.size(); i++) {
			final int x = i;
			JLabel eventName_1 = new JLabel(eventDetails.get(x).eventName);
			eventName_1.setHorizontalAlignment(SwingConstants.LEFT);
			eventName_1.setBounds(20, 99 + (i * rowHeight), 200, 31);
			contentPane.add(eventName_1);
			
			JLabel eventFee_1 = new JLabel("" + eventDetails.get(x).eventFee);
			eventFee_1.setHorizontalAlignment(SwingConstants.CENTER);
			eventFee_1.setBounds(176, 99 + (i * rowHeight), 111, 31);
			contentPane.add(eventFee_1);
			
			JLabel lblEventcost_1 = new JLabel("" + eventDetails.get(x).eventCost);
			lblEventcost_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblEventcost_1.setBounds(297, 99 + (i * rowHeight), 111, 31);
			contentPane.add(lblEventcost_1);
			
			JLabel lblEventregistrations_1 = new JLabel("" + eventDetails.get(x).eventRegistrations);
			lblEventregistrations_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblEventregistrations_1.setBounds(418, 99 + (i * rowHeight), 111, 31);
			contentPane.add(lblEventregistrations_1);
			
			JLabel lblEventRevenue_1 = new JLabel("" + eventDetails.get(x).eventRevenue);
			lblEventRevenue_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblEventRevenue_1.setBounds(539, 99 + (i * rowHeight), 111, 31);
			contentPane.add(lblEventRevenue_1);
			
			String finalRevenue = "NPNL 0";
			if(eventDetails.get(x).eventFinalRevenue > 0) {
				finalRevenue = "Profit of " + eventDetails.get(x).eventFinalRevenue;
			}
			else if(eventDetails.get(x).eventFinalRevenue < 0) {
				finalRevenue = "Loss of " + eventDetails.get(x).eventFinalRevenue;
			}
			JLabel lblProfitlossnpnl_1 = new JLabel(finalRevenue);
			lblProfitlossnpnl_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblProfitlossnpnl_1.setBounds(660, 99 + (i * rowHeight), 111, 31);
			contentPane.add(lblProfitlossnpnl_1);
		}
	}
	
	public class AgmsAdminEventDetail
	{
		public String eventName;
		public int eventFee;
		public int eventCost;
		public int eventRegistrations;
		public int eventRevenue;
		public int eventFinalRevenue;
	}

}
