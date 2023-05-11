public class MyHashTable<K, V> {

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

    private HashNode<K, V>[] table;
    private int size;

    public MyHashTable() {
        this(16);
    }

    public MyHashTable(int M) {
        table = new HashNode[M];
        size = 0;
    }
}