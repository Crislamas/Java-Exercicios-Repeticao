
import javax.swing*;

/* Leia a idade de 20 pessoas e exiba a soma das idades.*/

public class Ex6 {
	public static void main(String[] args) {
		int somaIdades = 0;
		for(int i = 0; i < 10; i++) {
			int idade = Integer.parseInt(JoptionPane.showInputDialog("Insira sua idade"));
			somaIdades += idade;
		}
		System.out.println("Soma total: " + somaIdades);
	}

}
