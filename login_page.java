import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login_page extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField text_pass_login;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_page frame = new login_page();
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
	public login_page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton b2 = new JButton("Register");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Registration_page r1 = new Registration_page();
				r1.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		b2.setBounds(149, 215, 117, 29);
		contentPane.add(b2);
		
		JButton b1 = new JButton("Login");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ss = null;
	               String m_password = null;
	               
	              
						ss = t1.getText();
						m_password = text_pass_login.getText();
						
						if((ss == null) || (ss.equals(""))) {
				               JOptionPane.showMessageDialog(null, "Invalid Username!");
				               
				             }
				             else if(m_password == null) {
				                    JOptionPane.showMessageDialog(null, "Password cannot be empty!");
				                   
				             }
				             
						else
						{	
					
					        JOptionPane.showMessageDialog(null, "Welcome");
					        Dashboard e1 = new Dashboard();
							e1.setVisible(true);
							setVisible(false);
							dispose();
						}   
						
						
				
			}
		});
		b1.setBounds(149, 127, 117, 29);
		contentPane.add(b1);
		
		JLabel header = new JLabel("Art Management System");
		header.setBounds(149, 6, 159, 16);
		contentPane.add(header);
		
		JLabel UN_login = new JLabel("Username");
		UN_login.setBounds(93, 49, 62, 16);
		contentPane.add(UN_login);
		
		JLabel pass_login = new JLabel("Password");
		pass_login.setBounds(94, 77, 61, 16);
		contentPane.add(pass_login);
		
		t1 = new JTextField();
		t1.setBounds(186, 44, 159, 26);
		contentPane.add(t1);
		t1.setColumns(10);
		
		text_pass_login = new JTextField();
		text_pass_login.setBounds(186, 72, 159, 26);
		contentPane.add(text_pass_login);
		text_pass_login.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New user? Register below:");
		lblNewLabel.setBounds(136, 186, 172, 16);
		contentPane.add(lblNewLabel);
	}

}
