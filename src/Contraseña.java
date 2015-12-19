import javax.swing.*;

public class Contraseña {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sistema de ingreso usando un usuario y una contraseña :) 
		//etapa: finalizado ; fecha: Martes 16-Diciembre-2015 :D
		
		methodsPassword object = new methodsPassword(JOptionPane.showInputDialog("Hola, establezca una contraseña"));
		object.cambioContraseña();
		object.usuario(JOptionPane.showInputDialog("Establezca un usuario"));
		object.accesoSistema();

	}

}
