package iterator.implementations;

import iterator.AbstractIterator;

import java.util.Collection;

public class DefaultIterator<T> implements AbstractIterator {

    private final Collection collection;
    private int lastItem;

    public DefaultIterator(Collection collection) {
        this.collection = collection;
        this.lastItem = 0;
    }

    @Override
    public T getFirst() {
        return (T) collection.toArray()[0];
    }

    @Override
    public T getNext() {
        T[] all = (T[]) collection.toArray();

        if (lastItem == all.length) {
            return null;
        }

        T next = all[lastItem];
        lastItem++;
        return next;

    }
}
