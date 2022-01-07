package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import connection.ConnectionFactory;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField userTxt;
	private JPasswordField passTxt;
	private JButton alterarBt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel user = new JLabel("Usu\u00E1rio");
		user.setBounds(115, 75, 46, 14);
		frame.getContentPane().add(user);
		
		JLabel senha = new JLabel("Senha");
		senha.setBounds(115, 115, 46, 14);
		frame.getContentPane().add(senha);
		
		userTxt = new JTextField();
		userTxt.setBounds(171, 72, 114, 20);
		frame.getContentPane().add(userTxt);
		userTxt.setColumns(10);
		
		JButton entrarBt = new JButton("Entrar");
		entrarBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(checkLogin(userTxt.getText(), new String(passTxt.getPassword()))) {
					
					JOptionPane.showMessageDialog(null, "Bem vindo ao banco de dados!", "Login", JOptionPane.PLAIN_MESSAGE);
					
					new JanelaMenu().setVisible(true);
					
					
					
				}else {
					JOptionPane.showMessageDialog(null, "Usuario e/ou senha inválidos!", "Erro de login", JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		entrarBt.setBounds(215, 168, 89, 23);
		frame.getContentPane().add(entrarBt);
		
		passTxt = new JPasswordField();
		passTxt.setBounds(171, 112, 114, 20);
		frame.getContentPane().add(passTxt);
		
		alterarBt = new JButton("Alterar");
		alterarBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var usuario = userTxt.getText();
				var senha = new String(passTxt.getPassword());
				
				if (userTxt.getText()=="" || new String(passTxt.getPassword())=="") {
									
					ConnectionFactory.usuario = "root";
					ConnectionFactory.senha = "root";
					usuario = ConnectionFactory.usuario;
					senha = ConnectionFactory.senha;
					
				}else {
					usuario = userTxt.getText();
					senha = new String(passTxt.getPassword());
					ConnectionFactory.usuario = usuario;
					ConnectionFactory.senha = senha;
					System.out.println(usuario +" "+ senha);
				}
				checkLogin(usuario, senha);
				
				
			}
		});
		alterarBt.setBounds(118, 168, 89, 23);
		frame.getContentPane().add(alterarBt);
	}
	
	public boolean checkLogin(String login, String senha) {
		return login.equals(ConnectionFactory.USER) && senha.equals(ConnectionFactory.PASSWORD);
	}
	
}
