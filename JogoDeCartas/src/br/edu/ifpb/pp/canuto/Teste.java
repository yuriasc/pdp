package br.edu.ifpb.pp.canuto;

public class Teste {
	
	public static void main(String[] args) {
		
		Baralho baralho = new Baralho();
		//baralho.embaralhar(baralho);
		//baralho.mostrarBaralho(baralho);
		
		Jogador jogador1 = new Jogador("PLAYER 1", 0);		
		Jogador jogador2 = new Jogador("PLAYER 2", 0);
				
		//DECIDE QUAL REGRA SERA EXECUTADA
		//Regras regras = new RetiraCartaCima();
		//Regras regras = new RetiraCartaCimaBaixo();
		Regras regras = new RetiraCartaAleatorio();
				
		for(int i = 0; i < 10; i++) {
			regras.retiraCarta(jogador1, jogador2, baralho);
			baralho.embaralhar(baralho);			
		}
		
		if (jogador1.getPontos() == jogador2.getPontos()) {
			regras.retiraCarta(jogador1, jogador2, baralho);
			baralho.embaralhar(baralho);
		}
									
		System.out.println(jogador1.toString());
		System.out.println(jogador2.toString());		
		
	}

}
