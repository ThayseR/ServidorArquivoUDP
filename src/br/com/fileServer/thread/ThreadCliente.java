/**
 * 
 */
package br.com.fileServer.thread;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author Thayse
 *
 */
public class ThreadCliente extends Thread{
	private DatagramSocket cliente;
	
	public ThreadCliente(DatagramSocket cliente){
		this.cliente = cliente;
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Thread#run()
	 * 
	 */
	public void run(){
		/*
		 * Trata as conexões aqui entre cada cliente e servidor terá um tratamento ping pong para verificar
		 * a conexão e o envio e recebimento de arquivos
		 * 
		 */
		
		//Preparando o buffer de recebimento da mensagem com nome do arquivo
		byte[] msg = new byte[256]; 
		//Prepara o pacote de dados 
		DatagramPacket pkg = new DatagramPacket(msg, msg.length); 
		//Recebimento da mensagem 
		try {
			cliente.receive(pkg);
			String nomeArquivo = pkg.getData().toString();
			System.out.println("Cliente pediu arquivo: " + nomeArquivo);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
	}

}
