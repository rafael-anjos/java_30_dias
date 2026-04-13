
public class FourDay {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Rafael", 1, 2500);
        ContaBancaria conta2 = new ContaBancaria("Isaac", 2, 2000);
        
        conta1.extrato();
        conta2.extrato();
        conta1.depositar(500);
        conta1.sacar(600);
        conta1.transferir(500, conta2);
        conta1.extrato();
        conta2.extrato();
    }

}

class ContaBancaria {

    private String titular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String titular, int numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("\nDeposito de " + String.format("R$ %,.2f", valor) + " realizado.");
    }
    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("\nSaque de " + String.format("R$ %,.2f", valor) + " realizado.");
    }
    public void transferir(double valor, ContaBancaria destino) {
        saldo -= valor;
        destino.saldo += valor;
        System.out.println("\nTranferencia de " + String.format("R$ %,.2f", valor) + " para conta de " + destino.titular + " realizada.");
    }
    public void extrato() {
        System.out.println("\n== EXTRATO ==");
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: " + String.format("R$ %,.2f", saldo));
    }


}
