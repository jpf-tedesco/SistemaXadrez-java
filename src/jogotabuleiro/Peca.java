package jogotabuleiro;

public class Peca {
	
	protected Posicao posicao; /* esse tipo de posição ainda não é a posição do xadrez é uma posição simples de matriz	 */
	private Tabuleiro tabuleiro;
	
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null;
	}
	
	/* somente classes do mesmo pacote e subclasses podem acessar o tabuleiro de uma peca*/
	protected Tabuleiro getTabuleiro() { 
		return tabuleiro;
	}

}
