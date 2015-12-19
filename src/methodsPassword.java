
import javax.swing.JOptionPane;

public class methodsPassword {
	String contraseñaCorrecta;
	String contraseñaAcceso;
	char[] password;
	String userCorrecto;
	char[] user;
	String userAcceso;
	
	public methodsPassword(String contraseña){
		password = contraseña.toCharArray();
		contraseñaCorrecta = contraseña;
		JOptionPane.showMessageDialog(null, "Contraseña establecida");
		
	}//fin del metodo methodsPassword
	
	public void cambioContraseña(){
		String contenedor = contraseñaCorrecta;
		contraseñaCorrecta = JOptionPane.showInputDialog("Escriba una nueva contraseña");
		password = contraseñaCorrecta.toCharArray();
		if (contraseñaCorrecta.equals(contenedor)){
			contraseñaCorrecta = JOptionPane.showInputDialog("¡CONTRASEÑA INVALIDA! Vuelva a escribir una nueva contraseña");
			password = contraseñaCorrecta.toCharArray();
        }
		else{}
		
	}// fin del metodo cambioContraseña
	
	public void accesoSistema(){
		int contador = 0;
		int contadorUsuario = 0;
		contraseñaAcceso = JOptionPane.showInputDialog("escriba su contraseña para accesar al sistema");
		userAcceso = JOptionPane.showInputDialog("escriba su usuario para accesar al sistema");
		char[] accesoUsuario = userAcceso.toCharArray();
		char[] acceso = contraseñaAcceso.toCharArray();
		for(int i = 0;i < contraseñaCorrecta.length();i++){
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
		
		if(contador == contraseñaCorrecta.length() && contadorUsuario == userCorrecto.length()){
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
