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
        int hashCode = key.hashCode() % table.length;
        return (hashCode < 0) ? hashCode + table.length : hashCode;
    }
}