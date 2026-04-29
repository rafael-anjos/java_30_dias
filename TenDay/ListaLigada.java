public class ListaLigada<T> {
    private No<T> cabeca;
    private int tamanho = 0;

    public ListaLigada(No<T> cabeca){
        this.cabeca = cabeca;
    }

    public void adicionar(T valor) {
        No<T> atual = cabeca;
        No<T> newNo = new No<>(valor, null);
        while(atual != null){
            if(atual.getProximo() == null){
                atual.setProximo(newNo);
                System.out.println("Adicionado: " + newNo.getValor());
                atual = newNo.getProximo();
            }else{atual = atual.getProximo();}
        }
    }

    public void imprimir() {
        No<T> atual = cabeca;
        System.out.print("Lista: "+atual.getValor());
        while (atual != null) {
            if (atual.getProximo() == null) {
            System.out.print(" -> null");
            atual = atual.getProximo();
            tamanho++;}
            else {
                atual = atual.getProximo();
                System.out.print(" -> "+atual.getValor());
                tamanho++;
            }
        }
        System.out.println("\nTamanho: " + tamanho);
    }

    public No<T> getCabeca(){
        return cabeca;
    }

}
