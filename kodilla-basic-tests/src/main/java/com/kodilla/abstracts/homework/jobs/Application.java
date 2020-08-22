package com.kodilla.abstracts.homework.jobs;

public class Application {
    public static void main(String[] args) {

        Accountant anna = new Person("Anna", 25, "Accountant");
        ((Person) anna).printResponsibilities();
    }
}
