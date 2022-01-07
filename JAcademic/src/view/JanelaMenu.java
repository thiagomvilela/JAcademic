package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class JanelaMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaMenu frame = new JanelaMenu();
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
	public JanelaMenu() {
		
		super("Sistema de Gestão de Docentes");
		setBackground(new Color(0, 255, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(900, 700);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#25DB55"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnInserirNotas = new JButton("Inserir notas");
		btnInserirNotas.setContentAreaFilled(false);
		btnInserirNotas.setOpaque(true);
		btnInserirNotas.setBackground(Color.decode("#DB252C"));
		btnInserirNotas.setForeground(new Color(255, 255, 255));
		btnInserirNotas.setFont(new Font("Calibri", Font.BOLD, 20));
		btnInserirNotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new InserirNotas().setVisible(true);
			}
		});
		btnInserirNotas.setBounds(554, 244, 221, 92);
		contentPane.add(btnInserirNotas);
		
		JButton btnVisualizarNotas = new JButton("Relat\u00F3rio geral");
		btnVisualizarNotas.setForeground(new Color(255, 255, 255));
		btnVisualizarNotas.setContentAreaFilled(false);
		btnVisualizarNotas.setOpaque(true);
		btnVisualizarNotas.setBackground(Color.decode("#DB252C"));
		btnVisualizarNotas.setFont(new Font("Calibri", Font.BOLD, 20));
		btnVisualizarNotas.setBounds(327, 404, 221, 92);
		contentPane.add(btnVisualizarNotas);
		
		JButton btnRelatorioGeral = new JButton("Visualizar notas");
		btnRelatorioGeral.setForeground(new Color(255, 255, 255));
		btnRelatorioGeral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRelatorioGeral.setFont(new Font("Calibri", Font.BOLD, 20));
		btnRelatorioGeral.setBounds(112, 243, 221, 94);
		btnRelatorioGeral.setContentAreaFilled(false);
		btnRelatorioGeral.setOpaque(true);
		btnRelatorioGeral.setBackground(Color.decode("#DB252C"));
		contentPane.add(btnRelatorioGeral);
		
		JLabel lblNewLabel = new JLabel("\u00C1rea do Professor");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 42));
		lblNewLabel.setBounds(298, 11, 322, 68);
		contentPane.add(lblNewLabel);
	}
}
