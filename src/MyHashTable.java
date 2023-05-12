public class MyHashTable<K, V> {

    // Inner class to represent a node in the linked list
    private class HashNode<K, V> {
        K key;
        V value;
        HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    // The array to hold the table of nodes
    private HashNode<K, V>[] table;
    // The number of elements in the table
    private int size;

    // Default constructor that creates a table with 16 buckets
    public MyHashTable() {
        this(16);
    }

    // Constructor that creates a table with the specified number of buckets
    public MyHashTable(int M) {
        table = new HashNode[M];
        size = 0;
    }
    // Hash function that returns an index into the table for a given key
    private int hash(K key) {
        int index = key.hashCode() & (table.length - 1);
        return index;
    }
    // Method to add a key-value pair to the table
    public void put(K key, V value) {
        int index = hash(key); // Get the index for the key
        HashNode<K, V> node = new HashNode<>(key, value); // Create a new node with the key-value pair
        if (table[index] == null) {
            // If there's no node at the index, add the new node
            table[index] = node;
        } else {
            // If there's already a node at the index, add the new node to the end of the linked list
            HashNode<K, V> curr = table[index];
            while (curr.next != null && !curr.key.equals(key)) {
                curr = curr.next;
            }
            if (curr.key.equals(key)) {
                // If the key is already in the list, update the value
                curr.value = value;
            } else {
                // If the key is not in the list, add the new node to the end
                curr.next = node;
            }
        }
        size++; // Increase the size of the table
    }
}