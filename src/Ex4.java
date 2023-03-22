import javax.swing.*;

*/ Leia o nome, um número do usuário, um número N e escreva o nome dele na tela N vezes. */

public class Ex4 {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		int numRepeticoes = Integer.parseInt(JOptionPane.showInputDialog("Deseja repetir o seu nome quantas vezes?"));
		for(int i = 0; i <numRepeticoes; i++) {
			System.out.println("Nome: " + nome);
		}
	}

}
