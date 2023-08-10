package generics;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
    public final T[] items = (T[]) new Object[10];
    private int count;

    public void addItem(T item) {
        items[count++] = item;
    }

    public T getItemIndex(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
