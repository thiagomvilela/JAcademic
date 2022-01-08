package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
<<<<<<< Updated upstream
import javax.swing.text.MaskFormatter;
=======
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import models.dao.AcademicDAO;
import models.dao.StudentDAO;
>>>>>>> Stashed changes

public class InserirNotas extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAv1_1;
	private JTextField textFieldRecuperacao1;
	private JTextField textFieldSituacao1;
	private JTextField textFieldAv2_1;
	private JTextField textFieldAv1_2;
	private JTextField textFieldAv2_2;
	private JTextField textFieldAv1_3;
	private JTextField textFieldAv2_3;
	private JTextField textFieldAv1_4;
	private JTextField textFieldAv2_4;
	private JTextField textFieldAv1_5;
	private JTextField textFieldAv2_5;
	private JTextField textFieldAv1_6;
	private JTextField textFieldAv2_6;
	private JTextField textFieldAv1_7;
	private JTextField textFieldAv2_7;
	private JTextField textFieldAv1_8;
	private JTextField textFieldAv2_8;
	private JTextField textFieldAv1_9;
	private JTextField textFieldAv2_9;
	private JTextField textFieldRecuperacao2;
	private JTextField textFieldRecuperacao3;
	private JTextField textFieldRecuperacao4;
	private JTextField textFieldRecuperacao5;
	private JTextField textFieldRecuperacao6;
	private JTextField textFieldRecuperacao7;
	private JTextField textFieldRecuperacao8;
	private JTextField textFieldRecuperacao9;
	private JTextField textFieldSituacao2;
	private JTextField textFieldSituacao3;
	private JTextField textFieldSituacao4;
	private JTextField textFieldSituacao5;
	private JTextField textFieldSituacao6;
	private JTextField textFieldSituacao7;
	private JTextField textFieldSituacao8;
	private JTextField textFieldSituacao9;
	private JTextField textFieldAv1_10;
	private JTextField textFieldAv1_11;
	private JTextField textFieldAv1_12;
	private JTextField textFieldAv2_10;
	private JTextField textFieldAv2_11;
	private JTextField textFieldAv2_12;
	private JTextField textFieldRecuperacao10;
	private JTextField textFieldRecuperacao11;
	private JTextField textFieldRecuperacao12;
	private JTextField textFieldSituacao10;
	private JTextField textFieldSituacao12;
	private JTextField textFieldSituacao11;
	private JLabel lbInformacoes;
	private JButton btnSalvar;
	private JTextField textFieldMatricula1;
	private JTextField textFieldMatricula2;
	private JTextField textFieldMatricula3;
	private JTextField textFieldMatricula4;
	private JTextField textFieldMatricula5;
	private JTextField textFieldMatricula6;
	private JTextField textFieldMatricula7;
	private JTextField textFieldMatricula8;
	private JTextField textFieldMatricula9;
	private JTextField textFieldMatricula10;
	private JTextField textFieldMatricula11;
	private JTextField textFieldMatricula12;
	private JTextField textFieldAluno1;
	private JTextField textFieldAluno2;
	private JTextField textFieldAluno3;
	private JTextField textFieldAluno4;
	private JTextField textFieldAluno5;
	private JTextField textFieldAluno6;
	private JTextField textFieldAluno7;
	private JTextField textFieldAluno8;
	private JTextField textFieldAluno9;
	private JTextField textFieldAluno10;
	private JTextField textFieldAluno11;
	private JTextField textFieldAluno12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
<<<<<<< Updated upstream

		
=======
		
		AcademicDAO.getInstance().DeleteDatabase();
        AcademicDAO.getInstance().initializeDatabase();
        
>>>>>>> Stashed changes
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InserirNotas frame = new InserirNotas();
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
	public InserirNotas() {
		
		super("Sistema de Gest�o de Docentes");
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
		
		MaskFormatter mascaraNotas = null;
		
		try{
            mascaraNotas = new MaskFormatter("##.##");
        }
        catch(ParseException excp) {
            System.err.println("Erro na formata��o: " + excp.getMessage());
            System.exit(-1);
        }
		
		JLabel lblNewLabel = new JLabel("Notas e Conceitos Acad\u00EAmicos");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 42));
		lblNewLabel.setBounds(170, 26, 551, 73);
		contentPane.add(lblNewLabel);
		
		textFieldAv1_1 = new JTextField();
		textFieldAv1_1 = new JFormattedTextField(mascaraNotas);
		textFieldAv1_1.setForeground(new Color(0, 0, 0));
		textFieldAv1_1.setColumns(10);
		textFieldAv1_1.setBounds(433, 156, 71, 31);
		contentPane.add(textFieldAv1_1);
		
		textFieldRecuperacao1 = new JTextField();
		textFieldRecuperacao1 = new JFormattedTextField(mascaraNotas);
		textFieldRecuperacao1.setForeground(Color.BLACK);
		textFieldRecuperacao1.setColumns(10);
		textFieldRecuperacao1.setBounds(571, 156, 155, 31);
		contentPane.add(textFieldRecuperacao1);
		
		textFieldSituacao1 = new JTextField();
		textFieldSituacao1.setEditable(false);
		textFieldSituacao1.setForeground(Color.BLACK);
		textFieldSituacao1.setColumns(10);
		textFieldSituacao1.setBounds(725, 156, 105, 31);
		contentPane.add(textFieldSituacao1);
		
		textFieldAv2_1 = new JTextField();
		textFieldAv2_1 = new JFormattedTextField(mascaraNotas);
		textFieldAv2_1.setForeground(Color.BLACK);
		textFieldAv2_1.setColumns(10);
		textFieldAv2_1.setBounds(501, 156, 71, 31);
		contentPane.add(textFieldAv2_1);
		
		textFieldAv1_2 = new JTextField();
		textFieldAv1_2 = new JFormattedTextField(mascaraNotas);
		textFieldAv1_2.setForeground(Color.BLACK);
		textFieldAv1_2.setColumns(10);
		textFieldAv1_2.setBounds(433, 189, 71, 31);
		contentPane.add(textFieldAv1_2);
		
		textFieldAv2_2 = new JTextField();
		textFieldAv2_2 = new JFormattedTextField(mascaraNotas);
		textFieldAv2_2.setForeground(Color.BLACK);
		textFieldAv2_2.setColumns(10);
		textFieldAv2_2.setBounds(501, 189, 71, 31);
		contentPane.add(textFieldAv2_2);
		
		textFieldAv1_3 = new JTextField();
		textFieldAv1_3 = new JFormattedTextField(mascaraNotas);
		textFieldAv1_3.setForeground(Color.BLACK);
		textFieldAv1_3.setColumns(10);
		textFieldAv1_3.setBounds(433, 223, 71, 31);
		contentPane.add(textFieldAv1_3);
		
		textFieldAv2_3 = new JTextField();
		textFieldAv2_3 = new JFormattedTextField(mascaraNotas);
		textFieldAv2_3.setForeground(Color.BLACK);
		textFieldAv2_3.setColumns(10);
		textFieldAv2_3.setBounds(501, 223, 71, 31);
		contentPane.add(textFieldAv2_3);
		
		textFieldAv1_4 = new JTextField();
		textFieldAv1_4 = new JFormattedTextField(mascaraNotas);
		textFieldAv1_4.setForeground(Color.BLACK);
		textFieldAv1_4.setColumns(10);
		textFieldAv1_4.setBounds(433, 258, 71, 31);
		contentPane.add(textFieldAv1_4);
		
		textFieldAv2_4 = new JTextField();
		textFieldAv2_4 = new JFormattedTextField(mascaraNotas);
		textFieldAv2_4.setForeground(Color.BLACK);
		textFieldAv2_4.setColumns(10);
		textFieldAv2_4.setBounds(501, 258, 71, 31);
		contentPane.add(textFieldAv2_4);
		
		textFieldAv1_5 = new JTextField();
		textFieldAv1_5 = new JFormattedTextField(mascaraNotas);
		textFieldAv1_5.setForeground(Color.BLACK);
		textFieldAv1_5.setColumns(10);
		textFieldAv1_5.setBounds(433, 293, 71, 31);
		contentPane.add(textFieldAv1_5);
		
		textFieldAv2_5 = new JTextField();
		textFieldAv2_5 = new JFormattedTextField(mascaraNotas);
		textFieldAv2_5.setForeground(Color.BLACK);
		textFieldAv2_5.setColumns(10);
		textFieldAv2_5.setBounds(501, 293, 71, 31);
		contentPane.add(textFieldAv2_5);
		
		textFieldAv1_6 = new JTextField();
		textFieldAv1_6 = new JFormattedTextField(mascaraNotas);
		textFieldAv1_6.setForeground(Color.BLACK);
		textFieldAv1_6.setColumns(10);
		textFieldAv1_6.setBounds(433, 326, 71, 31);
		contentPane.add(textFieldAv1_6);
		
		textFieldAv2_6 = new JTextField();
		textFieldAv2_6 = new JFormattedTextField(mascaraNotas);
		textFieldAv2_6.setForeground(Color.BLACK);
		textFieldAv2_6.setColumns(10);
		textFieldAv2_6.setBounds(501, 326, 71, 31);
		contentPane.add(textFieldAv2_6);
		
		textFieldAv1_7 = new JTextField();
		textFieldAv1_7 = new JFormattedTextField(mascaraNotas);
		textFieldAv1_7.setForeground(Color.BLACK);
		textFieldAv1_7.setColumns(10);
		textFieldAv1_7.setBounds(433, 359, 71, 31);
		contentPane.add(textFieldAv1_7);
		
		textFieldAv2_7 = new JTextField();
		textFieldAv2_7 = new JFormattedTextField(mascaraNotas);
		textFieldAv2_7.setForeground(Color.BLACK);
		textFieldAv2_7.setColumns(10);
		textFieldAv2_7.setBounds(501, 359, 71, 31);
		contentPane.add(textFieldAv2_7);
		
		textFieldAv1_8 = new JTextField();
		textFieldAv1_8 = new JFormattedTextField(mascaraNotas);
		textFieldAv1_8.setForeground(Color.BLACK);
		textFieldAv1_8.setColumns(10);
		textFieldAv1_8.setBounds(433, 393, 71, 31);
		contentPane.add(textFieldAv1_8);
		
		textFieldAv2_8 = new JTextField();
		textFieldAv2_8 = new JFormattedTextField(mascaraNotas);
		textFieldAv2_8.setForeground(Color.BLACK);
		textFieldAv2_8.setColumns(10);
		textFieldAv2_8.setBounds(501, 393, 71, 31);
		contentPane.add(textFieldAv2_8);
		
		textFieldAv1_9 = new JTextField();
		textFieldAv1_9 = new JFormattedTextField(mascaraNotas);
		textFieldAv1_9.setForeground(Color.BLACK);
		textFieldAv1_9.setColumns(10);
		textFieldAv1_9.setBounds(433, 428, 71, 31);
		contentPane.add(textFieldAv1_9);
		
		textFieldAv2_9 = new JTextField();
		textFieldAv2_9 = new JFormattedTextField(mascaraNotas);
		textFieldAv2_9.setForeground(Color.BLACK);
		textFieldAv2_9.setColumns(10);
		textFieldAv2_9.setBounds(501, 428, 71, 31);
		contentPane.add(textFieldAv2_9);
		
		textFieldRecuperacao2 = new JTextField();
		textFieldRecuperacao2 = new JFormattedTextField(mascaraNotas);
		textFieldRecuperacao2.setForeground(Color.BLACK);
		textFieldRecuperacao2.setColumns(10);
		textFieldRecuperacao2.setBounds(571, 189, 155, 31);
		contentPane.add(textFieldRecuperacao2);
		
		textFieldRecuperacao3 = new JTextField();
		textFieldRecuperacao3 = new JFormattedTextField(mascaraNotas);
		textFieldRecuperacao3.setForeground(Color.BLACK);
		textFieldRecuperacao3.setColumns(10);
		textFieldRecuperacao3.setBounds(571, 223, 155, 31);
		contentPane.add(textFieldRecuperacao3);
		
		textFieldRecuperacao4 = new JTextField();
		textFieldRecuperacao4 = new JFormattedTextField(mascaraNotas);
		textFieldRecuperacao4.setForeground(Color.BLACK);
		textFieldRecuperacao4.setColumns(10);
		textFieldRecuperacao4.setBounds(571, 258, 155, 31);
		contentPane.add(textFieldRecuperacao4);
		
		textFieldRecuperacao5 = new JTextField();
		textFieldRecuperacao5 = new JFormattedTextField(mascaraNotas);
		textFieldRecuperacao5.setForeground(Color.BLACK);
		textFieldRecuperacao5.setColumns(10);
		textFieldRecuperacao5.setBounds(571, 293, 155, 31);
		contentPane.add(textFieldRecuperacao5);
		
		textFieldRecuperacao6 = new JTextField();
		textFieldRecuperacao6 = new JFormattedTextField(mascaraNotas);
		textFieldRecuperacao6.setForeground(Color.BLACK);
		textFieldRecuperacao6.setColumns(10);
		textFieldRecuperacao6.setBounds(571, 326, 155, 31);
		contentPane.add(textFieldRecuperacao6);
		
		textFieldRecuperacao7 = new JTextField();
		textFieldRecuperacao7 = new JFormattedTextField(mascaraNotas);
		textFieldRecuperacao7.setForeground(Color.BLACK);
		textFieldRecuperacao7.setColumns(10);
		textFieldRecuperacao7.setBounds(571, 359, 155, 31);
		contentPane.add(textFieldRecuperacao7);
		
		textFieldRecuperacao8 = new JTextField();
		textFieldRecuperacao8 = new JFormattedTextField(mascaraNotas);
		textFieldRecuperacao8.setForeground(Color.BLACK);
		textFieldRecuperacao8.setColumns(10);
		textFieldRecuperacao8.setBounds(571, 393, 155, 31);
		contentPane.add(textFieldRecuperacao8);
		
		textFieldRecuperacao9 = new JTextField();
		textFieldRecuperacao9 = new JFormattedTextField(mascaraNotas);
		textFieldRecuperacao9.setForeground(Color.BLACK);
		textFieldRecuperacao9.setColumns(10);
		textFieldRecuperacao9.setBounds(571, 428, 155, 31);
		contentPane.add(textFieldRecuperacao9);
		
		textFieldSituacao2 = new JTextField();
		textFieldSituacao2.setEditable(false);
		textFieldSituacao2.setForeground(Color.BLACK);
		textFieldSituacao2.setColumns(10);
		textFieldSituacao2.setBounds(725, 189, 105, 31);
		contentPane.add(textFieldSituacao2);
		
		textFieldSituacao3 = new JTextField();
		textFieldSituacao3.setEditable(false);
		textFieldSituacao3.setForeground(Color.BLACK);
		textFieldSituacao3.setColumns(10);
		textFieldSituacao3.setBounds(725, 223, 105, 31);
		contentPane.add(textFieldSituacao3);
		
		textFieldSituacao4 = new JTextField();
		textFieldSituacao4.setEditable(false);
		textFieldSituacao4.setForeground(Color.BLACK);
		textFieldSituacao4.setColumns(10);
		textFieldSituacao4.setBounds(725, 258, 105, 31);
		contentPane.add(textFieldSituacao4);
		
		textFieldSituacao5 = new JTextField();
		textFieldSituacao5.setEditable(false);
		textFieldSituacao5.setForeground(Color.BLACK);
		textFieldSituacao5.setColumns(10);
		textFieldSituacao5.setBounds(725, 293, 105, 31);
		contentPane.add(textFieldSituacao5);
		
		textFieldSituacao6 = new JTextField();
		textFieldSituacao6.setEditable(false);
		textFieldSituacao6.setForeground(Color.BLACK);
		textFieldSituacao6.setColumns(10);
		textFieldSituacao6.setBounds(725, 326, 105, 31);
		contentPane.add(textFieldSituacao6);
		
		textFieldSituacao7 = new JTextField();
		textFieldSituacao7.setEditable(false);
		textFieldSituacao7.setForeground(Color.BLACK);
		textFieldSituacao7.setColumns(10);
		textFieldSituacao7.setBounds(725, 359, 105, 31);
		contentPane.add(textFieldSituacao7);
		
		textFieldSituacao8 = new JTextField();
		textFieldSituacao8.setEditable(false);
		textFieldSituacao8.setForeground(Color.BLACK);
		textFieldSituacao8.setColumns(10);
		textFieldSituacao8.setBounds(725, 393, 105, 31);
		contentPane.add(textFieldSituacao8);
		
		textFieldSituacao9 = new JTextField();
		textFieldSituacao9.setEditable(false);
		textFieldSituacao9.setForeground(Color.BLACK);
		textFieldSituacao9.setColumns(10);
		textFieldSituacao9.setBounds(725, 428, 105, 31);
		contentPane.add(textFieldSituacao9);
		
		textFieldAv1_10 = new JTextField();
		textFieldAv1_10 = new JFormattedTextField(mascaraNotas);
		textFieldAv1_10.setForeground(Color.BLACK);
		textFieldAv1_10.setColumns(10);
		textFieldAv1_10.setBounds(433, 462, 71, 31);
		contentPane.add(textFieldAv1_10);
		
		textFieldAv1_11 = new JTextField();
		textFieldAv1_11 = new JFormattedTextField(mascaraNotas);
		textFieldAv1_11.setForeground(Color.BLACK);
		textFieldAv1_11.setColumns(10);
		textFieldAv1_11.setBounds(433, 496, 71, 31);
		contentPane.add(textFieldAv1_11);
		
		textFieldAv1_12 = new JTextField();
		textFieldAv1_12 = new JFormattedTextField(mascaraNotas);
		textFieldAv1_12.setForeground(Color.BLACK);
		textFieldAv1_12.setColumns(10);
		textFieldAv1_12.setBounds(433, 530, 71, 31);
		contentPane.add(textFieldAv1_12);
		
		textFieldAv2_10 = new JTextField();
		textFieldAv2_10 = new JFormattedTextField(mascaraNotas);
		textFieldAv2_10.setForeground(Color.BLACK);
		textFieldAv2_10.setColumns(10);
		textFieldAv2_10.setBounds(501, 462, 71, 31);
		contentPane.add(textFieldAv2_10);
		
		textFieldAv2_11 = new JTextField();
		textFieldAv2_11 = new JFormattedTextField(mascaraNotas);
		textFieldAv2_11.setForeground(Color.BLACK);
		textFieldAv2_11.setColumns(10);
		textFieldAv2_11.setBounds(501, 496, 71, 31);
		contentPane.add(textFieldAv2_11);
		
		textFieldAv2_12 = new JTextField();
		textFieldAv2_12 = new JFormattedTextField(mascaraNotas);
		textFieldAv2_12.setForeground(Color.BLACK);
		textFieldAv2_12.setColumns(10);
		textFieldAv2_12.setBounds(501, 530, 71, 31);
		contentPane.add(textFieldAv2_12);
		
		textFieldRecuperacao10 = new JTextField();
		textFieldRecuperacao10 = new JFormattedTextField(mascaraNotas);
		textFieldRecuperacao10.setForeground(Color.BLACK);
		textFieldRecuperacao10.setColumns(10);
		textFieldRecuperacao10.setBounds(571, 462, 155, 31);
		contentPane.add(textFieldRecuperacao10);
		
		textFieldRecuperacao11 = new JTextField();
		textFieldRecuperacao11 = new JFormattedTextField(mascaraNotas);
		textFieldRecuperacao11.setForeground(Color.BLACK);
		textFieldRecuperacao11.setColumns(10);
		textFieldRecuperacao11.setBounds(571, 496, 155, 31);
		contentPane.add(textFieldRecuperacao11);
		
		textFieldRecuperacao12 = new JTextField();
		textFieldRecuperacao12 = new JFormattedTextField(mascaraNotas);
		textFieldRecuperacao12.setForeground(Color.BLACK);
		textFieldRecuperacao12.setColumns(10);
		textFieldRecuperacao12.setBounds(571, 530, 155, 31);
		contentPane.add(textFieldRecuperacao12);
		
		textFieldSituacao10 = new JTextField();
		textFieldSituacao10.setEditable(false);
		textFieldSituacao10.setForeground(Color.BLACK);
		textFieldSituacao10.setColumns(10);
		textFieldSituacao10.setBounds(725, 462, 105, 31);
		contentPane.add(textFieldSituacao10);
		
		textFieldSituacao12 = new JTextField();
		textFieldSituacao12.setEditable(false);
		textFieldSituacao12.setForeground(Color.BLACK);
		textFieldSituacao12.setColumns(10);
		textFieldSituacao12.setBounds(725, 530, 105, 31);
		contentPane.add(textFieldSituacao12);
		
		textFieldSituacao11 = new JTextField();
		textFieldSituacao11.setEditable(false);
		textFieldSituacao11.setForeground(Color.BLACK);
		textFieldSituacao11.setColumns(10);
		textFieldSituacao11.setBounds(725, 496, 105, 31);
		contentPane.add(textFieldSituacao11);
		
		lbInformacoes = new JLabel("   Matr\u00EDcula                     Aluno                             AV1        AV2        Recupera\u00E7\u00E3o        Situa\u00E7\u00E3o");
		lbInformacoes.setForeground(new Color(255, 255, 255));
		lbInformacoes.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 20));
		lbInformacoes.setBounds(49, 123, 781, 31);
		lbInformacoes.setOpaque(true);
		lbInformacoes.setBackground(Color.decode("#DB252C"));
		contentPane.add(lbInformacoes);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				var listaDeNotas = new ArrayList<String>();
                var dao = StudentDAO.getInstance();

                var listaDeEstudante = dao.findAll();

                textFieldAv1_1.setText(listaDeEstudante.get(5).getName());
			}
		});
		
		btnSalvar.setBackground(Color.decode("#008F26"));
		btnSalvar.setForeground(new Color(255, 255, 255));
		btnSalvar.setFont(new Font("Calibri", Font.BOLD, 16));
		
		btnSalvar.setBounds(395, 585, 122, 45);
		contentPane.add(btnSalvar);
		
		textFieldMatricula1 = new JTextField();
		textFieldMatricula1.setEditable(false);
		textFieldMatricula1.setBounds(49, 156, 115, 31);
		contentPane.add(textFieldMatricula1);
		textFieldMatricula1.setColumns(10);
		
		textFieldMatricula2 = new JTextField();
		textFieldMatricula2.setEditable(false);
		textFieldMatricula2.setColumns(10);
		textFieldMatricula2.setBounds(49, 189, 115, 31);
		contentPane.add(textFieldMatricula2);
		
		textFieldMatricula3 = new JTextField();
		textFieldMatricula3.setEditable(false);
		textFieldMatricula3.setColumns(10);
		textFieldMatricula3.setBounds(49, 223, 115, 31);
		contentPane.add(textFieldMatricula3);
		
		textFieldMatricula4 = new JTextField();
		textFieldMatricula4.setEditable(false);
		textFieldMatricula4.setColumns(10);
		textFieldMatricula4.setBounds(49, 258, 115, 31);
		contentPane.add(textFieldMatricula4);
		
		textFieldMatricula5 = new JTextField();
		textFieldMatricula5.setEditable(false);
		textFieldMatricula5.setColumns(10);
		textFieldMatricula5.setBounds(49, 293, 115, 31);
		contentPane.add(textFieldMatricula5);
		
		textFieldMatricula6 = new JTextField();
		textFieldMatricula6.setEditable(false);
		textFieldMatricula6.setColumns(10);
		textFieldMatricula6.setBounds(49, 326, 115, 31);
		contentPane.add(textFieldMatricula6);
		
		textFieldMatricula7 = new JTextField();
		textFieldMatricula7.setEditable(false);
		textFieldMatricula7.setColumns(10);
		textFieldMatricula7.setBounds(49, 359, 115, 31);
		contentPane.add(textFieldMatricula7);
		
		textFieldMatricula8 = new JTextField();
		textFieldMatricula8.setEditable(false);
		textFieldMatricula8.setColumns(10);
		textFieldMatricula8.setBounds(49, 393, 115, 31);
		contentPane.add(textFieldMatricula8);
		
		textFieldMatricula9 = new JTextField();
		textFieldMatricula9.setEditable(false);
		textFieldMatricula9.setColumns(10);
		textFieldMatricula9.setBounds(49, 428, 115, 31);
		contentPane.add(textFieldMatricula9);
		
		textFieldMatricula10 = new JTextField();
		textFieldMatricula10.setEditable(false);
		textFieldMatricula10.setColumns(10);
		textFieldMatricula10.setBounds(49, 462, 115, 31);
		contentPane.add(textFieldMatricula10);
		
		textFieldMatricula11 = new JTextField();
		textFieldMatricula11.setEditable(false);
		textFieldMatricula11.setColumns(10);
		textFieldMatricula11.setBounds(49, 496, 115, 31);
		contentPane.add(textFieldMatricula11);
		
		textFieldMatricula12 = new JTextField();
		textFieldMatricula12.setEditable(false);
		textFieldMatricula12.setColumns(10);
		textFieldMatricula12.setBounds(49, 530, 115, 31);
		contentPane.add(textFieldMatricula12);
		
		textFieldAluno1 = new JTextField();
		textFieldAluno1.setEditable(false);
		textFieldAluno1.setBounds(165, 156, 268, 31);
		contentPane.add(textFieldAluno1);
		textFieldAluno1.setColumns(10);
		
		textFieldAluno2 = new JTextField();
		textFieldAluno2.setEditable(false);
		textFieldAluno2.setColumns(10);
		textFieldAluno2.setBounds(165, 189, 268, 31);
		contentPane.add(textFieldAluno2);
		
		textFieldAluno3 = new JTextField();
		textFieldAluno3.setEditable(false);
		textFieldAluno3.setColumns(10);
		textFieldAluno3.setBounds(165, 223, 268, 31);
		contentPane.add(textFieldAluno3);
		
		textFieldAluno4 = new JTextField();
		textFieldAluno4.setEditable(false);
		textFieldAluno4.setColumns(10);
		textFieldAluno4.setBounds(165, 258, 268, 31);
		contentPane.add(textFieldAluno4);
		
		textFieldAluno5 = new JTextField();
		textFieldAluno5.setEditable(false);
		textFieldAluno5.setColumns(10);
		textFieldAluno5.setBounds(165, 293, 268, 31);
		contentPane.add(textFieldAluno5);
		
		textFieldAluno6 = new JTextField();
		textFieldAluno6.setEditable(false);
		textFieldAluno6.setColumns(10);
		textFieldAluno6.setBounds(165, 326, 268, 31);
		contentPane.add(textFieldAluno6);
		
		textFieldAluno7 = new JTextField();
		textFieldAluno7.setEditable(false);
		textFieldAluno7.setColumns(10);
		textFieldAluno7.setBounds(165, 359, 268, 31);
		contentPane.add(textFieldAluno7);
		
		textFieldAluno8 = new JTextField();
		textFieldAluno8.setEditable(false);
		textFieldAluno8.setColumns(10);
		textFieldAluno8.setBounds(165, 393, 268, 31);
		contentPane.add(textFieldAluno8);
		
		textFieldAluno9 = new JTextField();
		textFieldAluno9.setEditable(false);
		textFieldAluno9.setColumns(10);
		textFieldAluno9.setBounds(165, 428, 268, 31);
		contentPane.add(textFieldAluno9);
		
		textFieldAluno10 = new JTextField();
		textFieldAluno10.setEditable(false);
		textFieldAluno10.setColumns(10);
		textFieldAluno10.setBounds(165, 462, 268, 31);
		contentPane.add(textFieldAluno10);
		
		textFieldAluno11 = new JTextField();
		textFieldAluno11.setEditable(false);
		textFieldAluno11.setColumns(10);
		textFieldAluno11.setBounds(165, 496, 268, 31);
		contentPane.add(textFieldAluno11);
		
		textFieldAluno12 = new JTextField();
		textFieldAluno12.setEditable(false);
		textFieldAluno12.setColumns(10);
		textFieldAluno12.setBounds(165, 530, 268, 31);
		contentPane.add(textFieldAluno12);

		
	}
}
