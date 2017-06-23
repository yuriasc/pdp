

public class PrimeroFormato extends NomeSobrenome {
	
	public PrimeroFormato(String nome) {
		String[] array = nome.split(", ");		
		this.nome = array[1] + " " + array[0];
	}
	
	public String getNome(){
		return this.nome; 
	}
}
