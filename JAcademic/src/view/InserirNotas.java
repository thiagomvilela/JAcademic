package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import models.AcademicDAO;
import models.Aluno;

public class InserirNotas extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAv1_1;
	private JTextField textFieldAv2_1;
	private JTextField textFieldRecuperacao1;
	private JTextField textFieldSituacao1;
	private JLabel lbInformacoes;
	private JButton btnSalvar;
	private JTextField textFieldMatricula1;
	private JTextField textFieldAluno1;	
	private Aluno alunoEmExibicao;
	private int _matriculaDoALuno;
	private JButton btnVoltar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try 
				{					
					InserirNotas frame = new InserirNotas(5);
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	*/
	public InserirNotas(int matriculaDoALuno) {		
		super("Sistema de Gestão de Docentes");
		
		_matriculaDoALuno = matriculaDoALuno;
		
		alunoEmExibicao = AcademicDAO.getInstance().findByMatricula(_matriculaDoALuno);
		
		setBackground(new Color(0, 255, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(900, 700);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#25DB55"));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);	
		
		
		JLabel lblNewLabel = new JLabel("Notas e Conceitos Acadêmicos");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 42));
		lblNewLabel.setBounds(171, 44, 551, 73);
		contentPane.add(lblNewLabel);
		
		lbInformacoes = new JLabel("   Matr\u00EDcula                     Aluno                             AV1        AV2        Recupera\u00E7\u00E3o        Situa\u00E7\u00E3o");
		lbInformacoes.setForeground(new Color(255, 255, 255));
		lbInformacoes.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 20));
		lbInformacoes.setBounds(55, 252, 781, 31);
		lbInformacoes.setOpaque(true);
		lbInformacoes.setBackground(Color.decode("#DB252C"));
		contentPane.add(lbInformacoes);
		
		btnSalvar = new JButton("Salvar");			
		btnSalvar.setBackground(Color.decode("#008F26"));
		btnSalvar.setForeground(new Color(255, 255, 255));
		btnSalvar.setFont(new Font("Calibri", Font.BOLD, 16));		
		btnSalvar.setBounds(370, 585, 122, 45);
		btnSalvar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
										
				alunoEmExibicao.getMatricula();
				alunoEmExibicao.setPrimeira_nota(Double.parseDouble(textFieldAv1_1.getText()));
				alunoEmExibicao.setSegunda_nota(Double.parseDouble(textFieldAv2_1.getText()));
				alunoEmExibicao.setNota_recuperacao(Double.parseDouble(textFieldRecuperacao1.getText()));
				//GERANDO NOVA SITUACAO DO ALUNO BASEADO NAS NOVAS NOTAS
				alunoEmExibicao.setSituacao(alunoEmExibicao.verificarSituacao());
				
				AcademicDAO.getInstance().InserirNota(alunoEmExibicao);
				
				new ListaDeAlunos().setVisible(true);
				dispose();
			}
		});		
		
		contentPane.add(btnSalvar);						
		
		CreateViewModelAluno();
	}
	
	private void CreateViewModelAluno() 
	{
		
		MaskFormatter mascaraNotas = null;
		
		try
		{
            mascaraNotas = new MaskFormatter("##.##");
        }
        catch(ParseException excp) 
		{
        	JOptionPane.showMessageDialog(null, "Error de formatação", "Mesagem de Error Academic Notes", JOptionPane.ERROR_MESSAGE);
        }
		
		textFieldMatricula1 = new JTextField();
		textFieldMatricula1.setEditable(false);
		textFieldMatricula1.setBounds(55, 285, 115, 31);
		textFieldMatricula1.setText(""+ alunoEmExibicao.getMatricula());		
		textFieldMatricula1.setColumns(10);
		contentPane.add(textFieldMatricula1);
		
		textFieldAluno1 = new JTextField();
		textFieldAluno1.setEditable(false);
		textFieldAluno1.setBounds(171, 285, 268, 31);
		textFieldAluno1.setText(alunoEmExibicao.getNome());
		textFieldAluno1.setColumns(10);
		
		contentPane.add(textFieldAluno1);		
		
		textFieldAv1_1 = new JTextField();
		textFieldAv1_1 = new JFormattedTextField(mascaraNotas);
		textFieldAv1_1.setForeground(new Color(0, 0, 0));
		textFieldAv1_1.setBounds(439, 285, 71, 31);
		textFieldAv1_1.setText(""+ alunoEmExibicao.getPrimeira_nota());	
		textFieldAv1_1.setColumns(10);
		contentPane.add(textFieldAv1_1);
		
		textFieldAv2_1 = new JTextField();
		textFieldAv2_1 = new JFormattedTextField(mascaraNotas);
		textFieldAv2_1.setForeground(Color.BLACK);
		textFieldAv2_1.setColumns(10);
		textFieldAv2_1.setBounds(507, 285, 71, 31);
		textFieldAv2_1.setText(""+ alunoEmExibicao.getSegunda_nota());
		contentPane.add(textFieldAv2_1);
		
		textFieldRecuperacao1 = new JTextField();
		textFieldRecuperacao1 = new JFormattedTextField(mascaraNotas);
		textFieldRecuperacao1.setForeground(Color.BLACK);
		textFieldRecuperacao1.setColumns(10);
		textFieldRecuperacao1.setBounds(577, 285, 155, 31);
		textFieldRecuperacao1.setText(""+ alunoEmExibicao.getNota_recuperacao());
		contentPane.add(textFieldRecuperacao1);
		
		textFieldSituacao1 = new JTextField();
		textFieldSituacao1.setEditable(false);
		textFieldSituacao1.setForeground(Color.BLACK);
		textFieldSituacao1.setColumns(10);
		textFieldSituacao1.setBounds(731, 285, 105, 31);
		textFieldSituacao1.setText(""+ alunoEmExibicao.getSituacao());
		contentPane.add(textFieldSituacao1);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				new ListaDeAlunos().setVisible(true);
				dispose();
			}
		});
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setFont(new Font("Calibri", Font.BOLD, 16));
		btnVoltar.setBackground(new Color(0, 143, 38));
		btnVoltar.setBounds(507, 585, 122, 45);
		contentPane.add(btnVoltar);
	}	

}
