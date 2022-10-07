package Main;
//vou adicionar isso aqui pra ver
import java.util.ArrayList;
import java.util.Random;

public class Frases {
	private ArrayList<String> frases;
	private Random sorteia;

	public Frases() {
		this.frases=new ArrayList<String>(61);
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
		frases.add("S�o os nossos amigos que nos ensinam as mais valiosas li��es.");
		frases.add("Aquele que se importa com o sentimento dos outros, n�o � um tolo.");
		frases.add("A adversidade � um espelho que reflete o verdadeiro eu");
		frases.add("Lamentar aquilo que n�o temos � desperdi�ar aquilo que j� possu�mos");
		frases.add("Uma bela flor � incompleta sem as suas folhas.");
		frases.add("Sem o fogo do entusiasmo, n�o h� o calor da vit�ria.");
		frases.add("O riso � a menor dist�ncia entre duas pessoas.");
		frases.add("Os defeitos s�o mais fortes quando o amor � fraco.");
		frases.add("Amizade e Amor s�o coisas que se unem num piscar de olhos.");
		frases.add("Surpreender e ser surpreendido � o segredo do amor.");
		frases.add("Fa�a pequenas coisas hoje e coisas maiores lhe ser�o confiadas amanh�.");
		frases.add("A paci�ncia na adversidade � sinal de um cora��o sens�vel.");
		frases.add("A sorte favorece a mente bem preparada.");
		frases.add("A sua vis�o se tornar� mais clara apenas quando conseguir olhar para dentro do seu cora��o.");
		frases.add("Quem olha para fora sonha; quem olha para dentro acorda.");
		frases.add("As pessoas esquecer�o o que voc� disse e o que voc� fez� mas nunca esquecer�o como se sentiram.");
		frases.add("Espere pelo mais s�bio dos conselhos: o tempo.");
		frases.add("Todas as coisas s�o dif�ceis antes de se tornarem f�ceis.");
		frases.add("Se voc� se sente s� � porque construiu muros ao inv�s de pontes.");
		frases.add("Vencer � 90 por cento suor e 10 por cento de engenho.");
		frases.add("O amor est� sempre mais pr�ximo do que voc� imagina.");
		frases.add("Voc� � do tamanho do seu sonho.");
		frases.add("Pare de procurar eternamente; a felicidade est� mesmo aqui ao seu lado.");
		frases.add("O conhecimento � a �nica virtude e a ignor�ncia � o �nico v�cio.");
		frases.add("O nosso primeiro e �ltimo amor � o amor-pr�prio.");
		frases.add("Deixe de lado as preocupa��es e seja feliz.");
		frases.add("A vontade das pessoas � a melhor das leis.");
		frases.add("N�s somos o que pensamos.");
		frases.add("A maior barreira para o sucesso � o medo do fracasso.");
		frases.add("O pessimista v� a dificuldade em cada oportunidade; O otimista v� a oportunidade em cada dificuldade.");
		frases.add("Muitas das grandes realiza��es do mundo foram feitas por homens cansados e desanimados que continuaram o seu trabalho.");
		frases.add("O insucesso � apenas uma oportunidade para recome�ar de novo com mais experi�ncia.");
		frases.add("Coragem � a resist�ncia ao medo, dom�nio do medo, e n�o a aus�ncia do medo.");
		frases.add("O verdadeiro homem mede a sua for�a, quando se defronta com o obst�culo.");
		frases.add("Quem quer vencer um obst�culo deve armar-se da for�a do le�o e da prud�ncia da serpente.");
		frases.add("A adversidade desperta em n�s capacidades que, em circunst�ncias favor�veis, teriam ficado adormecidas.");
		frases.add("Motiva��o n�o � sin�nimo de transforma��o, mas um passo em sua dire��o.");
		frases.add("O que empobrece o ser humano, n�o � a falta de dinheiro, mais sim, a falta de f�,motiva��o e criatividade.");
		frases.add("A inspira��o vem dos outros. A motiva��o vem de dentro de n�s.");
		frases.add("N�o acredite mais em pessoas especiais, mas em momentos especiais com pessoas normais.");
		frases.add("A nossa vida tem 4 sentidos� Amar, Sofrer, Lutar e Vencer. Ame muito, sofra pouco, lute bastante e ven�a sempre!");
		frases.add("Nada � por acaso� Acredite em seus sonhos e nos seus potenciais�.Na vida tudo se supera...");
		frases.add("Acredite em milagres, mas n�o dependa deles.");
		frases.add("Voc� sempre ser� a sua melhor companhia!");
		frases.add("Realize o �bvio, pense no improv�vel e conquiste o imposs�vel.");
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
