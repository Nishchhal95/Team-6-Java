import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class StaffDetails extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffDetails frame = new StaffDetails();
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
	public StaffDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel eventName = new JLabel("Staff Name");
		eventName.setHorizontalAlignment(SwingConstants.CENTER);
		eventName.setBounds(40, 50, 111, 31);
		contentPane.add(eventName);
		
		JLabel eventFee = new JLabel("Specialization");
		eventFee.setHorizontalAlignment(SwingConstants.CENTER);
		eventFee.setBounds(176, 50, 111, 31);
		contentPane.add(eventFee);
		
		JLabel lblEventcost = new JLabel("Country");
		lblEventcost.setHorizontalAlignment(SwingConstants.CENTER);
		lblEventcost.setBounds(297, 50, 111, 31);
		contentPane.add(lblEventcost);
		
		JLabel lblEventregistrations = new JLabel("Email");
		lblEventregistrations.setHorizontalAlignment(SwingConstants.CENTER);
		lblEventregistrations.setBounds(418, 50, 111, 31);
		contentPane.add(lblEventregistrations);
		
		JLabel lblEventRevenue = new JLabel("DOB");
		lblEventRevenue.setHorizontalAlignment(SwingConstants.CENTER);
		lblEventRevenue.setBounds(539, 50, 111, 31);
		contentPane.add(lblEventRevenue);
		
		JLabel lblProfitlossnpnl = new JLabel("(Salary + $100 Bonus)");
		lblProfitlossnpnl.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfitlossnpnl.setBounds(645, 50, 126, 31);
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
		
		ArrayList<AgmsStaffDetail> staffDetails = new ArrayList<AgmsStaffDetail>();
		try {
            Connection connection = DriverManager.getConnection(JavaDatabaseConnection.dbURL + JavaDatabaseConnection.dbName, 
            		JavaDatabaseConnection.userName, JavaDatabaseConnection.password);
            CallableStatement statement = connection.prepareCall("{call getStaffDetails()}");
            boolean hadResults = statement.execute();
            while (hadResults) {
                ResultSet resultSet = statement.getResultSet();
                // process result set
                while (resultSet.next()) {
                	AgmsStaffDetail staffDetail = new AgmsStaffDetail();
                	staffDetail.fullName = resultSet.getString("fullName");
                	staffDetail.specialization = resultSet.getString("specializationType");
                	staffDetail.countryName = resultSet.getString("countryName");
                	staffDetail.email = resultSet.getString("emailAddress");
                	staffDetail.dob = resultSet.getString("dob");
                	staffDetail.salary = resultSet.getInt("completeSalary");
                	staffDetails.add(staffDetail);
                }
                hadResults = statement.getMoreResults();
            }
            statement.close();
            connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
	
		int rowHeight = 35;
		
		for(int i = 0; i < staffDetails.size(); i++) {
			final int x = i;
			JLabel eventName_1 = new JLabel(staffDetails.get(x).fullName);
			eventName_1.setHorizontalAlignment(SwingConstants.CENTER);
			eventName_1.setBounds(20, 99 + (i * rowHeight), 200, 31);
			contentPane.add(eventName_1);
			
			JLabel eventFee_1 = new JLabel("" + staffDetails.get(x).specialization);
			eventFee_1.setHorizontalAlignment(SwingConstants.CENTER);
			eventFee_1.setBounds(176, 99 + (i * rowHeight), 111, 31);
			contentPane.add(eventFee_1);
			
			JLabel lblEventcost_1 = new JLabel("" + staffDetails.get(x).countryName);
			lblEventcost_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblEventcost_1.setBounds(297, 99 + (i * rowHeight), 111, 31);
			contentPane.add(lblEventcost_1);
			
			JLabel lblEventregistrations_1 = new JLabel("" + staffDetails.get(x).email);
			lblEventregistrations_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblEventregistrations_1.setBounds(418, 99 + (i * rowHeight), 150, 31);
			contentPane.add(lblEventregistrations_1);
			
			JLabel lblEventRevenue_1 = new JLabel("" + staffDetails.get(x).dob);
			lblEventRevenue_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblEventRevenue_1.setBounds(539, 99 + (i * rowHeight), 111, 31);
			contentPane.add(lblEventRevenue_1);
			
			JLabel lblProfitlossnpnl_1 = new JLabel("" + staffDetails.get(x).salary);
			lblProfitlossnpnl_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblProfitlossnpnl_1.setBounds(660, 99 + (i * rowHeight), 111, 31);
			contentPane.add(lblProfitlossnpnl_1);
		}
	}
	
	public class AgmsStaffDetail
	{
		public String fullName;
		public String specialization;
		public String countryName;
		public String email;
		public String dob;
		public int salary;
	}

}
