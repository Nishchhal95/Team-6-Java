import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Country extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Country frame = new Country();
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
	public Country() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 650, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Arts by Country");
		lblNewLabel.setBounds(246, 54, 169, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USA");
		lblNewLabel_1.setBounds(121, 118, 61, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("United Kingdom");
		lblNewLabel_2.setBounds(255, 128, 132, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Argentina");
		lblNewLabel_3.setBounds(194, 213, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Brazil");
		lblNewLabel_4.setBounds(373, 213, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_44 = new JLabel("Japan");
		lblNewLabel_44.setBounds(458, 128, 61, 16);
		contentPane.add(lblNewLabel_44);
		
		JButton btnNewButton = new JButton("Check Information");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				USA u1 = new USA();
				u1.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBounds(64, 151, 147, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Check Information");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				uk u1 = new uk();
				u1.setVisible(true);

				setVisible(false);
				dispose();
				
			}
		});
		btnNewButton_1.setBounds(230, 151, 147, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Check Information");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ag a21 = new ag();
				a21.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_2.setBounds(149, 235, 147, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Check Information");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				Japan as4 = new Japan();
				as4.setVisible(true);

				setVisible(false);
				dispose();
				
			}
		});
		btnNewButton_3.setBounds(404, 151, 147, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Check Information");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Brazil br = new Brazil();
				br.setVisible(true);
				setVisible(false);
				dispose();
				}
		});
		btnNewButton_4.setBounds(322, 235, 147, 29);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Dashboard");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dashboard bd = new Dashboard();
				bd.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_5.setBounds(164, 356, 117, 29);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Art Gallery");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Art_gal agg = new Art_gal();
				agg.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_6.setBounds(322, 356, 117, 29);
		contentPane.add(btnNewButton_6);
	}

}
