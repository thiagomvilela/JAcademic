package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;

import connection.ConnectionFactory;
import models.dao.AcademicDAO;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField userTxt;
	private JPasswordField passTxt;
	private JButton alterarBt;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() 
			{
				try 
				{
					Login window = new Login();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public Login() {
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 512, 288);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel user = new JLabel("Usuário");
		user.setBounds(164, 65, 46, 14);
		frame.getContentPane().add(user);
		
		JLabel senha = new JLabel("Senha");
		senha.setBounds(164, 105, 46, 14);
		frame.getContentPane().add(senha);
		
		userTxt = new JTextField();
		userTxt.setBounds(235, 62, 114, 20);
		frame.getContentPane().add(userTxt);
		userTxt.setColumns(10);
		
		JButton entrarBt = new JButton("Entrar");
		entrarBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(checkLogin(userTxt.getText(), new String(passTxt.getPassword()))) {
					
					JOptionPane.showMessageDialog(null, "Bem vindo ao banco de dados!", "Login", JOptionPane.PLAIN_MESSAGE);
					
					//Deletando banco de dados !
					AcademicDAO.getInstance().DeleteDatabase();
					AcademicDAO.getInstance().initializeDatabase();
					
					new JanelaMenu().setVisible(true);
					frame.dispose();
					
					
				}else {
					JOptionPane.showMessageDialog(null, "Usuario e/ou senha invalidos!", "Erro de login", JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		entrarBt.setBounds(208, 186, 89, 23);
		frame.getContentPane().add(entrarBt);
		
		passTxt = new JPasswordField();
		passTxt.setBounds(235, 102, 114, 20);
		frame.getContentPane().add(passTxt);
		
		alterarBt = new JButton("Alterar/Set login");
		alterarBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var usuario = userTxt.getText();
				var senha = new String(passTxt.getPassword());
				
				if (userTxt.getText().isEmpty() || new String(passTxt.getPassword()).isEmpty()) {
										
					JOptionPane.showMessageDialog(null, "Usuário e/ou senha vazios", "Login vazio", JOptionPane.ERROR_MESSAGE);
					
				}else {
					
					usuario = userTxt.getText();
					senha = new String(passTxt.getPassword());
					
					ConnectionFactory.usuario = usuario;
					ConnectionFactory.senha = senha;
					System.out.println(usuario +" "+ senha);
					JOptionPane.showMessageDialog(null, "Usuário e senha alterados clique para iniciar o Banco de dados", "Alterado para senha padr�o", JOptionPane.PLAIN_MESSAGE);
				}
				
				checkLogin(usuario, senha);
				
				
			}
		});
		
		alterarBt.setBounds(78, 186, 114, 23);
		frame.getContentPane().add(alterarBt);
		
		JButton loginpadraoBT = new JButton("Login Padrao");
		loginpadraoBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ConnectionFactory.usuario = "root";
				ConnectionFactory.senha = "root";
				
				JOptionPane.showMessageDialog(null, "Bem vindo ao banco de dados!", "Login", JOptionPane.PLAIN_MESSAGE);
				
				//Deletando banco de dados !
				AcademicDAO.getInstance().DeleteDatabase();
				AcademicDAO.getInstance().initializeDatabase();
				
				new JanelaMenu().setVisible(true);
				frame.dispose();
				
			}
		});
		loginpadraoBT.setBounds(307, 186, 139, 23);
		frame.getContentPane().add(loginpadraoBT);
		
	}
	
	public boolean checkLogin(String login, String senha) {
		return login.equals(ConnectionFactory.usuario) && senha.equals(ConnectionFactory.senha);
	}
}
