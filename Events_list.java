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
import java.awt.event.ActionEvent;

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
		
		JLabel lblNewLabel = new JLabel("Photography Events");
		lblNewLabel.setBounds(25, 49, 124, 16);
		contentPane.add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(427, 49, -421, 71);
		contentPane.add(textPane);
		
		JLabel lblNewLabel_1 = new JLabel("Events");
		lblNewLabel_1.setBounds(25, 6, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Price per ticket (in euro)");
		lblNewLabel_2.setBounds(468, 6, 155, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Spotlight Photography ");
		lblNewLabel_3.setBounds(25, 77, 184, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sunshine Photography");
		lblNewLabel_4.setBounds(25, 105, 155, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Painting Events");
		lblNewLabel_5.setBounds(25, 152, 155, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Maple Leaf Paintings");
		lblNewLabel_6.setBounds(25, 180, 155, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New Orchard Paintings");
		lblNewLabel_7.setBounds(25, 208, 155, 16);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Art Gallery Events");
		lblNewLabel_8.setBounds(25, 260, 155, 16);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Rhien Art Gallery");
		lblNewLabel_9.setBounds(25, 288, 117, 16);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Luisen Platz Art Gallery");
		lblNewLabel_10.setBounds(25, 316, 167, 16);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Rocking Stone Art Gallery");
		lblNewLabel_11.setBounds(25, 343, 184, 16);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Metallic Art Event");
		lblNewLabel_12.setBounds(25, 394, 167, 16);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Metallica Art Show");
		lblNewLabel_13.setBounds(25, 422, 184, 16);
		contentPane.add(lblNewLabel_13);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("15");
		rdbtnNewRadioButton.setBounds(482, 73, 141, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("33");
		rdbtnNewRadioButton_1.setBounds(482, 101, 141, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("18");
		rdbtnNewRadioButton_2.setBounds(482, 176, 141, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("20");
		rdbtnNewRadioButton_3.setBounds(482, 204, 141, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("23");
		rdbtnNewRadioButton_4.setBounds(482, 284, 141, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("19");
		rdbtnNewRadioButton_5.setBounds(482, 312, 141, 23);
		contentPane.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("17");
		rdbtnNewRadioButton_6.setBounds(482, 339, 141, 23);
		contentPane.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("37");
		rdbtnNewRadioButton_7.setBounds(482, 415, 141, 23);
		contentPane.add(rdbtnNewRadioButton_7);
		
		JButton bb1 = new JButton("Book Tickets");
		bb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				event_book eeb = new event_book();
				eeb.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		bb1.setBounds(243, 442, 117, 29);
		contentPane.add(bb1);
		
		JButton btnNewButton = new JButton("Click here for more info on Events");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Event_info ei = new Event_info();
				ei.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBounds(176, 471, 259, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Dashboard");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dashboard dbs = new Dashboard();
				dbs.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_1.setBounds(25, 471, 117, 29);
		contentPane.add(btnNewButton_1);
	}
}
