public class ConexaoPostgreSQL implements Conexao{
    
    public void conectar(){
        System.out.println("Conectando via PostgreSQL...");
    }

    public void desconectar(){
        System.out.println("Conexao PostgreSQL encerrada.");
    }
}
