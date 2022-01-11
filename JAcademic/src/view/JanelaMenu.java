package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

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
		
		
		JButton btnVisualizarNotas = new JButton("Visualizar notas");
		btnVisualizarNotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				new ListaDeAlunos().setVisible(true);				
				
			}
		});
		btnVisualizarNotas.setForeground(new Color(255, 255, 255));
		btnVisualizarNotas.setContentAreaFilled(false);
		btnVisualizarNotas.setOpaque(true);
		btnVisualizarNotas.setBackground(Color.decode("#DB252C"));
		btnVisualizarNotas.setFont(new Font("Calibri", Font.BOLD, 20));
		btnVisualizarNotas.setBounds(342, 245, 221, 92);
		contentPane.add(btnVisualizarNotas);
		
		JButton btnRelatorioGeral = new JButton("Relatório Geral");
		btnRelatorioGeral.setForeground(new Color(255, 255, 255));
		btnRelatorioGeral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Implemetar
				
			}
		});
		btnRelatorioGeral.setFont(new Font("Calibri", Font.BOLD, 20));
		btnRelatorioGeral.setBounds(342, 413, 221, 94);
		btnRelatorioGeral.setContentAreaFilled(false);
		btnRelatorioGeral.setOpaque(true);
		btnRelatorioGeral.setBackground(Color.decode("#DB252C"));
		contentPane.add(btnRelatorioGeral);
		
		JLabel lblNewLabel = new JLabel("Área do Professor");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 42));
		lblNewLabel.setBounds(298, 11, 322, 68);
		contentPane.add(lblNewLabel);
	}
}