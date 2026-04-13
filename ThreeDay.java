import java.util.Scanner;

public class ThreeDay {
    public static void main(String[] args) {

        ThreeDay td = new ThreeDay();
        Scanner scan = new Scanner(System.in);
        int option;
        int n;

        do {
            System.out.println("== MENU ==");
            System.out.println("\n1. Fibonacci.");
            System.out.println("2. Fatorial.");
            System.out.println("3. Primo.");
            System.out.println("0. Sair.");
            System.out.println("\n==========");
            System.out.println("\nEscolha: "); option = scan.nextInt();
            System.out.println("Digite n: "); n = scan.nextInt();

            switch (option) {
                case 1: System.out.println("Fibonacci: " + td.fibonacci(n)); break;
                case 2: System.out.println("Fatorial " + n + "!: " + td.fatorial(n)); break;
                case 3: System.out.println("Primo: " + n + (td.primo(n) ? " é primo." : " não é primo.")); break;
                case 0: System.out.println("Saindo do programa..."); break;
                default: System.out.println("Erro: Escolha um numero entre as opcoes.");
            }
        } while (option != 0);
    }

    public int fibonacci(int n) {
        if (n == 0) {return 0;}
        if (n == 1) {return 1;}
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public boolean primo(int n) {
        int[] vetor = { 2, 3, 5, 7, 11, 13, 17};
        int contador = 0;
        for (int i = 0; i < vetor.length && contador == 0; i++) {
            if (n % vetor[i] == 0 && n != vetor[i]) { contador++; }
            if (n == vetor[i] || n == 1) {contador = 0;}
        }   
        if (contador == 0) {return true;}
        else {return false;}
    }

    public int fatorial(int n) {
        if(n <= 1) { return 1;}
        return n * fatorial(n - 1);
    }
}