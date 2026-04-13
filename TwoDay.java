import java.util.Scanner;

public class TwoDay {
    
    public static void main(String[] args) {
        int maiusculas = 0, minusculas = 0, especiais = 0, numeros = 0, contador = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Minimo 8 caracteres.");
        System.out.println("1 Letra Maiuscula.");
        System.out.println("1 Letra Minuscula.");
        System.out.println("1 Numero.");
        System.out.println("1 Caractere especial.");
        System.out.println("\n\nDigite sua senha: ");
        String senha = scan.next();

        if (senha.length() < 8) {
            System.out.println("\n\n== ERRO ==");
            System.out.println("Senha deve conter no minimo 8 caracteres.");
        }

        for (int i = 0; i < senha.length(); i++) {
        char letter = senha.charAt(i);
        if (letter >= 'A' && letter <= 'Z') { maiusculas++; }
        else if (letter >= 'a' && letter <= 'z') { minusculas++; }
        else if (letter >= '0' && letter <= '9') { numeros++; }
        else { especiais++; }
        }

        if (maiusculas > 0) { contador++; }
        if (minusculas > 0) { contador++; }
        if (numeros > 0) { contador++; }
        if (especiais > 0) { contador++; }
        if (senha.length() >= 8) { contador++; }

        System.out.println("\n\n== Relatorio Final ==");
        System.out.println("\nTamanho: " + senha.length() + " caracteres.");
        System.out.println("Letras Maiusculas: " + maiusculas);
        System.out.println("Letras Minusculas: " + minusculas);
        System.out.println("Numeros: " + numeros);
        System.out.println("Especiais: " + especiais);

        if (contador >= 0 && contador <= 2) { System.out.println("\nForca: Fraca."); }
        else if (contador >= 3 && contador <= 4) { System.out.println("\nForca: Media."); }
        else { System.out.println("\nForca: Forte."); }

        if (senha.length() < 8) { System.out.println("Senha Valida: Nao"); }
        else { System.out.println("Senha Valida: Sim.");}
    }
}
