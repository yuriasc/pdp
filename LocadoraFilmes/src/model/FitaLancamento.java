package model;

public class FitaLancamento implements Fita {
	private String titulo;
	
	public FitaLancamento(){}
	
	public FitaLancamento(String titulo){
		this.titulo = titulo;
	}
	@Override
	public String getTitulo() {
		return this.titulo;
	}

}
