public class SelectionSortStrategy implements EstrategiaOrdenacao{

    public String getNome(){
        return "Selection Sort";
    }
    
    public void ordenar(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int menorIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[menorIndex]) {
                    menorIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[menorIndex];
            arr[menorIndex] = temp;
        }
    }
}
