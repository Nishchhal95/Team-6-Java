import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dashboard extends JFrame {

	public static boolean isAdmin = false;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dashboard");
		lblNewLabel.setBounds(282, 6, 128, 16);
		contentPane.add(lblNewLabel);
		
		JButton b6 = new JButton("Events");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Events_list el = new Events_list();
				el.setVisible(true);
				setVisible(false);
				dispose();
			}
			
		});
		b6.setBounds(47, 115, 117, 29);
		contentPane.add(b6);
		
		JButton b8 = new JButton("Art");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ART_LISTING IT = new ART_LISTING();
				IT.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		b8.setBounds(244, 115, 117, 29);
		contentPane.add(b8);
		
		if(isAdmin) {
		JButton b10 = new JButton("Event Details");
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EventDetails ed = new EventDetails();
				ed.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		b10.setBounds(61, 363, 117, 29);
		contentPane.add(b10);
		}
		
		JButton b7 = new JButton("Artists");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArtistListing a = new ArtistListing();
				a.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		b7.setBounds(439, 115, 117, 29);
		contentPane.add(b7);
		
		JButton btnNewButton = new JButton("Profile");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer_Profile customerProfile = new Customer_Profile();
				customerProfile.setVisible(true);
			
				setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 10, 85, 21);
		contentPane.add(btnNewButton);
		
		if(isAdmin) {
		JButton b11 = new JButton("Staff Details");
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffDetails staffDetails = new StaffDetails();
				staffDetails.setVisible(true);
			
				setVisible(false);
				dispose();
			}
		});
		b11.setBounds(439, 363, 117, 29);
		contentPane.add(b11);
		
		JButton btnCreateEvent = new JButton("Create Event");
		btnCreateEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventCreation eventCreation = new EventCreation();
				eventCreation.setVisible(true);
			
				setVisible(false);
				dispose();
			}
		});
		btnCreateEvent.setBounds(244, 363, 117, 29);
		contentPane.add(btnCreateEvent);
		}
	}
}
