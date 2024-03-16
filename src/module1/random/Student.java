package module1.random;

public class Student {
    private String name;

    public Student() {
    }
    public Student(String name) {
        this.name = name;
    }
    public Student(Student student) {
        this.name = student.getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }


}
