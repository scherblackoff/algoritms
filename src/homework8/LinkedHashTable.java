package homework8;

import java.util.LinkedList;
import java.util.List;

public class LinkedHashTable<K, V> implements HashTable<K, V> {

    static class Node<K, V> implements Entry<K, V> {

        private final K key;

        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    private final List<Node<K, V>>[] data;
    private final int maxSize;
    private int size;

    @SuppressWarnings("unchecked")
    public LinkedHashTable(int maxSize) {
        this.maxSize = maxSize;
        this.data = new LinkedList[this.maxSize];
    }

    @Override
    public boolean put(K key, V value) {
        int index = hash(key);
        if (size == maxSize) {
            return false;
        }
        if(data[index] == null){
            data[index] = new LinkedList<>();
        }
        List<Node<K, V>> currentList = data[index];
        if (currentList.isEmpty()) {
            currentList.add(new Node<>(key, value));
            size++;
            return true;
        }

        for (Node<K, V> node : currentList) {
            if (node.getKey().equals(key)) {
                node.setValue(value);
                return true;
            }
        }
        currentList.add(new Node<>(key, value));
        size++;
        return true;
    }

    private int hash(K key) {
        return key.hashCode() % data.length;
    }

    @Override
    public V get(K key) {
        int index = indexOf(key);
        if (data[index] == null){
            return null;
        }
        List<Node<K, V>> currentList = data[index];
        for (Node<K, V> node : currentList) {
            if (node.getKey().equals(key)) {
                return node.getValue();
            }
        }
        return null;
    }

    private int indexOf(K key) {
        return hash(key);
    }

    @Override
    public V remove(K key) {
        int index = indexOf(key);
        if (data[index] == null){
            return null;
        }
        List<Node<K, V>> currentList = data[index];
        for (Node<K, V> node : currentList) {
            if (node.getKey().equals(key)) {
                V deleteValue = node.getValue();
                currentList.remove(node);
                return deleteValue;
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void display() {
        System.out.println("-----------");
        for (int i = 0; i < data.length; i++) {
            if(data[i] == null){
                continue;
            }
            for (Node<K, V> node : data[i]) {
                System.out.printf("%d = [%s]%n", i, node);
            }
        }
        System.out.println("-----------");
    }
}
