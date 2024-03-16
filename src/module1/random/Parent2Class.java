package module1.random;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Parent2Class{
    public Parent2Class(){
        //new ChildClass();
        System.out.println("Parent Class constructor");
    }


    public void sampleMethod(double d){
        System.out.println("Parent class double "+d);
    }
    public void sampleMethod(int a){
        System.out.println("Parent class int ");
    }

}
