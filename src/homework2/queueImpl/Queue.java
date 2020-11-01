package homework2.queueImpl;

public interface Queue<E> {

    boolean insertLeft(E value);

    E removeRight();

    E peekHead();

    int size();

    default boolean isEmpty(){
        return size() == 0;
    }

    boolean isFull();
}
