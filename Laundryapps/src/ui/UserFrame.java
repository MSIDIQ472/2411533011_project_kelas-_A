package ui;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.UserRepo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import Model.User;
public class UserFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTable tableUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserFrame frame = new UserFrame();
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
	public UserFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(22, 44, 48, 14);
		contentPane.add(lblName);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(22, 71, 69, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(22, 102, 48, 14);
		contentPane.add(lblPassword);
		
		txtName = new JTextField();
		txtName.setBounds(90, 41, 383, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(90, 68, 383, 20);
		contentPane.add(txtUsername);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(90, 99, 383, 20);
		contentPane.add(txtPassword);
		
		JButton btnSave = new JButton("save");
		btnSave.setBounds(87, 140, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnUpdate = new JButton("update");
		btnUpdate.setBounds(186, 140, 89, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("delete");
		btnDelete.setBounds(285, 140, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.setBounds(384, 140, 89, 23);
		contentPane.add(btnCancel);
		
		tableUser = new JTable();
		tableUser.setBounds(10, 182, 482, 304);
		contentPane.add(tableUser);
		
	}
}