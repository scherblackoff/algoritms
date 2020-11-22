package homework8;

public class Main {

    public static void main(String[] args) {
        HashTable<Product, Integer> linkedHashTable = new LinkedHashTable<>(10);
        linkedHashTable.put(new Product(1, "Orange"), 150);
        linkedHashTable.put(new Product(77, "Banana"), 100);
        linkedHashTable.put(new Product(77, "Carrot"), 228);
        linkedHashTable.put(new Product(60, "Lemon"), 250);
        linkedHashTable.put(new Product(21, "Potato"), 67);
        linkedHashTable.remove(new Product(21, "Potato"));
        System.out.println(linkedHashTable.size());
        linkedHashTable.display();
    }
}
