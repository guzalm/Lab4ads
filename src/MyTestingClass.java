import java.util.Objects;

public class MyTestingClass {

    private int id;

    public MyTestingClass(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + id;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTestingClass that = (MyTestingClass) o;
        return id == that.id;
    }

    @Override
    public String toString() {
        return "MyTestingClass{" +
                "id=" + id +
                '}';
    }

}
