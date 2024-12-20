package Trabalho01_Singleton;

public class Usuario {
	
	private int codigo;
	private String nome;
	
	public Usuario(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Usuario [codigo=" + codigo + ", nome=" + nome + "]";
	}
}
