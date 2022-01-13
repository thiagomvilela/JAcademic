package view;
import javax.swing.JFrame;
import javax.swing.text.MaskFormatter;
import models.AlunoTableModel;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class ListaDeAlunos extends JFrame {
	
	private JTable jTAlunos;
	private JTextField matriculaDeBusca;
	
	ImageIcon ifpe = new ImageIcon(getClass().getResource("jacademicMenor.png"));
	private JLabel lblLogo;
		
	public ListaDeAlunos() 
	{
		super("JAcademic");
		
		setBackground(new Color(0, 255, 0));
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.decode("#010024"));
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
		
		
		JButton btnInserirNotas = new JButton("Inserir Notas");		
		btnInserirNotas.setForeground(Color.WHITE);
		btnInserirNotas.setFont(new Font("Calibri", Font.BOLD, 16));
		btnInserirNotas.setOpaque(true);
		btnInserirNotas.setBackground(Color.decode("#0A6FC7"));
		btnInserirNotas.setBounds(573, 584, 122, 45);
		getContentPane().add(btnInserirNotas);
		
		btnInserirNotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				var matricula = Integer.parseInt(matriculaDeBusca.getText());
				var viewInserirNotas = new InserirNotas(matricula);	
				
				dispose();
				viewInserirNotas.setVisible(true);			
				
			}
		});				
		
		JLabel lblNewLabel = new JLabel("MATRÍCULA DO ALUNO: ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblNewLabel.setBounds(69, 579, 241, 36);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Notas e Conceitos Acadêmicos");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 42));
		lblNewLabel_1.setBounds(218, 25, 551, 73);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Entrada com 2 digitos, Ex.: 01");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(79, 611, 231, 18);		
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
		matriculaDeBusca.setBounds(320, 584, 243, 45);		
		matriculaDeBusca.setColumns(10);
		getContentPane().add(matriculaDeBusca);
		
		JButton btnVoltar = new JButton("Voltar");			
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setFont(new Font("Calibri", Font.BOLD, 16));
		btnVoltar.setOpaque(true);
		btnVoltar.setBackground(Color.decode("#0A6FC7"));
		btnVoltar.setBounds(705, 584, 122, 45);
		getContentPane().add(btnVoltar);
		
		btnVoltar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				new JanelaMenu().setVisible(true);
				dispose();
			}
		});	
		
		lblLogo = new JLabel(ifpe);
		lblLogo.setBounds(113, 0, 87, 91);
		getContentPane().add(lblLogo);
		
	}
}
