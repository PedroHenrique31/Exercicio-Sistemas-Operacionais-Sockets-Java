package Main;
//vou adicionar isso aqui pra ver
import java.util.ArrayList;
import java.util.Random;

public class Frases {
	private ArrayList<String> frases;
	private Random sorteia;

	public Frases() {
		this.frases=new ArrayList<String>(61);
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
		frases.add("São os nossos amigos que nos ensinam as mais valiosas lições.");
		frases.add("Aquele que se importa com o sentimento dos outros, não é um tolo.");
		frases.add("A adversidade é um espelho que reflete o verdadeiro eu");
		frases.add("Lamentar aquilo que não temos é desperdiçar aquilo que já possuímos");
		frases.add("Uma bela flor é incompleta sem as suas folhas.");
		frases.add("Sem o fogo do entusiasmo, não há o calor da vitória.");
		frases.add("O riso é a menor distância entre duas pessoas.");
		frases.add("Os defeitos são mais fortes quando o amor é fraco.");
		frases.add("Amizade e Amor são coisas que se unem num piscar de olhos.");
		frases.add("Surpreender e ser surpreendido é o segredo do amor.");
		frases.add("Faça pequenas coisas hoje e coisas maiores lhe serão confiadas amanhã.");
		frases.add("A paciência na adversidade é sinal de um coração sensível.");
		frases.add("A sorte favorece a mente bem preparada.");
		frases.add("A sua visão se tornará mais clara apenas quando conseguir olhar para dentro do seu coração.");
		frases.add("Quem olha para fora sonha; quem olha para dentro acorda.");
		frases.add("As pessoas esquecerão o que você disse e o que você fez… mas nunca esquecerão como se sentiram.");
		frases.add("Espere pelo mais sábio dos conselhos: o tempo.");
		frases.add("Todas as coisas são difíceis antes de se tornarem fáceis.");
		frases.add("Se você se sente só é porque construiu muros ao invés de pontes.");
		frases.add("Vencer é 90 por cento suor e 10 por cento de engenho.");
		frases.add("O amor está sempre mais próximo do que você imagina.");
		frases.add("Você é do tamanho do seu sonho.");
		frases.add("Pare de procurar eternamente; a felicidade está mesmo aqui ao seu lado.");
		frases.add("O conhecimento é a única virtude e a ignorância é o único vício.");
		frases.add("O nosso primeiro e último amor é… o amor-próprio.");
		frases.add("Deixe de lado as preocupações e seja feliz.");
		frases.add("A vontade das pessoas é a melhor das leis.");
		frases.add("Nós somos o que pensamos.");
		frases.add("A maior barreira para o sucesso é o medo do fracasso.");
		frases.add("O pessimista vê a dificuldade em cada oportunidade; O otimista vê a oportunidade em cada dificuldade.");
		frases.add("Muitas das grandes realizações do mundo foram feitas por homens cansados e desanimados que continuaram o seu trabalho.");
		frases.add("O insucesso é apenas uma oportunidade para recomeçar de novo com mais experiência.");
		frases.add("Coragem é a resistência ao medo, domínio do medo, e não a ausência do medo.");
		frases.add("O verdadeiro homem mede a sua força, quando se defronta com o obstáculo.");
		frases.add("Quem quer vencer um obstáculo deve armar-se da força do leão e da prudência da serpente.");
		frases.add("A adversidade desperta em nós capacidades que, em circunstâncias favoráveis, teriam ficado adormecidas.");
		frases.add("Motivação não é sinónimo de transformação, mas um passo em sua direção.");
		frases.add("O que empobrece o ser humano, não é a falta de dinheiro, mais sim, a falta de fé,motivação e criatividade.");
		frases.add("A inspiração vem dos outros. A motivação vem de dentro de nós.");
		frases.add("Não acredite mais em pessoas especiais, mas em momentos especiais com pessoas normais.");
		frases.add("A nossa vida tem 4 sentidos… Amar, Sofrer, Lutar e Vencer. Ame muito, sofra pouco, lute bastante e vença sempre!");
		frases.add("Nada é por acaso… Acredite em seus sonhos e nos seus potenciais….Na vida tudo se supera...");
		frases.add("Acredite em milagres, mas não dependa deles.");
		frases.add("Você sempre será a sua melhor companhia!");
		frases.add("Realize o óbvio, pense no improvável e conquiste o impossível.");
		frases.add("Clarice Lispector");
		
	}
	public String sorteiaFrase() {
		int numFrases=frases.size();
		sorteia=new Random();
		int posicao=sorteia.nextInt(numFrases);
		String frase=frases.get(posicao);
		return frase;
		
	}
}
