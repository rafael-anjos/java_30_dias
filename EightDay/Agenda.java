import java.util.ArrayList;
import java.util.HashMap;

public class Agenda {
    
    ArrayList<Contato> contatos = new ArrayList<>();

    HashMap<String, Contato> mapa = new HashMap<>();

    public void adicionar(Contato c){
        contatos.add(c);
        mapa.put(c.getNome(), c);
    }
    public void listarTodos(){
        System.out.println("\n\n== Agenda ==");
        for(int i = 0; i < contatos.size(); i++) {
            Contato c = contatos.get(i);
            System.out.println("\n" + c.getNome() + " | " + c.getTelefone() + " | " + c.getEmail());
        }
    }
    public void remover(String nome){
        for(int i = 0; i < contatos.size(); i++){
            if (nome.equals(contatos.get(i).getNome())) {
                contatos.remove(i);
                mapa.remove(nome);
                System.out.printf("Removendo %s...%n", nome);
            }
        }
    }
    public void buscar(String nome){
        Contato c = mapa.get(nome);
        if (mapa.containsKey(nome)) {
            System.out.printf("\n\nBuscando %s: %s | %s%n", nome, c.getTelefone(), c.getEmail());
        } else { System.out.printf("\n\nBuscando %s: nao encontrado.", nome);}
    }
}
