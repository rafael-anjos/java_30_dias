public class Horista extends Funcionario{
    private double valorHora;
    private double horaTrabalhada;

    public Horista (String nome, int matricula, double valorHora, double horaTrabalhada) {
        super(nome, matricula);
        this.valorHora = valorHora;
        this.horaTrabalhada = horaTrabalhada;
    }

    public double calcularSalario() {
        if (horaTrabalhada > 44) { 
            double horaExtra = horaTrabalhada - 44;
            return (44 * valorHora) + (horaExtra * valorHora * 1.5);
        }
        return horaTrabalhada * valorHora;
    }
}
