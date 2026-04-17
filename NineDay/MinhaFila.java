import java.util.ArrayList;

public class MinhaFila<T> {
    
    private ArrayList<T> fila = new ArrayList<>();

    public T enqueue(T item) {
        fila.add(item);
        return item;
    }

    public T dequeue() {
        T element = fila.getFirst();
        fila.removeFirst();
        return element;
    }
    
    public T peek() {
        return fila.getFirst();
    }

    public boolean isEmpty() {
        return fila.isEmpty();
    }
}
