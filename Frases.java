package Main;

import java.util.ArrayList;
import java.util.Random;

public class Frases {
	private ArrayList<String> frases;
	private Random sorteia;

	public Frases() {
		this.frases=new ArrayList<String>(60);
		frases.add("A vida trar� coisas boas se tiver paci�ncia.");
		frases.add("Demonstre amor e alegria em todas as oportunidades e ver� que a paz nasce dentro de si");
		frases.add("N�o compense na ira o que lhe falta na raz�o.");
		frases.add("Defeitos e virtudes s�o apenas dois lados da mesma moeda.");
		frases.add("A maior de todas as torres come�a no solo.");
		frases.add("N�o h� que ser forte. H� que ser flex�vel.");
		frases.add("Todos os dias organiza os seus cabelos, por que n�o faz o mesmo com o cora��o?");
		frases.add("H� tr�s coisas que jamais voltam; a flecha lan�ada, a palavra dita e a oportunidade perdida.");
		frases.add("A juventude n�o � uma �poca da vida, � um estado de esp�rito.");
		frases.add("Podemos escolher o que semear, mas somos obrigados a colher o que plantamos");
		frases.add("D� toda a aten��o � forma��o dos seus filhos, sobretudo com bons exemplos da sua pr�pria vida.");
		frases.add("Siga os bons e aprenda com eles");
		frases.add("N�o importa o tamanho da montanha, ela n�o pode tapar o sol.");
		frases.add("O bom-senso vale mais do que muito conhecimento");
		frases.add("Quem quer colher rosas tem de estar preparado para suportar os espinhos");
		
	}
	public String sorteiaFrase() {
		sorteia=new Random();
		int posicao=sorteia.nextInt(15);
		String frase=frases.get(posicao);
		return frase;
		
	}
}
