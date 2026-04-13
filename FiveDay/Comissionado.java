public class Comissionado extends Funcionario{
    private double salario;
    private double comissao;
    private double vendas;

    public Comissionado (String nome, int matricula, double salario, double comissao, double vendas) {
        super(nome, matricula);
        this.salario = salario;
        this.comissao = comissao;
        this.vendas = vendas;
    }

    public double calcularSalario() {
        double soma = vendas * comissao;
        salario += soma;
        return salario;
    }
}
