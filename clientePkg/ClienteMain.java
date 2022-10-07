

import java.io.ObjectInputStream;
import java.net.Socket;

public class ClienteMain {
	public static void work(String[] args) {
		System.out.println("Olá sou o cliente, vamos sortear uma frase.");
		try {
			Socket conxServidor= new Socket("Pedro",12345); // abre uma conexão na porta 12345
			// abre uma conexão de entrada com o servidor que receberá um stream de bits
			ObjectInputStream entrada = new ObjectInputStream(conxServidor.getInputStream());
			String mensagemRecebida=(String)entrada.readObject();
			System.out.println(mensagemRecebida);
			entrada.close();
			System.out.println("Conexão encerrada");
			
			
		}catch(Exception e) {
			System.out.println("Erro: "+e.getMessage());
			e.printStackTrace();
		}
	}
}
