import java.util.Arrays;
import java.util.LinkedList;

public class MyHashTable<K, V> {

    private LinkedList<Entry<K, V>>[] table;
    private int size;

    public MyHashTable() {
        table = new LinkedList[16]; // Initialize table with an array of 16 linked lists
        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList<Entry<K, V>>(); // Initialize each linked list in the array
        }
        size = 0; // Initialize size to zero
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void put(K key, V value) {
        if (key == null) {
            return;
        }
        int index = getIndex(key); // Get the index of the bucket where the key-value pair should be stored
        LinkedList<Entry<K, V>> bucket = table[index]; // Get the linked list (bucket) at the index
        for (Entry<K, V> entry : bucket) { // Check if the key already exists in the bucket
            if (entry.key.equals(key)) {
                entry.value = value; // Update the value if the key already exists
                return;
            }
        }
        bucket.add(new Entry<K, V>(key, value)); // Add a new entry if the key does not already exist
        size++;
    }

    public V get(K key) {
        if (key == null) {
            return null;
        }
        int index = getIndex(key); // Get the index of the bucket where the key-value pair should be stored
        LinkedList<Entry<K, V>> bucket = table[index]; // Get the linked list (bucket) at the index
        for (Entry<K, V> entry : bucket) { // Iterate through the entries in the bucket
            if (entry.key.equals(key)) {
                return entry.value; // Return the value if the key is found
            }
        }
        return null; // Return null if the key is not found
    }

    public void remove(K key) {
        if (key == null) {
            return;
        }
        int index = getIndex(key); // Get the index of the bucket where the key-value pair should be stored
        LinkedList<Entry<K, V>> bucket = table[index]; // Get the linked list (bucket) at the index
        for (Entry<K, V> entry : bucket) { // Iterate through the entries in the bucket
            if (entry.key.equals(key)) {
                bucket.remove(entry); // Remove the entry if the key is found
                size--;
                return;
            }
        }
    }

    private int getIndex(K key) {
        int hashCode = key.hashCode(); // Get the hash code of the key
        int index = hashCode % table.length; // Compute the index by taking the remainder of the hash code divided by the length of the array
        return index;
    }

    private static class Entry<K, V> {

        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public void printBucketSize() {
        int[] sizes = new int[table.length]; // Create an array to store the sizes of each bucket
        for (int i = 0; i < table.length; i++) {
            sizes[i] = table[i].size(); // Get the size of each bucket and store it in the array
        }
        System.out.println("Bucket sizes: " + Arrays.toString(sizes));
    }
    public void putAll(MyHashTable<K, V> otherHashTable) {
        for (LinkedList<Entry<K, V>> bucket : otherHashTable.table) {
            for (Entry<K, V> entry : bucket) {
                put(entry.key, entry.value);
            }
        }
    }
}
