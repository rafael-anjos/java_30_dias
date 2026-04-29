public class Main {
    public static void main(String[] args) {
        No<Integer> cabeca = new No<Integer>(5, null);
        ListaLigada<Integer> lista = new ListaLigada<>(cabeca);

        System.out.println("Cabeça: " + lista.getCabeca().getValor());
        lista.adicionar(6);
        lista.adicionar(7);
        lista.adicionar(8);
        lista.adicionar(9);
        lista.adicionar(10);
        lista.adicionar(11);

        System.out.println("\n== Todos ==");
        lista.imprimir();
    }
}