import java.util.Arrays;
import java.util.Random;

public class Main {

    // Main method
    public static void main(String[] args) {
        // Creating a new instance of MyHashTable with key type MyTestingClass and value type Student
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();
        MyHashTable<MyTestingClass, Student> table2 = new MyHashTable<>();

        // Creating a new instance of Random to generate random numbers
        Random random = new Random();

        // Adding 10000 key-value pairs to the hash table with randomly generated keys and a fixed value
        MyTestingClass key = null;
        Student value = null;
        for (int i = 0; i < 10000; i++) {
            key = new MyTestingClass(random.nextInt(100));
            value = new Student("John Doe", 1234);
            table.put(key, value);
        }
        table2.putAll(table);


        // Printing the size of each bucket in the hash table
        table.printBucketSize();
        table2.printBucketSize();

        }
    }




