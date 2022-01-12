package view;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.text.MaskFormatter;
import models.AlunoTableModel;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class ListaDeAlunos extends JFrame {
	
	private JTable jTAlunos;
	private JTextField matriculaDeBusca;
		
	public ListaDeAlunos() 
	{
		super("Sistema de Gestão de Docentes");
		getContentPane().setBackground(Color.decode("#25DB55"));
		
		setBackground(new Color(0, 255, 0));
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(900, 700);
		setLocationRelativeTo(null);	
		
		jTAlunos = new JTable();
		jTAlunos.setBounds(69, 98, 758, 455);
		jTAlunos.setModel(new AlunoTableModel());
		
		JScrollPane scrollPane = new JScrollPane(jTAlunos);
		scrollPane.setBounds(69, 98, 758, 455);
		
		getContentPane().add(scrollPane);
		
		
		JButton btnSalvar = new JButton("Inserir Notas");		
		btnSalvar.setForeground(Color.WHITE);
		btnSalvar.setFont(new Font("Calibri", Font.BOLD, 16));
		btnSalvar.setBackground(new Color(0, 143, 38));
		btnSalvar.setBounds(538, 584, 122, 45);
		getContentPane().add(btnSalvar);
		
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				var matricula = Integer.parseInt(matriculaDeBusca.getText());
				var viewInserirNotas = new InserirNotas(matricula);	
				
				dispose();
				viewInserirNotas.setVisible(true);			
				
			}
		});				
		
		JLabel lblNewLabel = new JLabel("MATR\u00CDCULA DO ALUNO: ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblNewLabel.setBounds(50, 587, 241, 36);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Notas e Conceitos Acad\u00EAmicos");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 42));
		lblNewLabel_1.setBounds(170, 26, 551, 73);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Entrada com 2 d\u00EDgitos, Ex.: 01");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(60, 619, 231, 18);		
		getContentPane().add(lblNewLabel_2);
		
		
		MaskFormatter mascaraMatricula = null;
		
		try
		{
            mascaraMatricula = new MaskFormatter("##");
        }
        catch(ParseException excp) 
		{
            JOptionPane.showMessageDialog(null, "Erro de formatação", "Mesagem de Erro Academic Notes", JOptionPane.ERROR_MESSAGE);
        }
		
		
		matriculaDeBusca = new JTextField();
		matriculaDeBusca = new JFormattedTextField(mascaraMatricula);
		matriculaDeBusca.setBounds(301, 584, 227, 45);		
		matriculaDeBusca.setColumns(10);
		getContentPane().add(matriculaDeBusca);
		
		JButton btnVoltar = new JButton("Voltar");			
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setFont(new Font("Calibri", Font.BOLD, 16));
		btnVoltar.setBackground(new Color(0, 143, 38));
		btnVoltar.setBounds(670, 584, 122, 45);
		getContentPane().add(btnVoltar);
		
		btnVoltar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				new JanelaMenu().setVisible(true);
				dispose();
			}
		});					
		
	}
}
