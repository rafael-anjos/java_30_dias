import java.util.ArrayList;

public class MinhaPilha<T> {

    private ArrayList<T> pilha = new ArrayList<>();

    public T push(T item){ 
        pilha.add(item);
        return item;
    }

    public T pop() {
        T element = pilha.getLast();
        pilha.removeLast();
        return element;
    }

    public T peek() {
        return pilha.getLast();
    }
    public boolean isEmpty() {
        return pilha.isEmpty();
    }
}
