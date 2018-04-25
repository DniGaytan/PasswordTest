
import javax.swing.JOptionPane;

public class methodsPassword {
	String contrasenaCorrecta;
	String contrasenaAcceso;
	char[] password;
	String userCorrecto;
	char[] user;
	String userAcceso;
	
	public methodsPassword(String contrasena){
		password = contrasena.toCharArray();
		contrasenaCorrecta = contrasena;
		JOptionPane.showMessageDialog(null, "Contraseña establecida");
		
	}//fin del metodo methodsPassword
	
	public void cambioContrasena(){
		String contenedor = contrasenaCorrecta;
		contrasenaCorrecta = JOptionPane.showInputDialog("Escriba una nueva contraseña");
		password = contrasenaCorrecta.toCharArray();
		if (contrasenaCorrecta.equals(contenedor)){
			contrasenaCorrecta = JOptionPane.showInputDialog("¡CONTRASEÑA INVALIDA! Vuelva a escribir una nueva contraseña");
			password = contrasenaCorrecta.toCharArray();
        }
		else{}
		
	}// fin del metodo cambioContraseña
	
	public void accesoSistema(){
		int contador = 0;
		int contadorUsuario = 0;
		contrasenaAcceso = JOptionPane.showInputDialog("escriba su contraseña para accesar al sistema");
		userAcceso = JOptionPane.showInputDialog("escriba su usuario para accesar al sistema");
		char[] accesoUsuario = userAcceso.toCharArray();
		char[] acceso = contrasenaAcceso.toCharArray();
		for(int i = 0;i < contrasenaCorrecta.length();i++){
			if(password[i] == acceso[i]){
				contador += 1;
				
			}//fin del if
			else{
				break;
			}//fin del else
			
			
		}//fin del for
		
		for(int e = 0; e < userCorrecto.length() ;e++){
			if(user[e] == accesoUsuario[e]){
				contadorUsuario += 1;
				
			}//fin del if
			else{
				break;
			}//fin del else
			
			
		}//fin del for
		
		if(contador == contrasenaCorrecta.length() && contadorUsuario == userCorrecto.length()){
			JOptionPane.showMessageDialog(null, "Bienvenido al sistema "+ userCorrecto);
		}
		else{
			JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
		}
	}//fin del metodo accesoSistema
	
	public void usuario(String usuario){
		if (usuario != null){
			userCorrecto = usuario;
			user = usuario.toCharArray();
			JOptionPane.showMessageDialog(null, "Usuario establecido");
		}//fin del if
		else{
			JOptionPane.showMessageDialog(null, "No se ha introducido un usuario");
		}//fin del else
	}//fin del metodo usuario
}//fin de la clase methods Password
