package com.oop.tutorial4;

public class Tests {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

    public static void test1() {
        VendingMachine machine = new VendingMachine(50);
        VendingMachine machine1 = new VendingMachine();
        System.out.println("Token count = " + machine.getTokenCount() + " Can count = " + machine.getCanCount());
        System.out.println("Token count = " + machine1.getTokenCount() + " Can count = " + machine1.getCanCount());
    }

    public static void test2() {
        Employee employee = new Employee();
        Employee employee1 = new Employee("Bhavan", 50000);
        System.out.println("Name = " + employee.getName() + " Salary " + employee.getSalary());
        System.out.println("Name = " + employee1.getName() + " Salary " + employee1.getSalary());
    }

    public static void test3() {
        VotingMachine votingMachine = new VotingMachine();
        votingMachine.setVotesOfLabour(10);
        votingMachine.setVotesOfConservative(10);
        System.out.printf("Labour: %d, Conservative: %d", votingMachine.getVotesOfLabour(), votingMachine.getVotesOfConservative());
    }

    public static void test4() {
        Car car = new Car("1010", 100);
        System.out.println(car);
        Car car1 = new Car("1010", 50, 100);
        System.out.println(car);
    }

}
