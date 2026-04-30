public class GerenciadorConexao {
    
    private static GerenciadorConexao instancia = new GerenciadorConexao();

    private GerenciadorConexao(){}

    public void abrirConexao(TipoConexao tipo){
        ConexaoFactory.criar(tipo).conectar();
    }

    public static GerenciadorConexao getInstancia(){
        return instancia;
    }
}
