package tabelas_tipo2;

public class Tipo {
	
	private String nome;
	private int id;
	
	public Tipo(String nome, int id) {
		
		this.nome = nome;
		this.id = id;
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public int getId() {
		
		return id;
	}
	
	public void setIdade(int id) {
		
		this.id = id;
	}
}
