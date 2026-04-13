public class PagamentoPix implements Pagamento {
    public String getNome() {
        return "Pix";
    }

    public double processar(double valor) {
        return valor;
    }
}
