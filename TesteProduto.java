package Exercicios;

import java.util.Scanner;

public class TesteProduto {
	ProdutoDAO dao = new ProdutoDAO();

	public static void main(String[] args) {

		TesteProduto sistema = new TesteProduto();

		Scanner sc = new Scanner(System.in);
		System.out.println("---Abrindo a loja---");

		System.out.println("===Escolha a opção====");
		System.out.println("[1] Inserir.");
		System.out.println("[2] Atualizar.");
		System.out.println("[3] Consultar.");
		System.out.println("[4] Deletar.");
		int opcao = sc.nextInt();

		sc.nextLine();

		if (opcao == 1) {
			System.out.println("Digite o nome: ");
			String nome = sc.nextLine();

			System.out.println("Digite o preço: ");
			double preco = sc.nextDouble();

			sistema.inserirProduto(nome, preco);

		} else if (opcao == 2) {
			System.out.println("Digite o nome: ");
			String nome = sc.nextLine();

			System.out.println("Digite o id do produto: ");
			int id = sc.nextInt();

			sistema.atualizarProduto(nome, id);
		} else if (opcao == 3) {
			sistema.consultarProdutos();
		} else if (opcao == 4) {
			System.out.println("Digite o id do produto para deletar: ");
			int id = sc.nextInt();

			sistema.deletarProduto(id);
		} else {
			System.out.println("Opção Inválida.");
		}
	}

	public void inserirProduto(String nome, double preco) {

		Produto p1 = new Produto(nome, preco);
		// ProdutoDAO d1 = new ProdutoDAO();
		dao.inserirProduto(p1);
	}

	public void atualizarProduto(String nome, int id) {
		Produto p2 = new Produto(nome, id);
		// ProdutoDAO d2 = new ProdutoDAO();
		dao.atualizarProduto(p2);

	}

	public void consultarProdutos() {
		System.out.println("==Seus Produtos==");
		// ProdutoDAO d3 = new ProdutoDAO();
		dao.consultarProdutos();
	}

	public void deletarProduto(int id) {
		Produto p3 = new Produto(id);
		// ProdutoDAO d4 = new ProdutoDAO();
		dao.deletarProduto(p3);
	}
}
