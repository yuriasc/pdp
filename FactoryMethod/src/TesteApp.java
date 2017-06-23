

public class TesteApp {

	public static void main(String args[]) {
		FactoryNomeSobrenome factory = new FactoryNomeSobrenome();
		String[] nomes = { "Canuto, Yuri", "Joao Paulo", "Canuto, Yuna" };

		for (String nome : nomes) {			
			System.out.println(factory.criar(nome).getNome());
		}

	}
}