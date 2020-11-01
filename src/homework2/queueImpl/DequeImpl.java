package homework2.queueImpl;

public class DequeImpl<E extends Object & Comparable<? super E> > extends QueueImpl<E> {


    public DequeImpl(int capacity) {
        super(capacity);
    }

    public boolean insertRight(E value) {
        if (isFull()) {
            return false;
        }
        if (head == 0) {
            head = data.length;
        }
        data[--head] = value;
        size++;
        return true;
    }

    public E removeLeft(){
        if (isEmpty()) {
            return null;
        }
        if (tail == -1) {
            tail = data.length - 1;
        }
        E removedValue = data[tail--];
        size--;
        return removedValue;
    }
}
