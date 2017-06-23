

public class FactoryNomeSobrenome {

	public NomeSobrenome criar(String nome) {
		if (nome.contains(", ")) {
			return new PrimeroFormato(nome);
		} else {
			return new SegundoFormato(nome);
		}
	}
}
