package application;

import jogotabuleiro.Posicao;
import xadrez.PartidaXadrez;

public class Programa {

	public static void main(String[] args) {
		
		PartidaXadrez partidaXadrez = new PartidaXadrez();
		InterfaceUsuario.imprimirTabuleiro(partidaXadrez.obterPeca());
	}

}
