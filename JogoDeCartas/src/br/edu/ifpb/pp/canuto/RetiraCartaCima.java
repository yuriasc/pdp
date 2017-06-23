package br.edu.ifpb.pp.canuto;

public class RetiraCartaCima implements Regras {

	@Override
	public void retiraCarta(Jogador jogador1, Jogador jogador2, Baralho baralho) {
		
		Carta carta1, carta2;
		
		carta1 = baralho.cartas.get(0); 
		jogador1.setCarta(carta1);
		baralho.cartas.remove(baralho.cartas.get(0));
		
		carta2 = baralho.cartas.get(0); 
		jogador2.setCarta(carta2);
		baralho.cartas.remove(baralho.cartas.get(0));
		
		if(carta1.getPeso() > carta2.getPeso()) {
			jogador1.setPontos(jogador1.getPontos() + 1);
		} else {
			jogador2.setPontos(jogador2.getPontos() + 1);
		}		

	}	

}
