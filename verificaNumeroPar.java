package desafios;

import javax.swing.JOptionPane;

public class verificaNumeroPar {

	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("Digite o número:");

		int numero = Integer.parseInt(valor);

		if (numero % 2 == 0) {
			System.out.println("número par!");
		} else { 
			System.out.println("Número impar!");
		}

	}

}
