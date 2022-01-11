package view;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListaDeAlunos extends JFrame {
	
	private JTable table;
	private JTextField matriculaDeBusca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try 
				{					
					ListaDeAlunos frame = new ListaDeAlunos();
					
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
	public ListaDeAlunos() 
	{
		super("Lista De Alunos");
		
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(900, 700);
		setLocationRelativeTo(null);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setBackground(new Color(37, 219, 85));
		contentPane.setBounds(0, 0, 884, 661);
		getContentPane().add(contentPane);
		
		JLabel lblNewLabel_1 = new JLabel("Notas e Conceitos Acad\u00EAmicos");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 42));
		lblNewLabel_1.setBounds(170, 26, 551, 73);
		contentPane.add(lblNewLabel_1);
		
		JButton btnSalvar = new JButton("Inserir Notas");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				var matricula = Integer.parseInt(matriculaDeBusca.getText());
				var viewInserirNotas = new InserirNotas(matricula);	
				
				dispose();
				viewInserirNotas.setVisible(true);			
				
			}
		});
		
		btnSalvar.setForeground(Color.WHITE);
		btnSalvar.setFont(new Font("Calibri", Font.BOLD, 16));
		btnSalvar.setBackground(new Color(0, 143, 38));
		btnSalvar.setBounds(538, 584, 122, 45);
		contentPane.add(btnSalvar);
		
		table = new JTable();
		table.setBounds(69, 98, 758, 455);
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("MATR\u00CDCULA DO ALUNO: ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblNewLabel.setBounds(54, 587, 372, 45);
		contentPane.add(lblNewLabel);
		
		matriculaDeBusca = new JTextField();
		matriculaDeBusca.setBounds(301, 584, 227, 45);
		contentPane.add(matriculaDeBusca);
		matriculaDeBusca.setColumns(10);
		setSize(900, 700);
		
	}
}
