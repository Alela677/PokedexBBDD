package Daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Models.Pokémon;
import Models.Usuario;
import UI.Pokemones;

public class PokemonDAO {
	final String DB_URL = "jdbc:mysql://localhost/pokedex";
	final String USER = "DBPokemon";
	final String PASS = "Alejandro95";

	public void insertaPokemon(Pokémon Pokemon) {
		final String INSERT = "INSERT INTO pokemons (Numero,Nombre,Tipo,Altura,Peso,Categoria,Habilidad,url)"
				+ "values ('" + Pokemon.getNumero() + "','" + Pokemon.getNombre() + "','" + Pokemon.getTipo() + "','"
				+ Pokemon.getAltura() + "','" + Pokemon.getPeso() + "','" + Pokemon.getCategoria() + "','"
				+ Pokemon.getHabilidad() + "','" + Pokemon.getUrl() + "')";
		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(INSERT);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void viewPokemon() {
		final String QUERY = "SELECT Numero,Nombre,Tipo,Altura,Peso,Categoria,Habilidad,url FROM pokemons";

		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(QUERY);
			while (rs.next()) {
				int Numero = rs.getInt("Numero");
				String Nombre = rs.getString("Nombre");
				String Tipo = rs.getString("Tipo");
				double Altura = rs.getDouble("Altura");
				double Peso = rs.getDouble("Peso");
				String Categoria = rs.getString("Categoria");
				String Habilidad = rs.getString("Habilidad");
				String url = rs.getString("url");
				Pokémon poke = new Pokémon(Numero, Nombre, Tipo, Altura, Peso, Categoria, Habilidad, url);
				Pokemones.pokemon.add(poke);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void eliminarPokemon(Pokémon Pokemon) {
		final String DELETE = "DELETE FROM pokemons WHERE Numero = ('"+ Pokemon.getNumero()+"')";

		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(DELETE);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void actualizarPokemon(Pokémon Pokemon) {
		final String UPDATE = "UPDATE pokemons\r\n"
				+ "SET\r\n"
				+ "Numero= '"+Pokemon.getNumero()+"',"
				+ "Nombre= '"+Pokemon.getNombre() +"',\r\n"
				+ "Tipo = '"+Pokemon.getTipo()+"',\r\n"
				+ "Altura = '"+Pokemon.getAltura()+"',\r\n"
				+ "Peso = '"+Pokemon.getPeso()+"',\r\n"
				+ "Categoria = '"+Pokemon.getCategoria()+"',\r\n"
				+ "Habilidad = '"+Pokemon.getHabilidad()+"',\r\n"
				+ "url = '"+Pokemon.getUrl()+"'\r\n";
				
		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(UPDATE);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}