package org.example.tp.i.solution;

public class Employee implements Eatable, Workable, Sleepable{

    @Override
    public void eat() {
        System.out.println("Employee is working");
    }

    @Override
    public void sleep() {
        System.out.println("Employee is working");
    }

    @Override
    public void work() {
        System.out.println("Employee is working");
    }
}
