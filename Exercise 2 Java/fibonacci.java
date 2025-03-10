import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();

        int num1 = 0, num2 = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= terms; i++) {
            System.out.print(num1 + " ");
            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }

        scanner.close();
    }
}

