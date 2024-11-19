package org.example.tp.i.solution;

public class Demo {
    public static void main(String[] args) {
        Workable employee = new Employee();
        Eatable eatableEmployee = new Employee();
        Sleepable sleepableEmployee = new Employee();

        employee.work();
        eatableEmployee.eat();
        sleepableEmployee.sleep();

        Workable robot = new Robot();
        robot.work();
    }
}
