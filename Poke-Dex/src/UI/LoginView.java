package UI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import Models.Usuario;
import Utils.Almacen;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;

public class LoginView {

	private JFrame frmLogin;
	private JTextField textUario;
	private JTextField textContraseña;
	private Daos.UsuariosDAO UsuariosDAO;

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
		this.frmLogin.setVisible(true);
		this.UsuariosDAO = new Daos.UsuariosDAO();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.getContentPane().setBackground(new Color(255, 215, 0));
		frmLogin.setForeground(Color.YELLOW);
		frmLogin.setBackground(SystemColor.desktop);
		frmLogin.setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alejandro\\OneDrive\\Escritorio\\imagenes\\bola.png"));
		setUIComponents();
	}

	private void setUIComponents() {

		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 532, 343);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel.setBounds(122, 31, 99, 29);
		frmLogin.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblNewLabel_1.setBounds(21, 88, 46, 14);
		frmLogin.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a");
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblNewLabel_2.setBounds(21, 152, 67, 14);
		frmLogin.getContentPane().add(lblNewLabel_2);

		textUario = new JTextField();
		textUario.setText("Poke");
		textUario.setBounds(97, 86, 124, 20);
		frmLogin.getContentPane().add(textUario);
		textUario.setColumns(10);

		textContraseña = new JTextField();
		textContraseña.setText("Mon");
		textContraseña.setBounds(98, 150, 122, 20);
		frmLogin.getContentPane().add(textContraseña);
		textContraseña.setColumns(10);

		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textUario.getText();
				String password = new String(textContraseña.getText());
				Usuario nuevo = new Usuario(username, password);

				boolean correcto = UsuariosDAO.Login(nuevo);
				if (correcto) {

					JOptionPane.showMessageDialog(btnNewButton, "Login correcto");
					frmLogin.dispose();
					new Pokemones();
				} else
					JOptionPane.showMessageDialog(btnNewButton, "Login incorrecto");

			}
		});
		btnNewButton.setBounds(21, 214, 89, 23);
		frmLogin.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_3 = new JLabel("Imagen Login");
		lblNewLabel_3.setBackground(Color.YELLOW);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Alejandro\\OneDrive\\Escritorio\\og-default-image.jpeg"));
		lblNewLabel_3.setBounds(-127, -339, 896, 1071);
		frmLogin.getContentPane().add(lblNewLabel_3);

		JButton btnNewButton_1 = new JButton("Registrarse");
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
 
				frmLogin.dispose();
				new Registro();

			}
		});
		btnNewButton_1.setBounds(132, 214, 102, 23);
		frmLogin.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\alumno\\Desktop\\png-transparent-pokemon-logo-pokemon-nintendo-logo-thumbnail.png"));
		lblNewLabel_4.setBounds(255, 31, 229, 195);
		frmLogin.getContentPane().add(lblNewLabel_4);

	}
}