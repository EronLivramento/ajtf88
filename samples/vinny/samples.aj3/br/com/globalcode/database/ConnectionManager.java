package br.com.globalcode.database;

import br.com.globalcode.util.GlobalcodeException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class ConnectionManager {
	private static final String STR_DRIVER = "com.mysql.jdbc.Driver";
	private static final String NOME_BANCO = "test";
	private static final String STR_CON = "jdbc:mysql://localhost:3306/"
			+ NOME_BANCO;
	private static final String USER = "root";
	private static final String PASSWORD = "admin";

	public static Connection getConexao() throws GlobalcodeException {

		Connection conn = null;
		try {
			Class.forName(STR_DRIVER);
			conn = DriverManager.getConnection(STR_CON, USER, PASSWORD);
			System.out.println("Conectado");
		} catch (ClassNotFoundException e) {
			throw new GlobalcodeException("Driver nao encontrado", e);
		} catch (SQLException e) {
			System.out.println();
			throw new GlobalcodeException("Erro ao obter a conexão", e);
		}
		return conn;
	}
	//código omitido idêntico ao exemplo anterior
	public static void close(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Connection conn, Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectionManager.close(conn);
	}
	  public static void close(Connection conn, Statement stmt, ResultSet rs) {
		    try {
		      if (rs != null) {
		        rs.close();
		      }
		    }
		    catch (Exception e) {
		    	e.printStackTrace();
		    }
		    ConnectionManager.close(conn, stmt);
		  }
}
