public class Ordenador {
    
    private EstrategiaOrdenacao estrategiaOrdenacao;

    public Ordenador(EstrategiaOrdenacao estrategiaOrdenacao){
        this.estrategiaOrdenacao = estrategiaOrdenacao;
    }

    public String getNome(){
        return estrategiaOrdenacao.getNome();
    }

    public void setEstrategia(EstrategiaOrdenacao estrategiaOrdenacao){
        this.estrategiaOrdenacao = estrategiaOrdenacao;
    }

    public void executar(int[] arr){
        estrategiaOrdenacao.ordenar(arr);
    }
}
