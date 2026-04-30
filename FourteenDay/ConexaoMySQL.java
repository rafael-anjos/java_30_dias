public class ConexaoMySQL implements Conexao {
    
    public void conectar(){
        System.out.println("Conectando via MySQL...");
    }
    public void desconectar(){
        System.out.println("Conexao MySQL encerrada.");
    }
}
