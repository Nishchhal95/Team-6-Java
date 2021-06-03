import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextArea;
import javax.swing.JLabel;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Art_gal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Art_gal frame = new Art_gal();
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
	public Art_gal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 650, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Artworks available for Sale");
		lblNewLabel.setBounds(211, 53, 206, 16);
		contentPane.add(lblNewLabel);
		
		Label label = new Label("New label");
		label.setBounds(221, 124, 61, 16);
		contentPane.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("Art A");
		lblNewLabel_1.setBounds(77, 105, 37, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Art B");
		lblNewLabel_2.setBounds(77, 277, 37, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Art C");
		lblNewLabel_3.setBounds(483, 105, 37, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Art D");
		lblNewLabel_4.setBounds(483, 277, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("View more Info");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				ART_A P1 = new ART_A();
				P1.setVisible(true);
				setVisible(false);
				dispose();
			}
			
		});
		btnNewButton.setBounds(66, 189, 131, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View more Info");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ART_C P3 = new ART_C();
				P3.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_1.setBounds(396, 189, 138, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("View more Info");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ART_B P2 = new ART_B();
				P2.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_2.setBounds(66, 361, 131, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("View more Info");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ART_D P4 = new ART_D();
				P4.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_3.setBounds(401, 361, 133, 29);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_5 = new JLabel("by Artist B");
		lblNewLabel_5.setBounds(77, 305, 77, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("by Artist D");
		lblNewLabel_6.setBounds(449, 305, 74, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("by Artist C");
		lblNewLabel_7.setBounds(449, 133, 74, 16);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("by Artist A");
		lblNewLabel_8.setBounds(77, 133, 91, 16);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton_4 = new JButton("32000 Euro");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    payment pay = new payment();
				
				pay.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_4.setBounds(66, 161, 117, 29);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("23146 Euro");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                payment pay2 = new payment();
				
				pay2.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_5.setBounds(66, 334, 117, 29);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("21000 Euro");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                payment pay1 = new payment();
				
				pay1.setVisible(true);
				setVisible(false);
				dispose();
			}
			
			
			
		});
		btnNewButton_6.setBounds(418, 161, 117, 29);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("13000 Euro");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                payment pay3 = new payment();
				
				pay3.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_7.setBounds(417, 333, 117, 29);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Dashboard");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dashboard ds = new Dashboard();
				ds.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_8.setBounds(66, 425, 117, 29);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Art Gallery");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Art_gal agg = new Art_gal();
				agg.setVisible(true);
				setVisible(false);
				dispose();;
			}
		});
		btnNewButton_9.setBounds(235, 425, 117, 29);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Artworks for Sale");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ART_LISTING AL = new ART_LISTING();
				AL.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_10.setBounds(396, 425, 138, 29);
		contentPane.add(btnNewButton_10);
	}
}
