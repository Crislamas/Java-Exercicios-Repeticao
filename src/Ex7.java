
import javax.swing.*;

/* Leia a idade de 20 pessoas e exiba a média das idades. */

public class Ex7 {
	public static void main(String[] args) {
		int somaIdades = 0;
		for(int i = 0; i< 20; i++) {
			int idade = integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
			somaIdades += idade;
		}
		System.out.println("Media total: " + (somaIdades / 20));
	}
	
}
