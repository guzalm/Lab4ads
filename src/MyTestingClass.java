public class MyTestingClass {
    private int id; // private integer to store the id of the object
    private String name; // private string to store the name of the object
    public MyTestingClass(int id, String name) {
        this.id = id; // constructor that initializes the id field with the passed value
        this.name = name; // constructor that initializes the name field with the passed value
    }
    public int getId() {
        return id; // method that returns the id value of the object
    }

    public String getName() {
        return name; // method that returns the name value of the object
    }
}
