package br.com.globalcode.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class TesteConexaoJDBC {

	private static final String STR_DRIVER = "com.mysql.jdbc.Driver";
	private static final String NOME_BANCO = "apostila";
	private static final String STR_CON= "jdbc:mysql://localhost:3306/"+NOME_BANCO;
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	
	public static void main(String args[]) {
		Connection conn = null;
		try{
			Class.forName(STR_DRIVER);
			conn = DriverManager.getConnection(STR_CON, USER, PASSWORD);
			System.out.println("Conectado");
		}catch (ClassNotFoundException e) {
			System.out.println("Driver nao encontrado");
			e.printStackTrace();			
		}catch (SQLException e) {
			System.out.println("Erro ao obter a conexão");
			e.printStackTrace();
		}
	}
}
