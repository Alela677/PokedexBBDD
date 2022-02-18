package UI;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Daos.PokemonDAO;
import Enum.Tipo;
import Models.Pokémon;
import Utils.Almacen;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;

public class Pokemones {

	private JFrame framePokemones;
	private JLabel lblNombre;
	JLabel lblPokemon;
	private JTextField textNombre;
	private JLabel lblNewLabel;
	private JTextField textNumero;
	private JLabel lblNewLabel_1;
	private JTextField textTipo;
	private JLabel lblNewLabel_2;
	private JTextField textAltura;
	private JLabel lblNewLabel_3;
	private JTextField textPeso;
	private JLabel lblNewLabel_4;
	private JTextField textCategoria;
	private JLabel lblNewLabel_5;
	private JTextField textHabilidad;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnEliminar;
	private JLabel lblURL;
	private JButton btnCrear;
	private int indice;
	private JButton btnNewButton_4;
	private PokemonDAO PokemonDAO;
	public static ArrayList<Pokémon> pokemon = new ArrayList<Pokémon>();
	private JLabel lblNewLabel_6;
	private JButton btncancelaActualizar;
	private JButton btnNewGuardar;

	public Pokemones() {
		this.PokemonDAO = new PokemonDAO();
		initialize();
		framePokemones.repaint();
		this.framePokemones.setVisible(true);
		indice = 0;
		printPokemon();
		if(this.pokemon.size() > 0) {
			printPokemon();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		framePokemones = new JFrame();
		framePokemones.getContentPane().setBackground(new Color(255, 215, 0));
		framePokemones.setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alejandro\\OneDrive\\Escritorio\\imagenes\\bola.png"));
		framePokemones.setTitle("Pok\u00E9mon");
		framePokemones.setBounds(100, 100, 705, 624);
		framePokemones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framePokemones.getContentPane().setLayout(null);

		lblPokemon = new JLabel("Pokemones");
		lblPokemon.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		lblPokemon.setBounds(273, 17, 184, 38);
		framePokemones.getContentPane().add(lblPokemon);

		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNombre.setBounds(24, 76, 80, 20);
		framePokemones.getContentPane().add(lblNombre);

		textNombre = new JTextField();
		textNombre.setHorizontalAlignment(SwingConstants.CENTER);
		textNombre.setEditable(false);
		textNombre.setBounds(24, 106, 120, 20);
		framePokemones.getContentPane().add(textNombre);
		textNombre.setColumns(10);

		lblNewLabel = new JLabel("Numero");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel.setBounds(24, 229, 80, 14);
		framePokemones.getContentPane().add(lblNewLabel);

		textNumero = new JTextField();
		textNumero.setHorizontalAlignment(SwingConstants.CENTER);
		textNumero.setEditable(false);
		textNumero.setBounds(24, 254, 120, 20);
		framePokemones.getContentPane().add(textNumero);
		textNumero.setColumns(10);

		lblNewLabel_1 = new JLabel("Tipo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(24, 173, 80, 14);
		framePokemones.getContentPane().add(lblNewLabel_1);

		textTipo = new JTextField();
		textTipo.setHorizontalAlignment(SwingConstants.CENTER);
		textTipo.setEditable(false);
		textTipo.setBounds(24, 198, 120, 20);
		framePokemones.getContentPane().add(textTipo);
		textTipo.setColumns(10);

		lblNewLabel_2 = new JLabel("Altura");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(24, 285, 80, 14);
		framePokemones.getContentPane().add(lblNewLabel_2);

		textAltura = new JTextField();
		textAltura.setHorizontalAlignment(SwingConstants.CENTER);
		textAltura.setEditable(false);
		textAltura.setBounds(24, 310, 120, 20);
		framePokemones.getContentPane().add(textAltura);
		textAltura.setColumns(10);

		lblNewLabel_3 = new JLabel("Peso");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(24, 341, 80, 14);
		framePokemones.getContentPane().add(lblNewLabel_3);

		textPeso = new JTextField();
		textPeso.setHorizontalAlignment(SwingConstants.CENTER);
		textPeso.setEditable(false);
		textPeso.setBounds(24, 366, 120, 20);
		framePokemones.getContentPane().add(textPeso);
		textPeso.setColumns(10);

		lblNewLabel_4 = new JLabel("Categoria");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(24, 467, 80, 14);
		framePokemones.getContentPane().add(lblNewLabel_4);

		textCategoria = new JTextField();
		textCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		textCategoria.setEditable(false);
		textCategoria.setBounds(24, 491, 120, 20);
		framePokemones.getContentPane().add(textCategoria);
		textCategoria.setColumns(10);

		lblNewLabel_5 = new JLabel("Habilidad");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(24, 405, 80, 14);
		framePokemones.getContentPane().add(lblNewLabel_5);

		textHabilidad = new JTextField();
		textHabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		textHabilidad.setEditable(false);
		textHabilidad.setBounds(24, 430, 120, 20);
		framePokemones.getContentPane().add(textHabilidad);
		textHabilidad.setColumns(10);

		try {
			String path = pokemon.get(0).getUrl();
			System.out.println("Get Image from " + path);
			URL url = new URL(path);
			BufferedImage image = ImageIO.read(url);
			System.out.println("Load image into frame...");
			lblURL = new JLabel(new ImageIcon(image));
			lblURL.setBackground(new Color(255, 192, 203));
		} catch (Exception e) {
			// TODO: handle exception
		}
		lblURL.setVisible(true);
		lblURL.setSize(361, -281);
		lblURL.setLocation(273, 381);
		framePokemones.getContentPane().add(lblURL);

		btnCrear = new JButton("Crear Pokemon");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				framePokemones.dispose();
				new CrearPokemon();
				

			}
		});
		btnCrear.setBounds(559, 550, 120, 23);
		framePokemones.getContentPane().add(btnCrear);

		btnNewButton_1 = new JButton("<");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Detras();

			}
		});
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(49, 13, 89, 42);
		framePokemones.getContentPane().add(btnNewButton_1);

		btnNewButton_2 = new JButton(">");
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delante();

			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2.setBounds(574, 18, 89, 44);
		framePokemones.getContentPane().add(btnNewButton_2);

		btnEliminar = new JButton("Eliminar Pokemon");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opc = JOptionPane.showConfirmDialog(btnCrear, "¿Quiere eliminar este pokemon?");
				if (opc == 0) {

					PokemonDAO.eliminarPokemon(pokemon.get(indice));
					pokemon.remove(indice);

					if (pokemon.size() > 0) {
						Detras();
					}

					JOptionPane.showMessageDialog(btnCrear, "Pokemon eliminado");
				} else if (opc == 1) {
					JOptionPane.showMessageDialog(btnCrear, "Has elegido quedarte con el pokemon");
				}
			}
		});
		btnEliminar.setBounds(429, 550, 120, 23);
		framePokemones.getContentPane().add(btnEliminar);

		btnNewButton_4 = new JButton("Salir");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_4.setBounds(24, 550, 89, 23);
		framePokemones.getContentPane().add(btnNewButton_4);

		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Editar();
			}
		});
		btnActualizar.setBounds(229, 551, 97, 23);
		framePokemones.getContentPane().add(btnActualizar);

		btncancelaActualizar = new JButton("Deshacer");
		btncancelaActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Editar();
				printPokemon();
			}
		});
		btncancelaActualizar.setBounds(130, 550, 89, 23);
		framePokemones.getContentPane().add(btncancelaActualizar);
		btncancelaActualizar.setVisible(false);
		
		btnNewGuardar = new JButton("Guardar");
		btnNewGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Actualizado();
				Editar();
			}
		});
		btnNewGuardar.setBounds(330, 550, 89, 23);
		framePokemones.getContentPane().add(btnNewGuardar);
		btnNewGuardar.setVisible(false);
	}

	public void printPokemon() {
		if (pokemon.size() > 0) {

			Pokémon poke = pokemon.get(indice);
			textNombre.setText(poke.getNombre());
			textNumero.setText(poke.getNumero() + "");
			textTipo.setText(poke.getTipo() + "");
			textAltura.setText(poke.getAltura() + "");
			textPeso.setText(poke.getPeso() + "");
			textCategoria.setText(poke.getCategoria());
			textHabilidad.setText(poke.getHabilidad());

			BufferedImage img;
			try {
				img = ImageIO.read(new URL(poke.getUrl()));
				lblURL.setIcon(new javax.swing.ImageIcon(img));
			} catch (Exception e) {
				// TODO: handle exception
			}
			lblURL.setBounds(154, 91, 509, 449);
			framePokemones.getContentPane().add(lblURL);
		}
	}

	public void Delante() {
		indice++;

		if (indice == pokemon.size()) {

			indice = 0;
		}

		printPokemon();
	}

	public void Detras() {
		indice--;

		if (indice == pokemon.size() - 1) {

			indice = 0;
		}

		printPokemon();
	}

	public void Editar() {
		textNumero.setEditable(!textNombre.isEditable());
		textNombre.setEditable(!textNombre.isEditable());
		textTipo.setEditable(!textTipo.isEditable());
		textAltura.setEditable(!textAltura.isEditable());
		textPeso.setEditable(!textPeso.isEditable());
		textCategoria.setEditable(!textCategoria.isEditable());
		textHabilidad.setEditable(!textHabilidad.isEditable());
		btnCrear.setVisible(!btnCrear.isVisible());
		btnEliminar.setVisible(!btnEliminar.isVisible());
		btncancelaActualizar.setVisible(!btncancelaActualizar.isVisible());
		btnNewGuardar.setVisible(!btnNewGuardar.isVisible());
		printPokemon();
	}

	public void Actualizado() {
		Pokémon poke = pokemon.get(indice);
		poke.setNumero(Integer.parseInt(textNumero.getText()));
		poke.setTipo(textTipo.getText());
		poke.setAltura(Double.parseDouble(textAltura.getText()));
		poke.setPeso(Double.parseDouble(textPeso.getText()));
		poke.setCategoria(textCategoria.getText());
		poke.setHabilidad(textHabilidad.getText());
		PokemonDAO.actualizarPokemon(poke);
	}
}