public class Student {

    // Fields to store the name and ID of the student
    private String name;
    private int id;

    // Constructor to initialize the name and ID of the student
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter method for the name field
    public String getName() {
        return name;
    }

    // Setter method for the name field
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the id field
    public int getId() {
        return id;
    }

    // Setter method for the id field
    public void setId(int id) {
        this.id = id;
    }
}

