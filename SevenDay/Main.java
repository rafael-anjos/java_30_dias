public class Main {
    public static void main(String[] args) {
        CadastroService service = new CadastroService();

        try {
            Usuario user = service.cadastrar("Rafael", "rafael@gmail.com", 22);
            System.out.printf("\nUsuario Cadastrado: %s | %s | %d anos.", user.getNome(), user.getEmail(), user.getIdade());
        } catch (CadastroException e) {
            System.err.println(e.getMessage());
        }
    }
}
