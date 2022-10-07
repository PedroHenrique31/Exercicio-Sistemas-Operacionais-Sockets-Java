package Main;
/*
 *  Implemente uma aplicação cliente/servidor usando sockets em Java para solicitações e respostas. 
 *  A ideia é projetar e implementar um servidor de “Mensagens de Boa Sorte”, iguais àquelas que 
 *  aparecem em biscoitos da sorte chineses. As mensagens são textos estão em um array[50] de 
 *  String na classe Servidor e que devem ser enviados aleatoriamente como 
 *  resposta a um pedido de cliente. 
 *   A classe Servidor que deve receber um socket como parâmetro e ter o método que envia as 
 *   mensagens aleatórias de boa sorte. 
 *  O array pode conter mensagens estáticas
 *  */
public class PrincipalServidor {
	public static void main(String[] args) {
		Frases mensageiro=new Frases();
		String mensagem=mensageiro.sorteiaFrase();
		System.out.println(mensagem);
	}
}
