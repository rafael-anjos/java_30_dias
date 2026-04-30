public class Main{
    public static void main(String[] args){
        
        GerenciadorConexao conexao = GerenciadorConexao.getInstancia();

        conexao.abrirConexao(TipoConexao.MYSQL);
        conexao.abrirConexao(TipoConexao.POSTGRESQL);

    }
}