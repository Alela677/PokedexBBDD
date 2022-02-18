package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Daos.PokemonDAO;
import Enum.Tipo;
import Models.Pokémon;
import Utils.Almacen;

import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import UI.Pokemones;
import java.awt.Toolkit;
public class CrearPokemon {

	private JFrame frameCrearPokemon;
	private JTextField textNombre;
	private JTextField textTipo;
	private JTextField textPeso;
	private JTextField textHabilidad;
	private JTextField textNumero;
	private JTextField textAltura;
	private JTextField textCategoria;
	private JTextField textURL;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel ;
	private PokemonDAO PokemonDAO;
	private ArrayList<Pokémon> pokemon;
	private Pokemones pokemones = new Pokemones();
	/**
	 * Create the application.
	 */
	public CrearPokemon() {
		initialize();
		frameCrearPokemon.setVisible(true);
		this.PokemonDAO = new PokemonDAO();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameCrearPokemon = new JFrame();
		frameCrearPokemon.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alejandro\\OneDrive\\Escritorio\\imagenes\\bola.png"));
		frameCrearPokemon.getContentPane().setBackground(new Color(255, 215, 0));
		frameCrearPokemon.setBounds(100, 100, 636, 522);
		frameCrearPokemon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameCrearPokemon.getContentPane().setLayout(null);

		lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(36, 108, 77, 23);
		frameCrearPokemon.getContentPane().add(lblNewLabel);

		textNombre = new JTextField();
		textNombre.setBounds(36, 142, 99, 20);
		frameCrearPokemon.getContentPane().add(textNombre);
		textNombre.setColumns(10); 
		
		lblNewLabel_1 = new JLabel("Tipo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(36, 206, 46, 14);
		frameCrearPokemon.getContentPane().add(lblNewLabel_1);

		textTipo = new JTextField();
		textTipo.setBounds(36, 241, 99, 20);
		frameCrearPokemon.getContentPane().add(textTipo);
		textTipo.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Peso");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(36, 297, 77, 14);
		frameCrearPokemon.getContentPane().add(lblNewLabel_2);

		textPeso = new JTextField();
		textPeso.setBounds(36, 322, 99, 20);
		frameCrearPokemon.getContentPane().add(textPeso);
		textPeso.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Habilidad");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(36, 369, 86, 14);
		frameCrearPokemon.getContentPane().add(lblNewLabel_3);

		textHabilidad = new JTextField();
		textHabilidad.setBounds(36, 394, 99, 20);
		frameCrearPokemon.getContentPane().add(textHabilidad);
		textHabilidad.setColumns(10);
		
		
		JLabel lblNewLabel_4 = new JLabel("Numero");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(204, 112, 86, 14);
		frameCrearPokemon.getContentPane().add(lblNewLabel_4);

		textNumero = new JTextField();
		textNumero.setBounds(204, 142, 104, 20);
		frameCrearPokemon.getContentPane().add(textNumero);
		textNumero.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Altura");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setBounds(206, 208, 84, 14);
		frameCrearPokemon.getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Categoria");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds(204, 297, 93, 14);
		frameCrearPokemon.getContentPane().add(lblNewLabel_6);

		textAltura = new JTextField();
		textAltura.setBounds(204, 241, 104, 20);
		frameCrearPokemon.getContentPane().add(textAltura);
		textAltura.setColumns(10);

		textCategoria = new JTextField();
		textCategoria.setBounds(204, 322, 104, 20);
		frameCrearPokemon.getContentPane().add(textCategoria);
		textCategoria.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("Crea tu Pokemon");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_7.setBounds(210, 11, 240, 36);
		frameCrearPokemon.getContentPane().add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("URL imagen");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_8.setBounds(204, 371, 113, 14);
		frameCrearPokemon.getContentPane().add(lblNewLabel_8);

		textURL = new JTextField();
		textURL.setBounds(204, 394, 104, 20);
		frameCrearPokemon.getContentPane().add(textURL);
		textURL.setColumns(10);

		lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Alejandro\\OneDrive\\Escritorio\\imagenes\\th (1).jpg"));
		lblNewLabel_9.setBounds(322, 100, 298, 393);
		frameCrearPokemon.getContentPane().add(lblNewLabel_9);

		JButton btnNewButton = new JButton("A\u00F1adir Pokemon");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero = Integer.valueOf(textNumero.getText());
				String nombre = textNombre.getText();
				String tipo = textTipo.getText();
				double altura =Double.valueOf(textAltura.getText()) ;
				double peso =Double.valueOf(textPeso.getText()) ;
				String categoria =textCategoria.getText();
				String habilidad = textHabilidad.getText() ;
				String url = textURL.getText();
				
				Pokémon n = new Pokémon(numero,nombre,tipo,altura,peso,categoria,habilidad,url);
				PokemonDAO.insertaPokemon(n);
				frameCrearPokemon.dispose();
				
				new Pokemones();
				
			}
		});
		btnNewButton.setBounds(171, 449, 137, 23);
		frameCrearPokemon.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameCrearPokemon.dispose();
				new Pokemones();
			
			}
		});
		btnNewButton_1.setBounds(46, 449, 89, 23);
		frameCrearPokemon.getContentPane().add(btnNewButton_1);
	}
}