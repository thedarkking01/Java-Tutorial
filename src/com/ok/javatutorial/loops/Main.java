package com.ok.javatutorial.loops;

public class Main {
    public static void main(String[] args) {
         // Manually test logic with a specific 'n'

    }

    // Question 1: Labeled Breaks
    public static void q1() {
        outer: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) break outer;
                System.out.print(i + "," + j + " ");
            }
        }
    }

    // Question 2: Infinite Loop Detection
    public static void q2() {
        int i = 0;
        while (i < 10) {
            i--;
            System.out.println("i: " + i);
        }
    }

    // Question 3: Enhanced For-Loop Behavior
    public static void q3() {
        int[] nums = {1, 2, 3, 4, 5};
        for (int num : nums) {
            num *= 2;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    // Question 4: Nested Loop Efficiency (Time Complexity)
    public static void q4() {
        int n = 5; // You can change this to test
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }

    // Question 5: Do-While vs While
    public static void q5() {
        int i = 10;
        do {
            System.out.println(i);
        } while (i < 5);
    }

    // Question 6: Continue with Labels
    public static void q6() {
        outer: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) continue outer;
                System.out.print(i + "" + j + " ");
            }
        }
    }
}
