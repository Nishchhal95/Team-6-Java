import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ART_LISTING extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ART_LISTING frame = new ART_LISTING();
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
	public ART_LISTING() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 650, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Art A");
		lblNewLabel_1.setBounds(146, 118, 61, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Art B");
		lblNewLabel_2.setBounds(404, 128, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Art C");
		lblNewLabel_3.setBounds(146, 276, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Art D");
		lblNewLabel_4.setBounds(404, 276, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Check Information");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ART_A B1 = new ART_A();
				B1.setVisible(true);
				
				setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBounds(97, 151, 147, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Check Information");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ART_B B2 = new ART_B();
				B2.setVisible(true);
				
				setVisible(false);
				dispose();
				
			}
		});
		btnNewButton_1.setBounds(347, 151, 147, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Check Information");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ART_C B3 = new ART_C();
				B3.setVisible(true);
				
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_2.setBounds(97, 304, 147, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Check Information");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				ART_D B4 = new ART_D();
				B4.setVisible(true);
				
				setVisible(false);
				dispose();
				
			}
		});
		btnNewButton_3.setBounds(347, 304, 147, 29);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_5 = new JLabel("Information on Artworks");
		lblNewLabel_5.setBounds(237, 67, 179, 16);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_4 = new JButton("Dashboard");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dashboard D4 = new Dashboard();
				D4.setVisible(true);
				
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_4.setBounds(142, 376, 117, 29);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Art Gallery");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Art_gal ag1 = new Art_gal();
				ag1.setVisible(true);
				
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_5.setBounds(317, 376, 117, 29);
		contentPane.add(btnNewButton_5);
	}

}
