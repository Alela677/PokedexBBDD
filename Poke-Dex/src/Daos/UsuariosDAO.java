package Daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Models.Usuario;

public class UsuariosDAO {

	final String DB_URL = "jdbc:mysql://localhost/pokedex";
	final String USER = "DBPokemon";
	final String PASS = "Alejandro95";

	public void Consulta() {
		final String QUERY = "SELECT username,password FROM usuarios";
		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(QUERY);
			while (rs.next()) {
				// Display values

				System.out.print(", username: " + rs.getString("username"));
				System.out.println(", password: " + rs.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace(); 
		}
	}

	public boolean Login(Usuario usuario) {
		final String QUERY = "SELECT username,password FROM usuarios WHERE username = '" + usuario.getUsuario()
				+ "'  and " + " password ='" + usuario.getPassword() + "'";
		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(QUERY);
			return rs.next();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public void registro(Usuario usuario) {
		final String INSERT = " insert into usuarios ( username, password)" + "values ('" + usuario.getUsuario()
				+ "','" + usuario.getPassword() + "');";
		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(INSERT);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
