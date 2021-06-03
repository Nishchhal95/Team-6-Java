import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ART_C extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 ART_C frame = new  ART_C();
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
	public  ART_C() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 650, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Art C");
		lblNewLabel.setBounds(276, 44, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name: ");
		lblNewLabel_1.setBounds(172, 85, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date Created: ");
		lblNewLabel_2.setBounds(172, 117, 109, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Style of Art: ");
		lblNewLabel_3.setBounds(172, 149, 188, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Country belonging to:");
		lblNewLabel_4.setBounds(172, 181, 165, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Worth (in euros):");
		lblNewLabel_5.setBounds(172, 215, 165, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Artist:");
		lblNewLabel_6.setBounds(172, 253, 188, 16);
		contentPane.add(lblNewLabel_6);
		
		
		JLabel lblNewLabel_13 = new JLabel("Click here to buy this Art");
		lblNewLabel_13.setBounds(222, 315, 348, 16);
		contentPane.add(lblNewLabel_13);
		
		JButton btnNewButton_2 = new JButton("Buy This");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				payment pay = new payment();
				pay.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_2.setBounds(243, 343, 117, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Dashboard");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dashboard dsa = new Dashboard();
				dsa.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_3.setBounds(116, 395, 117, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Art Listing");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ART_LISTING lk = new ART_LISTING();
				lk.setVisible(true);
				
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_4.setBounds(243, 395, 117, 29);
		contentPane.add(btnNewButton_4);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(336, 80, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(336, 112, 130, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(336, 144, 130, 26);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(336, 176, 130, 26);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(336, 210, 130, 26);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(336, 243, 130, 26);
		contentPane.add(textField_5);
		
		JButton btnNewButton_5 = new JButton("Art Gallery");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Art_gal pay = new Art_gal();
				pay.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_5.setBounds(372, 395, 117, 29);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton = new JButton("Proceed to Payment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				payment pay = new payment();
				pay.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		
		JButton btnNewButton_1 = new JButton("Art Listing");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ART_LISTING al = new ART_LISTING();
				al.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		
			}
		
	}


