package xadrez;

import jogotabuleiro.Tabuleiro;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8); /* dimensão do tabuleiro */
	}
	
	public PecaXadrez[][] obterPeca() {
		PecaXadrez[][] matriz = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];	
		for(int linha=0; linha<tabuleiro.getLinhas(); linha++) {
			for(int coluna=0; coluna<tabuleiro.getColunas(); coluna++) {
				matriz[linha][coluna] = (PecaXadrez) tabuleiro.peca(linha, coluna);
			}
		}
		
		return matriz;
	}

}
