package homework2.stackImpl;



public class StackImpl<E> implements Stack<E> {

    private E[] data;
    private int size;


    @SuppressWarnings("unchecked")
    public StackImpl(int maxSize) {
        this.data = (E[]) new Object[maxSize];
    }

    @Override
    public void push(E value) {
        data[size++] = value;
    }

    @Override
    public E pop() {
        return data[--size];
    }

    @Override
    public E peek() {
        return data[size - 1];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isFull() {
        return data.length == size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            stringBuilder.append(data[i]);
            stringBuilder.append(", ");
        }
        if (size != 0){
            stringBuilder.append(data[size - 1]);
        }
        stringBuilder.append("]");
        return String.valueOf(stringBuilder);
    }
}
