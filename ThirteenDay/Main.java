public class Main{
    public static void main(String[] args){
        
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.print("Lista Original: [");
        for(int i = 0; i < arr.length; i++){
            System.out.printf(" %d ", arr[i]);
        }
        System.out.print("]");

        Ordenador ordenador = new Ordenador(new BubbleSortStrategy());
        int[] arrBubble = arr.clone();
        ordenador.executar(arrBubble);

        System.out.printf("\n\nEstrategia: %s", ordenador.getNome());
        System.out.print("\nLista Ordenada: [");
         for(int i = 0; i < arrBubble.length; i++){
            System.out.printf(" %d ", arrBubble[i]);
        }
        System.out.print("]");

        ordenador.setEstrategia(new SelectionSortStrategy());
        int[] arrSelection = arr.clone();
        ordenador.executar(arrSelection);
        
        System.out.printf("\n\nEstrategia: %s", ordenador.getNome());
        System.out.print("\nLista Ordenada: [");
         for(int i = 0; i < arrSelection.length; i++){
            System.out.printf(" %d ", arrSelection[i]);
        }
        System.out.print("]");
    }
}