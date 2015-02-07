package br.com.globalcode.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.globalcode.beans.Produto;
import br.com.globalcode.util.GlobalcodeException;

public class ProdutoDB {
	public void createTable() throws GlobalcodeException {
		Connection conn = ConnectionManager.getConexao();
		Statement stmt = null;
		String sql = "CREATE TABLE IF NOT EXISTS produtos";
		sql += " (id int(3) NOT NULL AUTO_INCREMENT PRIMARY KEY,";
		sql += " nome varchar(20) NOT NULL, ";
		sql += " preco int(10) NOT NULL)";
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Tabela de produtos criada com sucesso");
		} catch (SQLException e) {
			throw new GlobalcodeException("Erro na criacao da tabela produtos",
					e);
		} finally {
			ConnectionManager.close(conn, stmt);
		}
	}

	public void save(Produto produto) throws GlobalcodeException {
		Statement stmt = null;
		String sql = null;
		// Se o id for igual a zero o produto ainda não existe no banco,
		// portanto
		// faremos um INSERT caso contrário faremos um UPDATE
		if (produto.getId() == 0) {
			sql = "INSERT INTO produtos (nome ,preco) ";
			sql += "  VALUES ('" + produto.getNome() + "', ";
			sql += produto.getPreco() + " )";
		} else {
			sql = "UPDATE produtos SET nome = '" + produto.getNome() + "',";
			sql += " preco = " + produto.getPreco();
			sql += " WHERE id = " + produto.getId();
		}
		Connection conn = ConnectionManager.getConexao();
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("SQL = " + sql);
		} catch (SQLException e) {
			throw new GlobalcodeException("Erro na execucao da query " + sql, e);
		} finally {
			ConnectionManager.close(conn, stmt);
		}
	}

	public Produto getProduto(int id) throws GlobalcodeException {
		String sql = "SELECT * FROM produtos WHERE id = " + id;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Produto produto = null;
		try {
			conn = ConnectionManager.getConexao();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				String nome = rs.getString("nome");
				int preco = rs.getInt("preco");
				produto = new Produto(id, nome, preco);
			}
		} catch (SQLException e) {
			throw new GlobalcodeException("Erro na execucao do select: " + sql,
					e);
		} finally {
			ConnectionManager.close(conn, stmt, rs);
		}
		return produto;
	}

	public List getAllProdutos() throws GlobalcodeException {
		String sql = "SELECT * FROM produtos";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List produtos = new ArrayList();
		try {
			conn = ConnectionManager.getConexao();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String nome = rs.getString("nome");
				int preco = rs.getInt("preco");
				int id = rs.getInt("id");
				produtos.add(new Produto(id, nome, preco));
			}
		} catch (SQLException e) {
			throw new GlobalcodeException("Erro na execucao do select: " + sql,
					e);
		} finally {
			ConnectionManager.close(conn, stmt, rs);
		}
		return produtos;
	}
	public int delete(int id) throws GlobalcodeException {
		Connection conn = null;
		PreparedStatement stmt = null;
		String sql = "DELETE FROM produtos WHERE id = ? ";
		int qtdRemovidos = 0;
		try {
			conn = ConnectionManager.getConexao();
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			qtdRemovidos = stmt.executeUpdate();
		} catch (SQLException e) {
			String errorMsg = "Erro ao tentar remover produto de id " + id;
			throw new GlobalcodeException(errorMsg, e);
		} finally {
			ConnectionManager.close(conn, stmt);
		}
		return qtdRemovidos;
	}
/*metodo save utilizando recuperação de ID	
	public Produto save(Produto produto) throws GlobalcodeException {
		Statement stmt = null;
		String sql = "";

		// Se o id for igual a zero, o produto ainda nao existe no banco,
		//portanto faremos um INSERT; caso contrario faremos um UPDATE
		if (produto.getId() == 0) {
			sql = "INSERT INTO produtos (nome ,preco) ";
			sql += "  VALUES ('" + produto.getNome() + "', ";
			sql += produto.getPreco() + " )";
		} else {
			sql = "UPDATE produtos SET nome = '" + produto.getNome() + "',";
			sql += " preco = '" + produto.getPreco() + "'";
			sql += " WHERE id = " + produto.getId();
		}
		Connection conn = ConnectionManager.getConexao();
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
	
			if (produto.getId() == 0) {
				ResultSet generatedKeys = stmt.getGeneratedKeys();
				if (generatedKeys.next()) {
					int id = generatedKeys.getInt(1);
					produto.setId(id);
				}
			}
			System.out.println("SQL = " + sql);
			return produto;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new GlobalcodeException(
				"Erro na execucao da query " + sql,
				e);
		} finally {
			ConnectionManager.close(conn, stmt);
		}
	}*/
}
