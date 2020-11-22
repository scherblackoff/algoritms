package homework8;

public class DoubleHashTableImpl<K, V> extends HashTableImpl<K, V>{

    private final int DOUBLE_HASH_CONST = 5;

    public DoubleHashTableImpl(int maxSize) {
        super(maxSize);
    }

    private int doubleHash(K key){
        return DOUBLE_HASH_CONST - (key.hashCode() % DOUBLE_HASH_CONST);
    }

    @Override
    protected int getStep(K key) {
        return doubleHash(key);
    }
}
