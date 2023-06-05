package lp.model;

public class LpModel {
	
	private String nome;
	private String cantor;
	private int ano;
	
	
	public LpModel() {
		
	}
	
	public LpModel(String nome, String cantor, int ano) {
		this.ano = ano;
		this.cantor = cantor;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCantor() {
		return cantor;
	}

	public void setCantor(String cantor) {
		this.cantor = cantor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
	

}
