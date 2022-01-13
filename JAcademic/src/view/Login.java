package view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import connection.ConnectionFactory;
import models.AcademicDAO;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Login {

	private JFrame frame;
	private JTextField userTxt;
	private JPasswordField passTxt;
	
	
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
	
	public Login() {
		
		initialize();
		
	}

	
	private void initialize() {
		
		frame = new JFrame("JAcademic");
		frame.setBounds(100, 100, 512, 288);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.decode("#010024"));
		
		JLabel user = new JLabel("Usuário:");
		user.setForeground(Color.WHITE);
		user.setFont(new Font("Calibri", Font.PLAIN, 14));
		user.setBounds(158, 83, 53, 17);

		frame.getContentPane().add(user);
		
		JLabel senha = new JLabel("Senha:");
		senha.setForeground(Color.WHITE);
		senha.setFont(new Font("Calibri", Font.PLAIN, 14));
		senha.setBounds(165, 124, 46, 14);
		frame.getContentPane().add(senha);
		
		userTxt = new JTextField();
		userTxt.setBounds(221, 79, 114, 20);
		frame.getContentPane().add(userTxt);
		userTxt.setColumns(10);
		
		passTxt = new JPasswordField();
		passTxt.setBounds(221, 119, 114, 20);
		frame.getContentPane().add(passTxt);
		
		JButton entrarBt = new JButton("Entrar");				
		entrarBt.setForeground(Color.WHITE);
		entrarBt.setFont(new Font("Calibri", Font.PLAIN, 12));
		entrarBt.setBounds(125, 186, 89, 23);
		entrarBt.setOpaque(true);
		entrarBt.setBackground(Color.decode("#0A6FC7"));
		
		entrarBt.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				
				var usuario = userTxt.getText();
				var senha = new String(passTxt.getPassword());
				
				if (userTxt.getText().isEmpty() || new String(passTxt.getPassword()).isEmpty()) 
				{
										
					JOptionPane.showMessageDialog(null, "Usuário e/ou senha vazios", "Login vazio", JOptionPane.ERROR_MESSAGE);
					
				}
				else 
				{					
					usuario = userTxt.getText();
					senha = new String(passTxt.getPassword());
					
					ConnectionFactory.usuario = usuario;
					ConnectionFactory.senha = senha;								
				}
				
				try 
				{
					AcademicDAO.getInstance().initializeDatabase();
					
					JOptionPane.showMessageDialog(null, "Bem vindo ao banco de dados!", "Login", JOptionPane.PLAIN_MESSAGE);
					
					new JanelaMenu().setVisible(true);
					frame.dispose();
				}
				catch (Exception ex) 
				{
					JOptionPane.showMessageDialog(null, "Usuario e/ou senha inválidos! Erro: " + ex.getMessage(), "Erro de login", JOptionPane.ERROR_MESSAGE);
				}													
			}
		});
				
		frame.getContentPane().add(entrarBt);						
		
		JButton loginpadraoBT = new JButton("Login Padrão");
		loginpadraoBT.setForeground(Color.WHITE);
		loginpadraoBT.setFont(new Font("Calibri", Font.PLAIN, 12));
		loginpadraoBT.setBounds(224, 186, 139, 23);
		loginpadraoBT.setOpaque(true);
		loginpadraoBT.setBackground(Color.decode("#0A6FC7"));
		loginpadraoBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ConnectionFactory.usuario = "root";
				ConnectionFactory.senha = "root";
				
				try 
				{
					AcademicDAO.getInstance().initializeDatabase();
					
					JOptionPane.showMessageDialog(null, "Bem vindo ao banco de dados!", "Login", JOptionPane.PLAIN_MESSAGE);
					
					new JanelaMenu().setVisible(true);
					frame.dispose();
				}
				catch (Exception ex) 
				{
					JOptionPane.showMessageDialog(null, "Usuario e/ou senha inválidos! Erro: " + ex.getMessage(), "Erro de login", JOptionPane.ERROR_MESSAGE);
				}																				
			}
		});		
		
		frame.getContentPane().add(loginpadraoBT);
		
		JLabel lblNewLabel = new JLabel("Configuração do Banco de Dados");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel.setBounds(125, 26, 256, 23);
		frame.getContentPane().add(lblNewLabel);
		
	}	
}
