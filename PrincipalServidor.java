package Main;
// aqui tbm
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

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
		Frases mensageiro=new Frases();  // intacia o sorteador de frases
		String mensagem=mensageiro.sorteiaFrase();// sorteia uma e salva em string
		int porta=12345;
		System.out.println("Servidor ouvindo na porta "+porta);
		try {
			// pendura um servidor na porta 12345, retorna uma excess�o de IOException
			ServerSocket servidor=new ServerSocket(porta); 
			// esse objeto representa a stream de bits que sair� do servidor
			ObjectOutputStream msgSaida; 
			// Esse objeto representa o cliente no servidor e � de onde vem as solicita��es
			Socket cliente;
			cliente=servidor.accept(); // fica ouvindo at� receber uma solicita��o de conex�o
			System.out.println("Cliente se conectou! Seu endere�o �: "+cliente.getInetAddress().getHostAddress());
			// abre uma conex�o de saida com o cliente
			msgSaida=new ObjectOutputStream(cliente.getOutputStream()); 
			msgSaida.flush(); // n�o sei o que faz
			msgSaida.writeChars(mensagem); // manda a mensagem
			msgSaida.close(); // fecha conexao com cliente?
			servidor.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
