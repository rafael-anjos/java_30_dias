public abstract class Funcionario {
    protected  String nome;
    protected  int matricula;

    public Funcionario(String nome, int matricula) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public abstract double calcularSalario();
}