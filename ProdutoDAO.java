package Exercicios;

import java.sql.*;

public class ProdutoDAO {

	public Connection conectar() throws SQLException {

		return DriverManager.getConnection("jdbc:mysql://localhost:3306/Produto", "", "");
	}

	public void inserirProduto(Produto p1) {
		try {

			Connection conn = conectar();

			String sql = "INSERT INTO produtos (nome, preco) VALUES (?,?)";
			PreparedStatement cmd = conn.prepareStatement(sql);

			cmd.setString(1, p1.getNome());
			cmd.setDouble(2, p1.getPreco());
			cmd.executeUpdate();

			System.out.println("Produto inserido com sucesso!");

			cmd.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

	public void atualizarProduto(Produto p2) {
		// Atualizar produtos
		try {
			Connection conn = conectar();

			String update = "UPDATE produtos SET nome = ? WHERE id = ?";
			PreparedStatement cmd2 = conn.prepareStatement(update);

			cmd2.setString(1, p2.getNome());
			cmd2.setInt(2, p2.getId());

			System.out.println("Produto atualizado com sucesso!");

			cmd2.executeUpdate();
			cmd2.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

	public void consultarProdutos() {
		try {
			// Mostrar todos os produtos
			Connection conn = conectar();
			String select = "SELECT * FROM produtos";
			PreparedStatement cmd3 = conn.prepareStatement(select);

			ResultSet resultado = cmd3.executeQuery();

			while (resultado.next()) {
				System.out.println("================");
				System.out.println("Nome: " + resultado.getString("nome"));
				System.out.println("Preço: R$ " + resultado.getDouble("preco"));
				System.out.println("=================");
			}
			resultado.close();
			cmd3.close();
			conn.close();
		} catch (

		SQLException e) {
			e.printStackTrace();

		}

	}

	public void deletarProduto(Produto p4) {
		try {
			// Deletar produto pelo id
			Connection conn = conectar();
			String delete = "DELETE FROM produtos WHERE id = ?";
			PreparedStatement cmd4 = conn.prepareStatement(delete);

			cmd4.setInt(1, p4.getId());
			cmd4.executeUpdate();

			System.out.println("Produto deletado com sucessor!");

			cmd4.close();
			conn.close();

		} catch (

		SQLException e) {
			e.printStackTrace();

		}
	}

}
