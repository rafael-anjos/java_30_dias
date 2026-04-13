public class Caixa {
    public void finalizarPagamento(double valor, Pagamento pagamento) {
        double valorFinal = pagamento.processar(valor);
        System.out.println("\n== Caixa ==");
        System.out.printf("Forma de Pagamento: %s%n", pagamento.getNome());
        System.out.printf("Valor original: R$ %,.2f%n", valor);
        System.out.printf("Valor cobrado: R$ %,.2f%n", valorFinal);
    }
}
