public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato("Rafael", "62995223092", "rafael@gmail.com");
        Contato contato2 = new Contato("Isaac", "62985869495", "isaac@gmail.com");
        Contato contato3 = new Contato("Ana", "62997452315", "ana@gmail.com");
        Agenda agenda = new Agenda();

        agenda.adicionar(contato1);
        agenda.adicionar(contato2);
        agenda.adicionar(contato3);

        agenda.listarTodos();

        agenda.buscar("Rafael");
        agenda.remover("Ana");

        agenda.listarTodos();

        agenda.buscar("Ana");
    }
}