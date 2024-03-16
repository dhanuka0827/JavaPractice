package dsa.kk.pojo;

public class Student {
    private String name;

    private int age;
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(Student student) {
        this.name = student.getName();
        this.age = student.getAge();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
