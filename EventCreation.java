import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class EventCreation extends JFrame {

	private JPanel contentPane;
	private JTextField eventNameField;
	private JTextField eventDescField;
	private JTextField startDateField;
	private JLabel lblNewLabel_1_3;
	private JTextField endDateField;
	private JLabel lblNewLabel_1_4;
	private JTextField eventFeeField;
	private JLabel lblNewLabel_1_5;
	private JTextField eventCostField;
	private JButton createEventButton;
	private JLabel lblNewLabel_1_6;
	private JSpinner eventTypeSpinner;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventCreation frame = new EventCreation();
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
	public EventCreation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ArrayList<AgmsEventType> agmsEventTypes = new ArrayList<AgmsEventType>();
		
		//TODO: Fetch Data of the current Event
		try {
            Connection connection = DriverManager.getConnection(JavaDatabaseConnection.dbURL + JavaDatabaseConnection.dbName, 
            		JavaDatabaseConnection.userName, JavaDatabaseConnection.password);
            String query = "SELECT * from " + JavaDatabaseConnection.eventTypeTable;
            Statement sta = connection.createStatement();
            ResultSet rs = sta.executeQuery(query);
            
            while (rs.next()) {
            	AgmsEventType agmsEventType = new AgmsEventType();
            	agmsEventType.eventTypeID = rs.getInt("eventTypeID");
            	agmsEventType.eventTypeName = rs.getString("eventType");
            	agmsEventTypes.add(agmsEventType);
              }
            
            connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
		
		
		JLabel lblNewLabel = new JLabel("Event Creation");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel.setBounds(306, 20, 260, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Event Name");
		lblNewLabel_1.setBounds(96, 90, 114, 23);
		contentPane.add(lblNewLabel_1);
		
		eventNameField = new JTextField();
		eventNameField.setBounds(222, 92, 324, 21);
		contentPane.add(eventNameField);
		eventNameField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Event Description");
		lblNewLabel_1_1.setBounds(96, 138, 114, 23);
		contentPane.add(lblNewLabel_1_1);
		
		eventDescField = new JTextField();
		eventDescField.setColumns(10);
		eventDescField.setBounds(222, 140, 324, 21);
		contentPane.add(eventDescField);
		
		JLabel lblNewLabel_1_2 = new JLabel("Start Date");
		lblNewLabel_1_2.setBounds(96, 190, 114, 23);
		contentPane.add(lblNewLabel_1_2);
		
		startDateField = new JTextField();
		startDateField.setColumns(10);
		startDateField.setBounds(222, 191, 87, 21);
		contentPane.add(startDateField);
		
		lblNewLabel_1_3 = new JLabel("End Date");
		lblNewLabel_1_3.setBounds(370, 190, 79, 23);
		contentPane.add(lblNewLabel_1_3);
		
		endDateField = new JTextField();
		endDateField.setColumns(10);
		endDateField.setBounds(459, 191, 87, 21);
		contentPane.add(endDateField);
		
		lblNewLabel_1_4 = new JLabel("Event Fee");
		lblNewLabel_1_4.setBounds(96, 239, 114, 23);
		contentPane.add(lblNewLabel_1_4);
		
		eventFeeField = new JTextField();
		eventFeeField.setColumns(10);
		eventFeeField.setBounds(222, 241, 324, 21);
		contentPane.add(eventFeeField);
		
		lblNewLabel_1_5 = new JLabel("Event Cost");
		lblNewLabel_1_5.setBounds(96, 293, 114, 23);
		contentPane.add(lblNewLabel_1_5);
		
		eventCostField = new JTextField();
		eventCostField.setColumns(10);
		eventCostField.setBounds(222, 295, 324, 21);
		contentPane.add(eventCostField);
		
		lblNewLabel_1_6 = new JLabel("Event Type");
		lblNewLabel_1_6.setBounds(96, 340, 114, 23);
		contentPane.add(lblNewLabel_1_6);
		
		eventTypeSpinner = new JSpinner();
		eventTypeSpinner.setBounds(220, 342, 326, 21);
		String[] eventTypeArray = new String[agmsEventTypes.size()];
		for(int i = 0; i < agmsEventTypes.size(); i++) {
			eventTypeArray[i] = agmsEventTypes.get(i).eventTypeName;
		}
		eventTypeSpinner.setModel(new SpinnerListModel(eventTypeArray));
		eventTypeSpinner.setValue(eventTypeArray[agmsEventTypes.size() - 1]);
		contentPane.add(eventTypeSpinner);
		
		
		createEventButton = new JButton("Create Event");
		createEventButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            Connection connection = DriverManager.getConnection(JavaDatabaseConnection.dbURL + JavaDatabaseConnection.dbName, 
		            		JavaDatabaseConnection.userName, JavaDatabaseConnection.password);
		            CallableStatement sta = connection.prepareCall("{call addEvent(?, ?, ?, ?, ?, ?, ?)}");
		            sta.setString(1, eventNameField.getText().trim());
		            sta.setString(2, eventDescField.getText().trim());
		            sta.setString(3, startDateField.getText().trim());
		            sta.setString(4, endDateField.getText().trim());
		            sta.setString(5, eventFeeField.getText().trim());
		            sta.setString(6, eventCostField.getText().trim());
		            sta.setString(7, eventTypeSpinner.getValue().toString());
		            sta.execute();
		            connection.close();
		        } catch (Exception exception) {
		            exception.printStackTrace();
		        }
				
				JOptionPane.showMessageDialog(null, "Event Created!");
			}
		});
		createEventButton.setBounds(297, 393, 100, 25);
		contentPane.add(createEventButton);
		
		btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard db = new Dashboard();
				db.setVisible(true);
			
				setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 20, 85, 21);
		contentPane.add(btnNewButton);
	}
	
	public class AgmsEventType
	{
		public int eventTypeID;
		public String eventTypeName;
	}

}
