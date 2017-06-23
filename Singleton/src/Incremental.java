public class Incremental{
	private static Incremental instancia = new Incremental();
	private int numero;
	
	private Incremental(){}
	
	public static Incremental getInstancia(){
		return instancia;
	}
	
	public int incrementar(){
		return ++numero;
	}

	@Override
	public String toString() {
		return "Incremental: " + numero;
	}
	
	
}