
public class CLT extends Funcionario{
    private double salario;

    public CLT(String nome, int matricula,double salario) {
        super(nome, matricula);
        this.salario = salario;
    }

    public double calcularSalario() {
        return salario;
    }
}
