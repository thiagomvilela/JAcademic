package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.Font;
import java.text.ParseException;

import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JTable;

public class InserirNotas extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAv1_1;
	private JTextField textFieldRecuperacao1;
	private JTextField textFieldMedia1;
	private JTextField textFieldAv2_1;
	private JTextPane textPaneMatricula1;
	private JTextPane textPaneAluno1;
	private JTextPane textPaneMatricula2;
	private JTextPane textPaneAluno2;
	private JTextPane textPaneMatricula3;
	private JTextPane textPaneAluno3;
	private JTextPane textPaneMatricula4;
	private JTextPane textPaneAluno4;
	private JTextPane textPaneMatricula5;
	private JTextPane textPaneAluno5;
	private JTextPane textPaneMatricula6;
	private JTextPane textPaneAluno6;
	private JTextPane textPaneMatricula7;
	private JTextPane textPaneAluno7;
	private JTextPane textPaneMatricula8;
	private JTextPane textPaneAluno8;
	private JTextPane textPaneMatricula9;
	private JTextPane textPaneAluno9;
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
	private JTextField textFieldMedia2;
	private JTextField textFieldMedia3;
	private JTextField textFieldMedia4;
	private JTextField textFieldMedia5;
	private JTextField textFieldMedia6;
	private JTextField textFieldMedia7;
	private JTextField textFieldMedia8;
	private JTextField textFieldMedia9;
	private JTextPane textPaneMatricula10;
	private JTextPane textPaneMatricula11;
	private JTextPane textPaneMatricula12;
	private JTextPane textPaneAluno10;
	private JTextPane textPaneAluno11;
	private JTextPane textPaneAluno12;
	private JTextField textFieldAv1_10;
	private JTextField textFieldAv1_11;
	private JTextField textFieldAv1_12;
	private JTextField textFieldAv2_10;
	private JTextField textFieldAv2_11;
	private JTextField textFieldAv2_12;
	private JTextField textFieldRecuperacao10;
	private JTextField textFieldRecuperacao11;
	private JTextField textFieldRecuperacao12;
	private JTextField textFieldMedia10;
	private JTextField textFieldMedia12;
	private JTextField textFieldMedia11;
	private JLabel lbInformacoes;
	private JButton btnSalvar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		
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
		
		textFieldMedia1 = new JTextField();
		textFieldMedia1.setForeground(Color.BLACK);
		textFieldMedia1.setColumns(10);
		textFieldMedia1.setBounds(725, 156, 105, 31);
		contentPane.add(textFieldMedia1);
		
		textFieldAv2_1 = new JTextField();
		textFieldAv2_1 = new JFormattedTextField(mascaraNotas);
		textFieldAv2_1.setForeground(Color.BLACK);
		textFieldAv2_1.setColumns(10);
		textFieldAv2_1.setBounds(501, 156, 71, 31);
		contentPane.add(textFieldAv2_1);
		
		textPaneMatricula1 = new JTextPane();
		textPaneMatricula1.setBounds(49, 156, 115, 31);
		contentPane.add(textPaneMatricula1);
		
		textPaneAluno1 = new JTextPane();
		textPaneAluno1.setBounds(165, 156, 268, 31);
		contentPane.add(textPaneAluno1);
		
		textPaneMatricula2 = new JTextPane();
		textPaneMatricula2.setBounds(49, 189, 115, 31);
		contentPane.add(textPaneMatricula2);
		
		textPaneAluno2 = new JTextPane();
		textPaneAluno2.setBounds(165, 189, 268, 31);
		contentPane.add(textPaneAluno2);
		
		textPaneMatricula3 = new JTextPane();
		textPaneMatricula3.setBounds(49, 223, 115, 31);
		contentPane.add(textPaneMatricula3);
		
		textPaneAluno3 = new JTextPane();
		textPaneAluno3.setBounds(165, 223, 268, 31);
		contentPane.add(textPaneAluno3);
		
		textPaneMatricula4 = new JTextPane();
		textPaneMatricula4.setBounds(49, 258, 115, 31);
		contentPane.add(textPaneMatricula4);
		
		textPaneAluno4 = new JTextPane();
		textPaneAluno4.setBounds(165, 258, 268, 31);
		contentPane.add(textPaneAluno4);
		
		textPaneMatricula5 = new JTextPane();
		textPaneMatricula5.setBounds(49, 293, 115, 31);
		contentPane.add(textPaneMatricula5);
		
		textPaneAluno5 = new JTextPane();
		textPaneAluno5.setBounds(165, 293, 268, 31);
		contentPane.add(textPaneAluno5);
		
		textPaneMatricula6 = new JTextPane();
		textPaneMatricula6.setBounds(49, 326, 115, 31);
		contentPane.add(textPaneMatricula6);
		
		textPaneAluno6 = new JTextPane();
		textPaneAluno6.setBounds(165, 326, 268, 31);
		contentPane.add(textPaneAluno6);
		
		textPaneMatricula7 = new JTextPane();
		textPaneMatricula7.setBounds(49, 359, 115, 31);
		contentPane.add(textPaneMatricula7);
		
		textPaneAluno7 = new JTextPane();
		textPaneAluno7.setBounds(165, 359, 268, 31);
		contentPane.add(textPaneAluno7);
		
		textPaneMatricula8 = new JTextPane();
		textPaneMatricula8.setBounds(49, 393, 115, 31);
		contentPane.add(textPaneMatricula8);
		
		textPaneAluno8 = new JTextPane();
		textPaneAluno8.setBounds(165, 393, 268, 31);
		contentPane.add(textPaneAluno8);
		
		textPaneMatricula9 = new JTextPane();
		textPaneMatricula9.setBounds(49, 428, 115, 31);
		contentPane.add(textPaneMatricula9);
		
		textPaneAluno9 = new JTextPane();
		textPaneAluno9.setBounds(165, 428, 268, 31);
		contentPane.add(textPaneAluno9);
		
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
		textFieldRecuperacao1 = new JFormattedTextField(mascaraNotas);
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
		
		textFieldMedia2 = new JTextField();
		textFieldMedia2.setForeground(Color.BLACK);
		textFieldMedia2.setColumns(10);
		textFieldMedia2.setBounds(725, 189, 105, 31);
		contentPane.add(textFieldMedia2);
		
		textFieldMedia3 = new JTextField();
		textFieldMedia3.setForeground(Color.BLACK);
		textFieldMedia3.setColumns(10);
		textFieldMedia3.setBounds(725, 223, 105, 31);
		contentPane.add(textFieldMedia3);
		
		textFieldMedia4 = new JTextField();
		textFieldMedia4.setForeground(Color.BLACK);
		textFieldMedia4.setColumns(10);
		textFieldMedia4.setBounds(725, 258, 105, 31);
		contentPane.add(textFieldMedia4);
		
		textFieldMedia5 = new JTextField();
		textFieldMedia5.setForeground(Color.BLACK);
		textFieldMedia5.setColumns(10);
		textFieldMedia5.setBounds(725, 293, 105, 31);
		contentPane.add(textFieldMedia5);
		
		textFieldMedia6 = new JTextField();
		textFieldMedia6.setForeground(Color.BLACK);
		textFieldMedia6.setColumns(10);
		textFieldMedia6.setBounds(725, 326, 105, 31);
		contentPane.add(textFieldMedia6);
		
		textFieldMedia7 = new JTextField();
		textFieldMedia7.setForeground(Color.BLACK);
		textFieldMedia7.setColumns(10);
		textFieldMedia7.setBounds(725, 359, 105, 31);
		contentPane.add(textFieldMedia7);
		
		textFieldMedia8 = new JTextField();
		textFieldMedia8.setForeground(Color.BLACK);
		textFieldMedia8.setColumns(10);
		textFieldMedia8.setBounds(725, 393, 105, 31);
		contentPane.add(textFieldMedia8);
		
		textFieldMedia9 = new JTextField();
		textFieldMedia9.setForeground(Color.BLACK);
		textFieldMedia9.setColumns(10);
		textFieldMedia9.setBounds(725, 428, 105, 31);
		contentPane.add(textFieldMedia9);
		
		textPaneMatricula10 = new JTextPane();
		textPaneMatricula10.setBounds(49, 462, 115, 31);
		contentPane.add(textPaneMatricula10);
		
		textPaneMatricula11 = new JTextPane();
		textPaneMatricula11.setBounds(49, 496, 115, 31);
		contentPane.add(textPaneMatricula11);
		
		textPaneMatricula12 = new JTextPane();
		textPaneMatricula12.setBounds(49, 530, 115, 31);
		contentPane.add(textPaneMatricula12);
		
		textPaneAluno10 = new JTextPane();
		textPaneAluno10.setBounds(165, 462, 268, 31);
		contentPane.add(textPaneAluno10);
		
		textPaneAluno11 = new JTextPane();
		textPaneAluno11.setBounds(165, 496, 268, 31);
		contentPane.add(textPaneAluno11);
		
		textPaneAluno12 = new JTextPane();
		textPaneAluno12.setBounds(165, 530, 268, 31);
		contentPane.add(textPaneAluno12);
		
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
		
		textFieldMedia10 = new JTextField();
		textFieldMedia10.setForeground(Color.BLACK);
		textFieldMedia10.setColumns(10);
		textFieldMedia10.setBounds(725, 462, 105, 31);
		contentPane.add(textFieldMedia10);
		
		textFieldMedia12 = new JTextField();
		textFieldMedia12.setForeground(Color.BLACK);
		textFieldMedia12.setColumns(10);
		textFieldMedia12.setBounds(725, 530, 105, 31);
		contentPane.add(textFieldMedia12);
		
		textFieldMedia11 = new JTextField();
		textFieldMedia11.setForeground(Color.BLACK);
		textFieldMedia11.setColumns(10);
		textFieldMedia11.setBounds(725, 496, 105, 31);
		contentPane.add(textFieldMedia11);
		
		lbInformacoes = new JLabel("   Matr\u00EDcula                     Aluno                             AV1        AV2        Recupera\u00E7\u00E3o         M\u00E9dia");
		lbInformacoes.setForeground(new Color(255, 255, 255));
		lbInformacoes.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 20));
		lbInformacoes.setBounds(49, 123, 781, 31);
		lbInformacoes.setOpaque(true);
		lbInformacoes.setBackground(Color.decode("#DB252C"));
		contentPane.add(lbInformacoes);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(Color.decode("#008F26"));
		btnSalvar.setForeground(new Color(255, 255, 255));
		btnSalvar.setFont(new Font("Calibri", Font.BOLD, 16));
		
		btnSalvar.setBounds(395, 585, 122, 45);
		contentPane.add(btnSalvar);

		
	}
}
