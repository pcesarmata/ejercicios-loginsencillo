package net.tecgurus.view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginView {
	private JFrame frame;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView window = new LoginView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
				
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(85, 59, 86, 14);
		frame.getContentPane().add(lblUsuario);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(85, 138, 86, 14);
		frame.getContentPane().add(lblPassword);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(252, 56, 86, 20);
		frame.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(252, 135, 86, 20);
		frame.getContentPane().add(txtPassword);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(182, 199, 89, 23);
		// Agregamos la acción al botón
		btnEntrar.addActionListener(new ActionListener() {
			// Agregamos el metodo de consultarUsuario
			public void actionPerformed(ActionEvent arg0) {
				consultarUsuario();
			}
		});
		
		frame.getContentPane().add(btnEntrar);
	}
	
	public void consultarUsuario(){
		
		Usuario alumno = new Usuario();
		
//		Esta parte es para definir el usuario y contraseña hardcodeado
		alumno.setUsr("Cesar");
		alumno.setPss("1234");
		
		// Se define como una cadena de texto normal
		String usuario = txtUsuario.getText();
		// Se define de esta manera porque el componente de contraseña esta hecho para recibir un arreglo de
		// carcateres, pero lo parseamos a una cadena de texto auxiliandonos de la clase String y el metodo
		// .valueOF
		String password = String.valueOf(txtPassword.getPassword());
			
		if(usuario.isEmpty()){
			JOptionPane.showMessageDialog(null, "El usuario es requerido", "ERROR", JOptionPane.ERROR_MESSAGE);
			return;
		} else if(password.isEmpty()){
			JOptionPane.showMessageDialog(null, "El password es reqerido", "ERROR", JOptionPane.ERROR_MESSAGE);
			return;
		}

/////////////////////////////////////////////////////////////
		/*
		 * Se valida si el usuario es correcto
		 */
//		if(nombre.equals(usuario)){
//			System.out.println("Correcto");
//		}
//		else {
//			System.out.println("Incorrecto");
//		}
///////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////
		/*
		 * Se valida si la contrasenia es correcta
		 */
//		if(nombre.equals(password)){
//			System.out.println("Correcto");
//		}
//		else {
//			System.out.println("Incorrecto");
//		}
///////////////////////////////////////////////////////////////		

		// Validamos usuario.
		if(alumno.getUsr().equals(usuario)){
			System.out.println("El usuario es correcto.");
		} else {
			System.out.println("El usuario es incorrecto.");
		} 
		
		// Validamos Password.
		if(alumno.getPss().equals(password)){
			System.out.println("La contraseña es correcta.");
		} else {
			System.out.println("La contraseña es incorrecta.");
		}
		
		// Imprimimos si el Usuario se loggeo o no.
		if (alumno.getUsr().equals(usuario) && alumno.getPss().equals(password)){
			System.out.println("Usuario Loggeado corerctamente!!!");
		} else {
			System.out.println("Usuario no loggeado!!");
		}
	}
}