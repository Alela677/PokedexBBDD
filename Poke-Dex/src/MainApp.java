
import Daos.PokemonDAO;
import Enum.Tipo;
import Models.Pokémon;
import Models.Usuario;
import UI.LoginView;
import Utils.Almacen;

public class MainApp {

	private static PokemonDAO pokemonDAO = new PokemonDAO();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginView();

		pokemonDAO.viewPokemon();
		
	} 

}
