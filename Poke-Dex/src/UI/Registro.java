package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Models.Usuario;
import Utils.Almacen;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Registro {

	private JFrame frameRegistro;
	private JTextField textUsuario; 
	private JPasswordField passwordField;
	private JPasswordField ConfirmarC;
	private Daos.UsuariosDAO UsuariosDAO;
	/**
	 * Create the application.
	 */
	public Registro() {
		initialize();
		this.frameRegistro.setVisible(true);
		this.UsuariosDAO = new Daos.UsuariosDAO();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameRegistro = new JFrame();
		frameRegistro.getContentPane().setBackground(new Color(255, 215, 0));
		frameRegistro.setTitle("Registro");
		frameRegistro.setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alejandro\\OneDrive\\Escritorio\\imagenes\\bola.png"));
		frameRegistro.setBounds(100, 100, 522, 349);
		frameRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameRegistro.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Nombre de usuario");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 92, 112, 14);
		frameRegistro.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 127, 112, 14);
		frameRegistro.getContentPane().add(lblNewLabel_1);

		textUsuario = new JTextField();
		textUsuario.addKeyListener(new KeyAdapter() {
		});
		textUsuario.setBounds(132, 89, 120, 20);
		frameRegistro.getContentPane().add(textUsuario);
		textUsuario.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("\u00BFComo te llamas entrenador?");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel_2.setBounds(10, 11, 252, 45);
		frameRegistro.getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

			}
		});
		passwordField.setBounds(132, 125, 120, 20);
		frameRegistro.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_4 = new JLabel("Confirmar contrase\u00F1a");
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 159, 120, 14);
		frameRegistro.getContentPane().add(lblNewLabel_4);
		ConfirmarC = new JPasswordField();
		ConfirmarC.setBounds(132, 156, 120, 20);
		frameRegistro.getContentPane().add(ConfirmarC);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Alejandro\\OneDrive\\Escritorio\\imagenes\\th (2).jpg"));
		lblNewLabel_3.setBounds(273, 0, 233, 310);
		frameRegistro.getContentPane().add(lblNewLabel_3);

		JButton btnNewButton = new JButton("Registrate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = textUsuario.getText();
				String password = new String(passwordField.getText());
				String Confirmar = new String(ConfirmarC.getText());
				
				if (password.equals(Confirmar)) {
					if(!usuario.isEmpty() && !password.isEmpty() && !Confirmar.isEmpty()) {
						Usuario nuevo = new Usuario(usuario,password);
						UsuariosDAO.registro(nuevo);
						frameRegistro.dispose();
						new LoginView();
						
					}else {
						JOptionPane.showMessageDialog(btnNewButton, "Rellena todos los campos");
					}
					
				}else {
					 
					JOptionPane.showMessageDialog(btnNewButton, "Las contraseñas no coinciden");
				}
				
				

			}
		});
		btnNewButton.setBounds(80, 215, 112, 23);
		frameRegistro.getContentPane().add(btnNewButton);
		
		
		
		

	}
}
