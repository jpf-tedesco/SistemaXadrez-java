package application;

import xadrez.PecaXadrez;

public class InterfaceUsuario {
	
	public static void imprimirTabuleiro(PecaXadrez[][] pecas) {
		for(int linha=0; linha<pecas.length; linha++){
			System.out.print(8-linha + " ");
			for(int coluna=0; coluna<pecas.length; coluna++) {
				imprimirPeca(pecas[linha][coluna]);
			}
			System.out.println();
		}
		System.out.print("  a b c d e f g h ");
	}
	
	private static void imprimirPeca(PecaXadrez peca) {
		if(peca == null) {
			System.out.print("-");
		}
		else {
			System.out.println(peca);
		}
		System.out.print(" ");
	}

}
