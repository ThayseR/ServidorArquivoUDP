/**
 * 
 */
package br.com.fileServer.model;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

import br.com.fileServer.thread.ThreadCliente;

/**
 * @author Thayse
 *
 */
public class ServidorArquivo {

	private static int PORTA = 1984; //Porta que o servidor est� ouvindo
	
	public static void main(String[] args) {

		//if(args.length < 1) { 
			//System.out.println("Informe a porta a ser ouvida pelos servidor"); 
			//System.exit(0); } 
			try { 
				
				//Converte o parametro recebido para int (n�mero da porta) 
				//int port = Integer.parseInt(args[0]); 
				System.out.println("Incializando o servidor..."); 
				
				//Iniciliza o servidor 
				DatagramSocket server = new DatagramSocket(PORTA);
				System.out.println("Servidor iniciado, ouvindo a porta " + PORTA); 
				//Aguarda conex�es 
				//while(true) { 
					//Inicia thread do cliente onde ser� tratado v�rias conex�es
					//new ThreadCliente(server).start();
				//}
				
				//Preparando o buffer de recebimento da mensagem
		        byte[] msg = new byte[256];
				DatagramPacket pkg = new DatagramPacket(msg, msg.length);
				
				Boolean ouvir = true; //condi��o de ficar ouvindo a porta ou encerrar servidor
				
				while (ouvir){
					server.receive(pkg);
					String msgStr = new String(pkg.getData()).toString();
					System.out.println("Mensagem recebida: " + msgStr);
				}
				
				server.close();
				 
				
			} 
			catch(Exception e) {
				e.printStackTrace();
			}

			} 
	}
				


