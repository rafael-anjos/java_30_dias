
public class Main {
    public static void main(String[] args){

        MinhaFila<Integer> fila = new MinhaFila<>();
        MinhaPilha<String> pilha = new MinhaPilha<>();

        System.out.println("== Fila ==");
        System.out.printf("\nEntrando na fila: %d%n", fila.enqueue(1));
        System.out.printf("Entrando na fila: %d%n", fila.enqueue(2));
        System.out.printf("Entrando na fila: %d%n", fila.enqueue(3));
        
        System.out.println("\nFrente: " + fila.peek());
        System.out.println("Dequeue: " + fila.dequeue());
        System.out.println("Dequeue: " + fila.dequeue());
        System.out.println("Frente agora: " + fila.peek());

        System.out.println("\n\n== Pilha ==");
        System.out.println("\nEmpilhando: " + pilha.push("A"));
        System.out.println("Empilhando: " + pilha.push("B"));
        System.out.println("Empilhando: " + pilha.push("C"));

        System.out.println("\nTopo: " + pilha.peek());
        System.out.println("Desempilhar: " + pilha.pop());
        System.out.println("Desempilhar: " + pilha.pop());
        System.out.println("Topo agora: " + pilha.peek());

    }
        
}
