package programa.exercicioOito;

import java.util.Scanner;

public class PerguntasRespostas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Jogador jogador = new Jogador();
		
		String respostaJogador;
		int acerto = 0;
		int erro = 0;
		
		String[] respostas = new String[] { "c", "a", "b", "c", "a", "d" };
		
		String[] perguntas = new String[] {
				"De que s�o constitu�dos os diamantes?\n" 
						+ "a) Grafite\r\n" 
						+ "b) R�nio\r\n" 
						+ "c) Carbono\r\n"
						+ "d) �smio\r\n" 
						+ "e) B�hrio ",
				"Qual dessas aves n�o voa?\n" 
						+ "a) Pinguim\r\n" 
						+ "b) Peru\r\n" 
						+ "c) Cegonha\r\n" 
						+ "d) Pato\r\n"
						+ "e) Cisne",
				"M�todo de sele��o em que predomina o m�rito. Essa � a defini��o de qual conceito da Sociologia?\n"
						+ "a) Aristocracia\r\n" 
						+ "b) Meritocracia\r\n" 
						+ "c) Tirania\r\n" 
						+ "d) Fidalguia\r\n"
						+ "e) Romaria\r\n",
				"Qual o significado da express�o �calcanhar de Aquiles�?\n"
						+ "a) A caracter�stica predominante das pessoas\r\n" 
						+ "b) Fuga dos problemas\r\n"
						+ "c) O ponto mais vulner�vel de algu�m\r\n" 
						+ "d) Espor�o\r\n"
						+ "e) Parte em que as pessoas concentram a sua for�a",
				"Qual destes � um exemplo de pal�ndromo:\n" 
						+ "a) Roma � amor.\r\n"
						+ "b) O rato roeu a roupa do rei de Roma.\r\n" 
						+ "c) Quem tem boca vai � Roma.\r\n"
						+ "d) O que �, o que �? Feito para andar e n�o anda?\r\n"
						+ "e) \"Uni, duni, t�, Salam�, ming��, Um sorvete color�, O escolhido foi voc�!\"",
				"Em que pa�s nasceu Vlad III, o Conde Dr�cula?\n" 
						+ "a) Pol�nia\r\n" 
						+ "b) Irlanda\r\n"
						+ "c) Esc�cia\r\n" 
						+ "d) Transilv�nia\r\n" 
						+ "e) R�ssia" };
				
		System.out.println("Jogo de Perguntas e Respostas");
		System.out.println("Qual seu nome?:");
		jogador.setNome(sc.next());
		System.out.println("Bem vindo " + jogador.getNome() + ". Vamos come�ar: ");
		
		for(int i = 0; i < perguntas.length; i++ ) {
			System.out.println(perguntas[i]);
			System.out.println("Responda abaixo com letra min�scula");
			respostaJogador = sc.next();

			if (respostas[i].equals(respostaJogador)) {
				System.out.println();
				System.out.println("Voc� acertou! A resposta era a letra " + respostas[i] + ")");	
				System.out.println("-------------------------------------------");
				System.out.println();
				acerto++;
				
			} else {
				System.out.println();
				System.out.println("Voc� errou! Sua resposta: " + respostaJogador + " \nResposta certa: " + respostas[i]);
				System.out.println("-------------------------------------------");
				System.out.println();
				erro++;
				
			}

		}		

		jogador.setAcertos(acerto);
		jogador.setErros(erro);

		System.out.println("------ FIM DO JOGO ------");
		System.out.println(jogador.toString());

	}
	
}
