package Main;

import java.util.ArrayList;
import java.util.Random;

public class Frases {
	private ArrayList<String> frases;
	private Random sorteia;

	public Frases() {
		this.frases=new ArrayList<String>(60);
		frases.add("A vida trará coisas boas se tiver paciência.");
		frases.add("Demonstre amor e alegria em todas as oportunidades e verá que a paz nasce dentro de si");
		frases.add("Não compense na ira o que lhe falta na razão.");
		frases.add("Defeitos e virtudes são apenas dois lados da mesma moeda.");
		frases.add("A maior de todas as torres começa no solo.");
		frases.add("Não há que ser forte. Há que ser flexível.");
		frases.add("Todos os dias organiza os seus cabelos, por que não faz o mesmo com o coração?");
		frases.add("Há três coisas que jamais voltam; a flecha lançada, a palavra dita e a oportunidade perdida.");
		frases.add("A juventude não é uma época da vida, é um estado de espírito.");
		frases.add("Podemos escolher o que semear, mas somos obrigados a colher o que plantamos");
		frases.add("Dê toda a atenção á formação dos seus filhos, sobretudo com bons exemplos da sua própria vida.");
		frases.add("Siga os bons e aprenda com eles");
		frases.add("Não importa o tamanho da montanha, ela não pode tapar o sol.");
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
