public class Main {
    public static void main(String[] args){
        PagamentoBoleto pgBoleto = new PagamentoBoleto(3.5);
        PagamentoCartaoCredito pgCartao = new PagamentoCartaoCredito(0.025);
        PagamentoPix pgPix = new PagamentoPix();
        Caixa cx = new Caixa();

        cx.finalizarPagamento(500, pgCartao);
        cx.finalizarPagamento(300, pgBoleto);
        cx.finalizarPagamento(200, pgPix);
    }
}