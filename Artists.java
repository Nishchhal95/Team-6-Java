import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Artists extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Artists frame = new Artists();
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
	public Artists() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 650, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Artist A");
		lblNewLabel_1.setBounds(146, 118, 61, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Artist B");
		lblNewLabel_2.setBounds(404, 128, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Artist C");
		lblNewLabel_3.setBounds(146, 276, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Artist D");
		lblNewLabel_4.setBounds(404, 276, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Check Information");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArtistA aa = new ArtistA();
				aa.setVisible(true);
				

				setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBounds(97, 151, 147, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Check Information");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArtistB BB = new ArtistB();
				BB.setVisible(true);
				

				setVisible(false);
				dispose();
				
			}
		});
		btnNewButton_1.setBounds(347, 151, 147, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Check Information");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArtistC CC = new ArtistC();
				CC.setVisible(true);
				

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_2.setBounds(97, 304, 147, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Check Information");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArtistD DD = new ArtistD();
				DD.setVisible(true);
				

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_3.setBounds(361, 304, 147, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Dashboard");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dashboard dash = new Dashboard();
				dash.setVisible(true);
				

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_4.setBounds(146, 388, 117, 29);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Art Gallery");
		btnNewButton_5.setBounds(348, 388, 117, 29);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_5 = new JLabel("Information on Artists");
		lblNewLabel_5.setBounds(232, 63, 147, 16);
		contentPane.add(lblNewLabel_5);
	}

}
