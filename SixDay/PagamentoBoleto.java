public class PagamentoBoleto implements Pagamento {
    private double taxa;

    public PagamentoBoleto(double taxa){
        this.taxa = taxa;
    }

    public String getNome() {
        return "Boleto";
    }

    public double processar(double valor) {
        return valor + taxa;
    }
}
