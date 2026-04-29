public class Main{
    public static void main(String[] args){
        Busca busca = new Busca();
        int[] arr = {11, 14, 15, 26, 33, 35, 37, 44, 45, 49, 57, 62, 64, 67, 74, 77, 83, 84, 85, 96};

        busca.buscaLinear(arr, 45);

        busca.buscaBinaria(arr, 45);
    }
}