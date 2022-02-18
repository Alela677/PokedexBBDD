package Models;

public class Usuario {
	// Propiedades

	
	private String Usuario;
	private String Password;

	public Usuario( String usuario, String password) {
		
		Usuario = usuario;
		Password = password;
	}

	// Getter y setter

	

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "Usuario [ Usuario=" + Usuario + ", Password=" + Password + "]";
	}

}
