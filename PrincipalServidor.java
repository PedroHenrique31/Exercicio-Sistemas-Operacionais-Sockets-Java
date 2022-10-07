package Main;
// aqui tbm
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

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
		Frases mensageiro=new Frases();  // intacia o sorteador de frases
		String mensagem=mensageiro.sorteiaFrase();// sorteia uma e salva em string
		int porta=12345;
		System.out.println("Servidor ouvindo na porta "+porta);
		try {
			// pendura um servidor na porta 12345, retorna uma excessão de IOException
			ServerSocket servidor=new ServerSocket(porta); 
			// esse objeto representa a stream de bits que sairá do servidor
			ObjectOutputStream msgSaida; 
			// Esse objeto representa o cliente no servidor e é de onde vem as solicitações
			Socket cliente;
			cliente=servidor.accept(); // fica ouvindo até receber uma solicitação de conexão
			System.out.println("Cliente se conectou! Seu endereço é: "+cliente.getInetAddress().getHostAddress());
			// abre uma conexão de saida com o cliente
			msgSaida=new ObjectOutputStream(cliente.getOutputStream()); 
			msgSaida.flush(); // não sei o que faz
			msgSaida.writeChars(mensagem); // manda a mensagem
			msgSaida.close(); // fecha conexao com cliente?
			servidor.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
