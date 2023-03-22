import javax.swing.*;
/* Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares. */

public class Ex12 {
	public static void main(String[] args) {
		int somaPares = 0;
		for(int i = 0; i < 20; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDiaolog("Insira um número"));
			if(num%2 == 0) {
				somaPares++;
			}
		}
		System.out.println("Soma total: " + somaPares);
	}

}
