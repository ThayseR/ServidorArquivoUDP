package br.com.fileServer.model;

public class Protocolo {
	public static final int PedirConexao = 1; // Envia para o Servidor para avisar que o cliente quer conexão
    public static final int ConexaoAceita = 1; // Envia para o Cliente para avisar que a conexão foi aceita
    public static final int Ping = 2; // Só para verificar se o cliente ainda está conectado
    public static final int Pong = 2; // Só para avisar que o servidor tambem está conectado
    public static final int Desconectar = 3; // Mensagem enviada para finalizar conexão -- Nenhuma resposta é enviada.
    public static final int CodigoInesperado = 0; //Se espera alguma coisa e recebe outra envia codigoInsesperado.
    public static final int PortaServidor = 1989; 
    public static final int PedirArquivo=4;
    public static final int PedidoAceito = 4;
    public static final int TrocandoArquivos = 5;
    public static final int Timeout = 10; // Timeout para reenvio do pacote
    public static final int UPLOAD = 11;
    public static final int DOWNLOAD = 12;
    public static final int ATUALIZAR = 13; //Servidor recebeu um novo arquivo e reenvia lista de nomes para os clientes

}
