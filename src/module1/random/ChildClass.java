package module1.random;

import module1.java8.Sorting;

public class ChildClass extends Parent2Class{


    public ChildClass(){
        System.out.println("Child Class constructor");
    }
    @Override
    public void sampleMethod(double d){
        System.out.println("Child class double "+d);
    }


    public static void main(String[] args) {

        new ChildClass().sampleMethod(100);



    }
}
