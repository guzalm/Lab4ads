import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(random.nextInt(100));
            Student value = new Student("John Doe", 1234);
            table.put(key, value);
        }
        table.printBucketSize();
    }

}

