package aluno.model;

public class AlunoModel {

	private String nome;
	private String endereco;
	private Integer codigo;
	
	
	public AlunoModel() {
		
	}
	
	public AlunoModel(String nome, String endereco, Integer codigo) {
		this.nome = nome;
		this.endereco = endereco;
		this.codigo = codigo;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	
	
	
	
}
