package homework6;

import java.util.function.Consumer;

public interface Tree<E extends Comparable<? super E>>{

    boolean add(E value);

    boolean contains(E value);

    boolean remove(E value);

    int size();

    void traverse(TraverseMode mode, Consumer<E> action);

    default boolean isEmpty(){
        return size() == 0;
    }

    boolean checkBalanced();

    int getLevel();

    void display();

    int getMaxLevel();

    enum TraverseMode{
        IN_ORDER,
        PRE_ORDER,
        POST_ORDER
    }
}
