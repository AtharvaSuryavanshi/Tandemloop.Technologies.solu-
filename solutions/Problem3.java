import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number (a): ");
        int a = scanner.nextInt();

        // Determine how many odd numbers to print
        int count = (a % 2 == 0) ? a - 1 : a;

        // Print the series
        System.out.print("Output: ");
        for (int i = 0; i < count; i++) {
            int odd = 2 * i + 1;
            System.out.print(odd);
            if (i != count - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
