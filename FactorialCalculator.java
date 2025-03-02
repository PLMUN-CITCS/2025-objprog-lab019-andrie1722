import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        int number = getNonNegativeInteger();
        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a non-negative integer: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a non-negative integer.");
                scanner.next();
            }
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Invalid input. Please enter a non-negative integer.");
            }
        } while (number < 0);
        scanner.close();
        return number;
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}