public class ConexaoFactory {
    
    public static Conexao criar(TipoConexao tipo){
        switch (tipo) {
            case MYSQL:
                return new ConexaoMySQL();
            case POSTGRESQL:
                return new ConexaoPostgreSQL();
            default:
                throw new IllegalArgumentException("Tipo inválido");         
        }
    }
}
