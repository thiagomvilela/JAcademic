package models;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class AlunoTableModel extends AbstractTableModel
{

	private List<Aluno> dados = new ArrayList<>();
	private String[] colunaStrings = {"Matrícula", "Aluno", "Av1", "Av2", "Recuperação", "Situação"};
	
	public AlunoTableModel() 
	{
		dados = AcademicDAO.getInstance().findAll();
	}
	
	@Override
	public String getColumnName(int column) {
		
		return colunaStrings[column];
	}
	
	@Override
	public int getRowCount() 
	{		
		return dados.size();
	}

	@Override
	public int getColumnCount() 
	{		
		return colunaStrings.length;
	}

	@Override
	public Object getValueAt(int linha, int coluna) 
	{		
		switch (coluna) 
		{
			case 0:
				return dados.get(linha).getMatricula();
			case 1:
				return dados.get(linha).getNome();
			case 2:
				return dados.get(linha).getPrimeira_nota();
			case 3:
				return dados.get(linha).getSegunda_nota();
			case 4:
				return dados.get(linha).getNota_recuperacao();
			case 5:
				return dados.get(linha).getSituacao();
		}		
		
		return null;
	}

}
