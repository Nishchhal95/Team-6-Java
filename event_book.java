import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class event_book extends JFrame {

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
					event_book frame = new event_book();
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
	public event_book() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 650, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Payment Portal");
		lblNewLabel.setBounds(254, 28, 121, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Spotlight Photography");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num = 15;
				textField.setText(Integer.toString(num));
				
				double tax = num*0.05;
				
				textField_1.setText(Double.toString(tax));
				
				textField_2.setText(Double.toString(num + tax));
				
				
				
			}
			
		
			
		});
		btnNewButton.setBounds(105, 73, 235, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(105, 141, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Sunshine Photography");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1 = 33;
				double tax1 = 0;
				textField.setText(Integer.toString(num1));
				
				tax1 = num1*0.05;
				
				textField_1.setText(Double.toString(tax1));
				
				textField_2.setText(Double.toString(num1 + tax1));
			}
		});
		btnNewButton_1.setBounds(105, 104, 235, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Maple Leaf Paintings");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num2 = 18;
				textField.setText(Integer.toString(num2));
				
				double tax2 = num2*0.05;
				
				textField_1.setText(Double.toString(tax2));
				
				textField_2.setText(Double.toString(num2+ tax2));
			}
		});
		btnNewButton_2.setBounds(105, 135, 235, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New Orchard Paintings");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num3 = 20;
				textField.setText(Integer.toString(num3));
				
				double tax3 = num3*0.05;
				
				textField_1.setText(Double.toString(tax3));
				
				textField_2.setText(Double.toString(num3 + tax3));
			}
		});
		btnNewButton_3.setBounds(106, 165, 235, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("More info here");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				spotlight a = new spotlight();
				a.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_4.setBounds(364, 73, 117, 29);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("More info here");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sunshine b = new sunshine();
				b.setVisible(true);

				setVisible(false);
				dispose();
			}
			
		});
		btnNewButton_5.setBounds(364, 104, 117, 29);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("More info here");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rocking c = new rocking();
				c.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_6.setBounds(364, 251, 117, 29);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("More info here");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				metal d = new metal();
				d.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_7.setBounds(364, 279, 117, 29);
		contentPane.add(btnNewButton_7);
		
		JLabel lblNewLabel_2 = new JLabel("Payment Amount:");
		lblNewLabel_2.setBounds(105, 351, 117, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Total Amount: ");
		lblNewLabel_3.setBounds(126, 398, 94, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_6 = new JLabel("Taxes (5%):");
		lblNewLabel_6.setBounds(143, 375, 78, 16);
		contentPane.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(226, 345, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(226, 370, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(227, 394, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Euros");
		lblNewLabel_4.setBounds(358, 352, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Euros");
		lblNewLabel_5.setBounds(359, 376, 61, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("Euros");
		lblNewLabel_7.setBounds(359, 401, 61, 16);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Enter Card Number:");
		lblNewLabel_8.setBounds(93, 425, 142, 16);
		contentPane.add(lblNewLabel_8);
		
		textField_3 = new JTextField();
		textField_3.setBounds(227, 419, 221, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_8 = new JButton("Pay");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Payment Done!");
			}
		});
		btnNewButton_8.setBounds(442, 419, 117, 29);
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
		btnNewButton_9.setBounds(69, 455, 117, 29);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Event Listing");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Event_info agg = new Event_info();
				agg.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_10.setBounds(445, 451, 117, 29);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("Rhien Art Gallery");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num33 = 23;
				double tax33=0.00;
				textField.setText(Integer.toString(num33));
				
				tax33 = num33*0.05;
				
				textField_1.setText(Double.toString(tax33));
				
				textField_2.setText(Double.toString(num33 + tax33));
			
				
			}
		});
		btnNewButton_11.setBounds(107, 194, 235, 29);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("Luisen Platz Art Gallery");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num31 = 19;
				
				double tax31 = 0.00;
				textField.setText(Integer.toString(num31));
				
				tax31 = num31*0.05;
				
				textField_1.setText(Double.toString(tax31));
				
				textField_2.setText(Double.toString(num31 + tax31));
			}
		});
		btnNewButton_12.setBounds(106, 223, 236, 29);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("Rocking Stone Art Gallery");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				int num11 = 17;
				
				double tax11 = 0.00;
				textField.setText(Integer.toString(num11));
				
				tax11 = num11*0.05;
				
				textField_1.setText(Double.toString(tax11));
				
				textField_2.setText(Double.toString(num11 + tax11));
			}
		});
		btnNewButton_13.setBounds(106, 251, 238, 29);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("Metallica Art Show");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num01 = 37;
				textField.setText(Integer.toString(num01));
				
				double tax01 = num01*0.05;
				
				textField_1.setText(Double.toString(tax01));
				
				textField_2.setText(Double.toString(num01 + tax01));
			}
		});
		btnNewButton_14.setBounds(106, 279, 237, 29);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("More info here");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lp l1 = new lp();
				l1.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_15.setBounds(364, 223, 117, 29);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("More info here");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rhien r = new rhien();
				r.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_16.setBounds(364, 194, 117, 29);
		contentPane.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("More info here");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				orchard o = new orchard();
				o.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_17.setBounds(364, 165, 117, 29);
		contentPane.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("More info here");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				maple mm = new maple();
				mm.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_18.setBounds(364, 135, 117, 29);
		contentPane.add(btnNewButton_18);
	}

}
