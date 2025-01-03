import java.util.Scanner;

public class PerfectNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number to check if it is a perfect number: ");
        int number = scanner.nextInt();

        // Initialize a variable to store the sum of divisors
        int sum = 0;

        // Find all proper divisors and calculate their sum
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of divisors equals the number
        if (sum == number && number != 0) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        // Close the scanner
        scanner.close();
    }
}
