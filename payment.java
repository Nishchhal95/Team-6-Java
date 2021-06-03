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

public class payment extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payment frame = new payment();
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
	public payment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 650, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Payment Portal");
		lblNewLabel.setBounds(254, 28, 121, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Click here to purchase Art A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num = 32000;
				textField.setText(Integer.toString(num));
				
				double tax = num*0.15;
				
				textField_1.setText(Double.toString(tax));
				
				textField_2.setText(Double.toString(num + tax));
				
				
			}
			
		
			
		});
		btnNewButton.setBounds(105, 73, 235, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(105, 141, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Click here to purchase Art B");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1 = 23146;
				textField.setText(Integer.toString(num1));
				
				double tax1 = num1*0.15;
				
				textField_1.setText(Double.toString(tax1));
				
				textField_2.setText(Double.toString(num1 + tax1));
			}
		});
		btnNewButton_1.setBounds(105, 114, 235, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Click here to purchase Art C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num2 = 21000;
				textField.setText(Integer.toString(num2));
				
				double tax2 = num2*0.15;
				
				textField_1.setText(Double.toString(tax2));
				
				textField_2.setText(Double.toString(num2+ tax2));
			}
		});
		btnNewButton_2.setBounds(105, 156, 235, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Click here to purchase Art D");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num3 = 32000;
				textField.setText(Integer.toString(num3));
				
				double tax3 = num3*0.15;
				
				textField_1.setText(Double.toString(tax3));
				
				textField_2.setText(Double.toString(num3 + tax3));
			}
		});
		btnNewButton_3.setBounds(105, 197, 235, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Info on Art A");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ART_A a = new ART_A();
				a.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_4.setBounds(364, 73, 117, 29);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Info on Art B");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ART_B b = new ART_B();
				b.setVisible(true);

				setVisible(false);
				dispose();
			}
			
		});
		btnNewButton_5.setBounds(364, 114, 117, 29);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Info on Art C");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ART_C c = new ART_C();
				c.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_6.setBounds(364, 156, 117, 29);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Info on Art D");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ART_D d = new ART_D();
				d.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_7.setBounds(364, 197, 117, 29);
		contentPane.add(btnNewButton_7);
		
		JLabel lblNewLabel_2 = new JLabel("Payment Amount:");
		lblNewLabel_2.setBounds(115, 260, 117, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Total Amount: ");
		lblNewLabel_3.setBounds(134, 318, 94, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_6 = new JLabel("Taxes:");
		lblNewLabel_6.setBounds(183, 288, 41, 16);
		contentPane.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(245, 255, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(245, 283, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(245, 313, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Euros");
		lblNewLabel_4.setBounds(387, 260, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Euros");
		lblNewLabel_5.setBounds(387, 288, 61, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("Euros");
		lblNewLabel_7.setBounds(387, 318, 61, 16);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Enter Card Number:");
		lblNewLabel_8.setBounds(105, 359, 142, 16);
		contentPane.add(lblNewLabel_8);
		
		textField_3 = new JTextField();
		textField_3.setBounds(245, 351, 221, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_8 = new JButton("Pay");
		btnNewButton_8.setBounds(478, 346, 117, 29);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Dashboard");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard d = new Dashboard();
				d.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_9.setBounds(76, 417, 117, 29);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Art Gallery");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Art_gal agg = new Art_gal();
				agg.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_10.setBounds(434, 417, 117, 29);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("Artwork for Sale");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ART_LISTING ALL = new ART_LISTING();
				ALL.setVisible(true);

				setVisible(false);
				dispose();
				
				
			}
		});
		btnNewButton_11.setBounds(233, 417, 142, 29);
		contentPane.add(btnNewButton_11);
	}

}
