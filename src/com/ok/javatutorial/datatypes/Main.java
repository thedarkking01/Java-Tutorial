package com.ok.javatutorial.datatypes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 🔹 Primitive Data Types
        byte age = 25;
        short year = 2025;
        int population = 1000000;
        long distanceToMoon = 384400000L;

        float pi = 3.14f;
        double gravity = 9.80665;

        char grade = 'A';
        boolean isJavaFun = true;

        // 🔸 Non-Primitive Data Types
        String message = "Hello, Java!";
        int[] scores = {85, 90, 95};

        // 🖨️ Print all values
        System.out.println("Byte (age): " + age);
        System.out.println("Short (year): " + year);
        System.out.println("Int (population): " + population);
        System.out.println("Long (distance to moon): " + distanceToMoon + " meters");

        System.out.println("Float (pi): " + pi);
        System.out.println("Double (gravity): " + gravity);

        System.out.println("Char (grade): " + grade);
        System.out.println("Boolean (is Java fun?): " + isJavaFun);

        System.out.println("String message: " + message);

    }
}