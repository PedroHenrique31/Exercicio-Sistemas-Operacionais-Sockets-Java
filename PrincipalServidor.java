package Main;
/*
 *  Implemente uma aplica��o cliente/servidor usando sockets em Java para solicita��es e respostas. 
 *  A ideia � projetar e implementar um servidor de �Mensagens de Boa Sorte�, iguais �quelas que 
 *  aparecem em biscoitos da sorte chineses. As mensagens s�o textos est�o em um array[50] de 
 *  String na classe Servidor e que devem ser enviados aleatoriamente como 
 *  resposta a um pedido de cliente. 
 *   A classe Servidor que deve receber um socket como par�metro e ter o m�todo que envia as 
 *   mensagens aleat�rias de boa sorte. 
 *  O array pode conter mensagens est�ticas
 *  */
public class PrincipalServidor {
	public static void main(String[] args) {
		Frases mensageiro=new Frases();
		String mensagem=mensageiro.sorteiaFrase();
		System.out.println(mensagem);
	}
}
