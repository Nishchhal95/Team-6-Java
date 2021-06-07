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
		
		JLabel lblNewLabel_1 = new JLabel("Events");
		lblNewLabel_1.setBounds(126, 87, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Art");
		lblNewLabel_2.setBounds(126, 205, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Customer Login");
		lblNewLabel_3.setBounds(126, 331, 110, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Artist");
		lblNewLabel_4.setBounds(473, 87, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Country");
		lblNewLabel_5.setBounds(461, 205, 61, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Staff Login");
		lblNewLabel_6.setBounds(448, 331, 95, 16);
		contentPane.add(lblNewLabel_6);
		
		JButton b6 = new JButton("Check");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Events_list el = new Events_list();
				el.setVisible(true);
				setVisible(false);
				dispose();
			}
			
		});
		b6.setBounds(119, 115, 117, 29);
		contentPane.add(b6);
		
		JButton b8 = new JButton("Check");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ART_LISTING IT = new ART_LISTING();
				IT.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		b8.setBounds(119, 233, 117, 29);
		contentPane.add(b8);
		
		JButton b10 = new JButton("Check");
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Customer_Profile ag = new Customer_Profile();
				ag.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		b10.setBounds(119, 359, 117, 29);
		contentPane.add(b10);
		
		JButton b7 = new JButton("Check");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Artists a = new Artists();
				a.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		b7.setBounds(405, 115, 117, 29);
		contentPane.add(b7);
		
		JButton b9 = new JButton("Check");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Country Cou = new Country();
				Cou.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		b9.setBounds(405, 233, 117, 29);
		contentPane.add(b9);
		
		JButton b11 = new JButton("Check");
		b11.setBounds(405, 359, 117, 29);
		contentPane.add(b11);
	}
}
