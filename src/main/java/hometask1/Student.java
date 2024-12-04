package hometask1;

public class Student {
    private String name;
    private String id;

    public Student () {
        name = "unknowm";
        id = "unknown";
    }

    Student (String name, String id) {
        this.name = name;
        this.id = id;
    }

    Student (String name) {
        this.name = name;
        this.id = "id_" + name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
