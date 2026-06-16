package Exercicios;

public class Produto {
	private int id;
	private String nome;
	private double preco;

	public Produto(int id, String nome, double preco) {
		this.setId(id);
		this.setNome(nome);
		this.setPreco(preco);
		
	}
	public  Produto(String nome, double preco) {
		this.setNome(nome);
		this.setPreco(preco);
	}
	public Produto(int id) {
		this.setId(id);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id <= 0) {
			return;
		}
		this.id = id;
	}

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {
		if (nome == null) {
			return;
		}
		String nomelimpo = nome.trim();
		if (nomelimpo.isEmpty()) {
			return;
		}
		this.nome = nomelimpo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco <= 0) {
			return;
		}
		this.preco = preco;
	}

}
