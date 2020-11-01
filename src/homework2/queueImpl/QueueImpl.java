package homework2.queueImpl;


public class QueueImpl<E> implements Queue<E> {

    protected E data[];
    protected int size;

    protected static final int DEFAULT_TAIL = -1;
    protected static final int DEFAULT_HEAD = 0;

    protected int tail;
    protected int head;

    @SuppressWarnings("unchecked")
    public QueueImpl(int capacity) {
        this.data = (E[]) new Object[capacity];
        this.tail = DEFAULT_TAIL;
        this.head = DEFAULT_HEAD;
    }

    @Override
    public boolean insertLeft(E value) {
        if (isFull()) {
            return false;
        }
        if (tail == data.length - 1) {
            tail = DEFAULT_TAIL;
        }
        data[++tail] = value;
        size++;
        return true;
    }

    @Override
    public E removeRight() {
        if(isEmpty()){
            return null;
        }
        if(head == data.length){
            head = DEFAULT_HEAD;
        }
        E removedValue = data[head++];
        size--;
        return removedValue;
    }

    @Override
    public E peekHead() {
        return data[head];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isFull() {
        return data.length == size();
    }
}
