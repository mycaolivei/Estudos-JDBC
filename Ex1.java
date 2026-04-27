package Exercicios;

import java.sql.*;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("===Escolha a opção====");
		System.out.println("[1] Inserir.");
		System.out.println("[2] Atualizar.");
		System.out.println("[3] Consultar.");
		System.out.println("[4] Deletar.");
		int opcao = sc.nextInt();

		sc.nextLine();

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Produto", "", ""

			);

			if (opcao == 1) {
				// Inserir produto
				String sql = "INSERT INTO produtos (nome, preco) VALUES (?,?)";
				PreparedStatement cmd = conn.prepareStatement(sql);

				System.out.println("Digite o nome do produto: ");
				String nomeProduto = sc.nextLine();
				String nomeLimpo = nomeProduto.trim();

				while (nomeLimpo.isEmpty()) {

					System.out.println("Nome Inválido.");
					System.out.println("Digite o nome novamente: ");
					String nome2 = sc.nextLine();
					nomeLimpo = nome2.trim();

				}
				System.out.println("Digite o preço do produto: ");
				double precoProduto = sc.nextDouble();

				while (precoProduto <= 0) {
					System.out.println("Digite um preço válido.");
					System.out.println("Digite o preço novamente: ");
					precoProduto = sc.nextDouble();
				}

				cmd.setString(1, nomeLimpo);
				cmd.setDouble(2, precoProduto);

				cmd.execute();
				cmd.close();

			} else if (opcao == 2) {
				// Atualizar produtos
				String update = "UPDATE produtos SET nome = ? WHERE id = ?";
				PreparedStatement cmd2 = conn.prepareStatement(update);

				System.out.println("Qual produto deseja atualizar?\nDigite o id: ");
				int idProduto = sc.nextInt();

				sc.nextLine();
				while (idProduto <= 0) {
					System.out.println("Id inexistente.");
					System.out.println("Digite um id válido.");
					idProduto = sc.nextInt();

					sc.nextLine();
				}
				System.out.println("Digite o novo nome: ");
				String novoNome = sc.nextLine();
				String novoNome2 = novoNome.trim();

				while (novoNome2.isEmpty()) {
					System.out.println("Nome Inválido.");
					System.out.println("Digite um novo nome: ");
					String nome3 = sc.nextLine();
					novoNome2 = nome3.trim();

				}

				cmd2.setString(1, novoNome2);
				cmd2.setInt(2, idProduto);
				cmd2.executeUpdate();

			} else if (opcao == 3) { // Mostrar todos os produtos

				String select = "SELECT * FROM produtos";
				PreparedStatement cmd4 = conn.prepareStatement(select);

				ResultSet resultado = cmd4.executeQuery();

				while (resultado.next()) {
					System.out.println("================");
					System.out.println("Nome: " + resultado.getString("nome"));
					System.out.println("Preço: R$ " + resultado.getDouble("preco"));
					System.out.println("=================");
				}

			} else if (opcao == 4) { // Deletar produto pelo id
				String delete = "DELETE FROM produtos WHERE id = ?";
				PreparedStatement cmd3 = conn.prepareStatement(delete);

				System.out.println("Digite o id do produto que você deseja deletar: ");
				int idDeletar = sc.nextInt();
				while (idDeletar <= 0) {
					System.out.println("ID iválido.");
					System.out.println("Digite um id novamente:");
					idDeletar = sc.nextInt();
					sc.nextLine();
				}

				cmd3.setInt(1, idDeletar);
				cmd3.executeUpdate();
			}

		} catch (

		SQLException e) {
			e.printStackTrace();

		}
	}

}
