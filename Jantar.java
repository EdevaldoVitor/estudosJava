package desafios;

public class Jantar {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Vitor", 80.0);
		Comida c1 = new Comida("Arroz", 0.300);
		Comida c2 = new Comida("Feijão", 0.050);

		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
		p1.comer(c2);
		System.out.println(p1.apresentar());

	}
}
