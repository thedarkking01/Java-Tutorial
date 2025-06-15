package operations;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Two integers
        System.out.print("Enter first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = scanner.nextInt();

        // Arithmetic Operators
        System.out.println("\n--- Arithmetic Operations ---");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (b != 0 ? (a / b) : "Division by zero"));
        System.out.println("a % b = " + (b != 0 ? (a % b) : "Modulo by zero"));

        // Bitwise Operators
        System.out.println("\n--- Bitwise Operations ---");
        System.out.println("a & b = " + (a & b));     // AND
        System.out.println("a | b = " + (a | b));     // OR
        System.out.println("a ^ b = " + (a ^ b));     // XOR
        System.out.println("a << 1 = " + (a << 1));   // Left shift by 1
        System.out.println("b >> 1 = " + (b >> 1));   // Right shift by 1

        scanner.close();
    }
}
