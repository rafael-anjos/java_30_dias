import java.util.Scanner;

public class OneDay {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de alunos: ");
        int tam = scan.nextInt();
        double[] v = new double[tam];
        double sum = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        int aprovado = 0;

        for (int i = 0; i < v.length; i++ ) {
            System.out.println("Digite a nota do " + (i + 1) + "º aluno: ");
            v[i] = scan.nextDouble();
            sum += v[i];
            if(v[i] > maior) maior = v[i];
            if(v[i] < menor) menor = v[i];
            if(v[i] >= 6) aprovado ++;
        }
        scan.close();

        double avg = sum / v.length;
        double percentualA = (double) aprovado / v.length * 100;
        double percentualR = 100 - percentualA;

        System.out.println("Quantidade de alunos? " + v.length);
        for (int i = 0; i < v.length; i++) {
            System.out.println("\nNota " + (i + 1) + ": " + v[i]);
        }

        System.out.println("\n\n== Resultado da Turma ==");

        System.out.println("\n\nMedia: " + avg);
        System.out.println("\nMaior Nota: " + maior);
        System.out.println("\nMenor Nota: " + menor);
        System.out.printf("\nAprovados: %d (%.1f%%)%n", aprovado, percentualA);
        System.out.println("\nReprovados: " + (v.length - aprovado) + " ( " + percentualR + "% )");
    }
}