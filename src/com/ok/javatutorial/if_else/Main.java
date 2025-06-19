package com.ok.javatutorial.if_else;

public class Main {
    public static void main(String[] args) {
        // Question 1
        int a = 10, b = 20;
        if (a++ > 10 && ++b > 20)
            System.out.println("Q1: True");
        else
            System.out.println("Q1: False");
        System.out.println("Q1: a = " + a + ", b = " + b);

        // Question 2
        int x = 5;
        if (x < 10)
            if (x > 2)
                System.out.println("Q2: x is between 3 and 9");
            else
                System.out.println("Q2: x is 2 or less");
        else
            System.out.println("Q2: x is 10 or more");

        // Question 3
        int y = 7;
        String result = (y % 2 == 0) ? (y > 5 ? "Even and >5" : "Even and <=5") : (y > 5 ? "Odd and >5" : "Odd and <=5");
        System.out.println("Q3: " + result);

        // Question 4
        int num = 4;
        if (!(num > 3 && num < 10)) {
            System.out.println("Q4: Outside range");
        } else {
            System.out.println("Q4: Inside range");
        }

        // Question 5
        int p = 3, q = 3;
        if ((p++ == 3 || --q == 2) && q++ == 3)
            System.out.println("Q5: Match");
        else
            System.out.println("Q5: No match");
        System.out.println("Q5: p = " + p + ", q = " + q);

        // Question 6
        int n = 8;
        if (n % 2 == 0)
            if (n % 4 == 0)
                System.out.println("Q6: Divisible by 4");
            else
                System.out.println("Q6: Even but not divisible by 4");
        else
            System.out.println("Q6: Odd");

        // Question 7
        int age = 20;
        String eligibility = (age >= 18) ? "Eligible" : "Not eligible";
        System.out.println("Q7: " + eligibility);

        // Question 8
        int temp = 25;
        if (temp > 30)
            System.out.println("Q8: Hot");
        else if (temp > 20)
            System.out.println("Q8: Warm");
        else
            System.out.println("Q8: Cold");

        // Question 9
        int val = 5;
        if (val != 5)
            System.out.println("Q9: Not 5");
        else if (val == 5)
            System.out.println("Q9: It is 5");
        else
            System.out.println("Q9: Default");

        // Question 10
        int score = 85;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : "C";
        System.out.println("Q10: Grade = " + grade);
    }
}
