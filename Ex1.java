package Exercicios;

import java.sql.*;

public class Ex1 {
	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306:Produto", "", "");

			// Inserir produto
			String sql = "INSERT INTO produtos (nome, preco) VALUES (?,?)";
			PreparedStatement cmd = conn.prepareStatement(sql);

			cmd.setString(1, "Blusa Sport Feminina");
			cmd.setDouble(2, 190.00);

			cmd.execute();
			cmd.close();

			// Atualizar produtos
			String Update = "UPDATE produtos SET nome = ? WHERE id = ?";
			PreparedStatement cmd2 = conn.prepareStatement(Update);

			cmd2.setString(1, "Blusa Sport Feminina");
			cmd2.setInt(2, 7);
			cmd2.executeUpdate();

			// Deletar produto pelo id
			String delete = "DELETE FROM produtos WHERE id = ?";
			PreparedStatement cmd3 = conn.prepareStatement(delete);
			cmd3.setInt(1, 2);
			cmd3.executeUpdate();

			// Mostrar todos os produtos
			String select = "SELECT * FROM produtos";
			PreparedStatement cmd4 = conn.prepareStatement(select);

			ResultSet resultado = cmd4.executeQuery();

			while (resultado.next()) {
				System.out.println("================");
				System.out.println("Nome: " + resultado.getString("nome"));
				System.out.println("Preço: R$ " + resultado.getDouble("preco"));
				System.out.println("=================");
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

}
