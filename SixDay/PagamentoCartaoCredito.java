public class PagamentoCartaoCredito implements Pagamento{
    private double juros;

    public PagamentoCartaoCredito(double juros) {
        this.juros = juros;
    }

    public String getNome(){
        return "Cartao de Credito";
    }

    public double processar(double valor) {
        return valor + (valor * juros);
    }
}