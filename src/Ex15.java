import javax.swing.*;

/* Escreva um algoritmo que leia uma sequência de números de usuários e realize a soma desses números. Encerre a execução quando um número negativo for digitado. */


public class Ex15 {
	public static void main(String[] args) {
		int controlador = 0;
		int soma = 0;
		
		do {
			int num = Integer.parseInt(JOptionPane.showInputDiaolog("Insira um número"));
			soma += num;
			controlador = Integer.parseInt(JOptionPane.showInputDialog(""" Deseja continuar? 
						Digite 1 para sim
						Digite 2 para parar """));

		} while (controlador > = 0);
		JOptionPane.showInputDiaolog(null, "Soma: " + soma);
	}

}
