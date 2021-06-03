import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Event_info extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Event_info frame = new Event_info();
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
	public Event_info() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 550, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Spotlight Photography");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				spotlight sp = new spotlight();
				sp.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBounds(54, 70, 175, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sunshine Photography");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sunshine ss = new sunshine();
				ss.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_1.setBounds(54, 126, 175, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Maple leaf Painting");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				maple m = new maple();
				m.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_2.setBounds(54, 181, 175, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New Orchard Painting");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				orchard o = new orchard();
				o.setVisible(true);

				setVisible(false);
				dispose();
			}
			
		});
		btnNewButton_3.setBounds(54, 234, 175, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Rhien Art Gallery");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rhien r = new rhien();
				r.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_4.setBounds(304, 70, 166, 29);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Luisen Platz Art Gallery");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lp l = new lp();
				l.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_5.setBounds(289, 126, 181, 29);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Rocking Stone Art Gallery");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rocking r = new rocking();
				r.setVisible(true);

				setVisible(false);
				dispose();
			}
		});
		btnNewButton_6.setBounds(278, 181, 192, 29);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Metallica Art Gallery");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				metal m1 = new metal();
				m1.setVisible(true);

				setVisible(false);
				dispose();
				
			}
		});
		btnNewButton_7.setBounds(312, 234, 158, 29);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Dashboard");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dashboard dd = new Dashboard();
				dd.setVisible(true);

				setVisible(false);
				dispose();
			}
			
		});
		btnNewButton_8.setBounds(214, 311, 117, 29);
		contentPane.add(btnNewButton_8);
		
		JLabel lblNewLabel = new JLabel("Event Information");
		lblNewLabel.setBounds(214, 22, 117, 16);
		contentPane.add(lblNewLabel);
	}

}
