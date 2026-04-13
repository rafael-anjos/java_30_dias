public class Main {
    public static void main(String[] args) {

        System.out.printf("%-15s %-15s %s%n", "NOME", "TIPO", "SALARIO");
        System.out.println("-".repeat(45));

        Funcionario[] func = {
            new CLT("Rafael", 1, 1621),
            new Horista("Lucas", 2, 52.03, 44),
            new Comissionado("Daniel", 3, 1621, 0.1, 10000)
        };
        double soma = 0;
        for (int i = 0; i < func.length; i++) {
            double salario = func[i].calcularSalario();
            System.out.printf("%-15s %-15s R$ %,.2f%n", 
                func[i].nome,
                func[i].getClass().getSimpleName(),
                salario
            );
            soma += salario;
        }

        System.out.println("-".repeat(45));
        System.out.printf("Total da folha: R$ %,.2f", soma);
    }
}
