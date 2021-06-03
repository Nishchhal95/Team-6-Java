import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ArtistB extends JFrame {

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
					ArtistB frame = new ArtistB();
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
	public ArtistB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 650, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Artist B");
		lblNewLabel.setBounds(276, 44, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name: ");
		lblNewLabel_1.setBounds(172, 85, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Age: ");
		lblNewLabel_2.setBounds(172, 117, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Preferred Style of Art: ");
		lblNewLabel_3.setBounds(172, 149, 188, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Country belonging to:");
		lblNewLabel_4.setBounds(172, 181, 165, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Worth (in euros):");
		lblNewLabel_5.setBounds(172, 215, 165, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Important Art works:");
		lblNewLabel_6.setBounds(172, 253, 188, 16);
		contentPane.add(lblNewLabel_6);
	
		
		JButton btnNewButton = new JButton("Artworks for sale");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Art_gal ag = new Art_gal();
				ag.setVisible(true);
				
				setVisible(false);
				dispose();
				
			}
		});
		btnNewButton.setBounds(418, 395, 144, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Dashboard");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dashboard d1 = new Dashboard();
				d1.setVisible(true);
				
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_1.setBounds(73, 395, 117, 29);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(341, 80, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(341, 112, 130, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(341, 144, 130, 26);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(341, 177, 130, 26);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(341, 209, 130, 26);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(341, 243, 130, 26);
		contentPane.add(textField_5);
		
		JButton btnNewButton_2 = new JButton("Info on other Artists");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Artists aa = new Artists();
				aa.setVisible(true);
				setVisible(false);
				dispose();
				
			}
		});
		btnNewButton_2.setBounds(225, 395, 158, 29);
		contentPane.add(btnNewButton_2);
	
	
		
	}

}
