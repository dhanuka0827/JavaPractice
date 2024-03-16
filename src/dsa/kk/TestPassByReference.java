package dsa.kk;

import dsa.kk.pojo.Student;

public class TestPassByReference {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vikram");
        Student student1 = student;
        Student student2 = new Student(student);
        System.out.println(student); //Vikram
        System.out.println(student1); //Vikram
        System.out.println(student2); //Vikram

        student.setName("Peeyu");

        System.out.println(student); //Peeyu
        System.out.println(student1); //Peeyu
        System.out.println(student2); //Vikram
    }
}
