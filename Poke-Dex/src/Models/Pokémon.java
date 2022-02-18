package Models;

import javax.swing.JTextField;



public class Pokémon {
	private int numero;
	private String nombre;
	private String tipo;
	private double altura;
	private double peso;
	private String categoria;
	private String habilidad;
	private String url;
	
	
	

	public Pokémon(int numero, String nombre,String tipo, double altura, double peso, String categoria, String habilidad,
			String url) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.tipo = tipo;
		this.altura = altura;
		this.peso = peso;
		this.categoria = categoria;
		this.habilidad = habilidad;
		this.url = url;
	}

	// Getter y setter

	

	

	public String getUrl() { 
		return url;
	}

	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	// ToString
	@Override
	public String toString() {
		return String.format(
				"Pokémon [numero=%s, nombre=%s, tipo=%s, altura=%s, peso=%s, categoria=%s, habilidad=%s, url=%s]",
				numero, nombre, tipo, altura, peso, categoria, habilidad, url);
	}

}
