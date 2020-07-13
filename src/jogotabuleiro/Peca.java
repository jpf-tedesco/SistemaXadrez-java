package jogotabuleiro;

public class Peca {
	
	protected Posicao posicao; /* esse tipo de posi��o ainda n�o � a posi��o do xadrez � uma posi��o simples de matriz	 */
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
