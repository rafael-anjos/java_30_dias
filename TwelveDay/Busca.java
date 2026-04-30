public class Busca {
    
    public void buscaLinear(int[] arr, int alvo){
        int comp = 0;
        int temp = 0;
        boolean contem = false;
        for (int i = 0; i < arr.length; i++){
            comp++;
            if (arr[i] == alvo){
                contem = true;
                temp = i;
                break;
            }
        }
        if(contem){
            System.out.printf("Indice encontrado: %d%n",temp);
            System.out.printf("Comparacoes: %d%n", comp);
        }else{
            System.out.println("Nao encontrado.");
        }
    }

    public void buscaBinaria(int[] arr, int alvo){
        int comp = 0;
        int temp = 0;
        int inicio = 0; int fim = arr.length - 1; int meio;
        boolean contem = false;
        while (inicio <= fim){
            comp++;
            meio = (inicio + fim) / 2;
            if (arr[meio] == alvo){
                contem = true;
                temp = meio;
                break;
            }
            else if(arr[meio] < alvo){
                inicio = meio + 1;
            }
            else if(arr[meio] > alvo){
                fim = meio - 1;
            }
        }
        if(contem){
            System.out.printf("Indice encontrado: %d%n",temp);
            System.out.printf("Comparacoes: %d%n", comp);
        }else{
            System.out.println("Nao encontrado.");
        }
    }
}
