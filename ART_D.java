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

public class ART_D extends JFrame {

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
					 ART_D frame = new  ART_D();
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
	public  ART_D() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 650, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Art D");
		lblNewLabel.setBounds(276, 44, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name: ");
		lblNewLabel_1.setBounds(172, 85, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date Created: ");
		lblNewLabel_2.setBounds(172, 117, 124, 16);
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
		lblNewLabel_13.setBounds(229, 315, 348, 16);
		contentPane.add(lblNewLabel_13);
		
		JButton btnNewButton = new JButton("Proceed to Payment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				payment pay = new payment();
				pay.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBounds(222, 343, 165, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Art Listing");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ART_LISTING al = new ART_LISTING();
				al.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_1.setBounds(243, 401, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Dashboard");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dashboard ff = new Dashboard();
				ff.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_2.setBounds(104, 401, 117, 29);
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(337, 80, 130, 26);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(337, 112, 130, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(337, 144, 130, 26);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(337, 176, 130, 26);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(337, 210, 130, 26);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(337, 243, 130, 26);
		contentPane.add(textField_5);
		
		JButton btnNewButton_3 = new JButton("Art Gallery");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Art_gal agg = new Art_gal();
				agg.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_3.setBounds(390, 401, 117, 29);
		contentPane.add(btnNewButton_3);
		
		
	}

}
