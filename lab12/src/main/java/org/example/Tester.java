package org.example;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public Tester() {
        this("No name", "No surname", 0, "No level", 0.0);
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "No level", 0.0);
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public void work(int hours) {
        System.out.println(name + " is working for " + hours + " hours.");
    }

    public void work(String task) {
        System.out.println(name + " is working on the task: " + task);
    }

    public static void tester() {
        System.out.println("Hello, Tester!");
    }
}