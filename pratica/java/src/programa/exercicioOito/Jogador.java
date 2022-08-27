package programa.exercicioOito;

public class Jogador {
	private String nome;
	private int acertos;
	private int erros;

public Jogador() {
	
}

	public Jogador(String nome, int acertos, int erros) {
		this.nome = nome;
		this.acertos = acertos;
		this.erros = erros;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAcertos() {
		return acertos;
	}

	public void setAcertos(int acertos) {
		this.acertos = acertos;
	}

	public int getErros() {
		return erros;
	}

	public void setErros(int erros) {
		this.erros = erros;
	}
	
		@Override
	public String toString() {
		return "Jogador: " + nome + "\r\nAcertos: " + acertos + "\r\nErros: " + erros;
	}

}