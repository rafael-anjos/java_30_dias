public class CadastroService {

    public Usuario cadastrar(String nome, String email, int idade) throws CadastroException {
        String[] erros = new String[3];
        int contador = 0;

        if (nome == null || nome.isEmpty()) { 
            erros[contador] = "Erro no cadastro: Nome nao pode ser vazio."; 
            contador++;
        }
        if (idade < 18 || idade > 120) { 
            erros[contador] = "Erro no cadastro: Idade invalida. Deve ser entre 18 e 120 anos.";
            contador++;
        }
        if (!email.contains("@") || !email.contains(".")) { 
            erros[contador] = "Erro no cadastro: Email invalido.";
            contador++;
        }
        String msg = "";
        if (contador > 0) {
            for (int i = 0; i < contador; i++) {
                msg += erros[i] + "\n";
            }
            throw new CadastroException(msg);
        }
        

        return new Usuario(nome, email, idade);
    }
}
