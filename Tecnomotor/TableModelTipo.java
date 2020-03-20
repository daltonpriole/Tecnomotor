package tabelas_tipo2;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TableModelTipo extends AbstractTableModel {
	
	// atributo desta classe para armazenar a lista de pessoas
	private ArrayList<Tipo> listaDeTipos;
	
	// construtor, apenas cria a lista de pessoas
	public TableModelTipo() {
		
		listaDeTipos = new ArrayList<Tipo>();
	}
	
	// vetor de strings com os titulos das colunas
	private String[] colunas = { "Nome do Tipo", "Id do Tipo" };
	
	//
	// métodos para gerenciar o conteúdo da tabela
	//
	
	
	// Eh só colocar na lista!
	public void addTipo(Tipo pTipo) {
		
		this.listaDeTipos.add(pTipo);
		// notifica a tabela que houve uma mudança
		fireTableDataChanged();
	}
	
	
	// a linha na tabela é a mesma posição na lista
	public void removerTipo(int rowIndex) {
		
		this.listaDeTipos.remove(rowIndex);
		// notifica a tabela que houve uma mudança
		fireTableDataChanged();
	}
	
	// recupera os dados da tabela (da lista)
	public Tipo getTipo(int rowIndex) {
		
		return this.listaDeTipos.get(rowIndex); 
	}
	
	// método que retorna o número de linhas da tabela
	// este valor é o mesmo número  na lista
	@Override
	public int getRowCount() {
		
		return this.listaDeTipos.size();
	}

	// método que retorna o número de colunas da tabela
	// no nosso caso, eh sempre 2 !!!
	@Override
	public int getColumnCount() {
		
		return 2;
	}

	// metodo que retorna um valor da tabela, numa linha e coluna específica
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		// vamos retornar o valor conforme a coluna especificada
		switch(columnIndex) {
		
		case 0: // nome da pessoa
			return this.listaDeTipos.get(rowIndex).getNome();
			
		case 1: // idade da pessoa
			return this.listaDeTipos.get(rowIndex).getIdade();
			
		// caso default, não ficou muito claro, devolve null, ou
        
		// Deve ser desnecessário.
		default:
			return this.listaDeTipos.get(rowIndex);
		}
		
	}
	
	// método para definir os títulos das colunas
	@Override
	public String getColumnName(int columnIndex) {
		
		return this.colunas[columnIndex];
	}
}




