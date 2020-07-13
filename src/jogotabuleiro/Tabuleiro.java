package jogotabuleiro;

public class Tabuleiro {
	
	private Integer linhas;
	private Integer colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(Integer linhas, Integer colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}
	
	public Integer getLinhas() {
		return linhas;
	}
	
	public void setLinhas(Integer linhas) {
		this.linhas = linhas;
	}
	
	public Integer getColunas() {
		return colunas;
	}
	
	public void setColunas() {
		this.colunas = colunas;
	}

}
