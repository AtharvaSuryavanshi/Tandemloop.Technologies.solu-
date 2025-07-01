import java.util.Scanner;

class Calculator {
    int a, b;
    String operation;

    public Calculator(int a, int b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    public void calculate() {
        switch (operation) {
            case "add":
            case "+":
                System.out.println("Result: " + (a + b));
                break;
            case "subtract":
            case "-":
                System.out.println("Result: " + (a - b));
                break;
            case "multiply":
            case "*":
                System.out.println("Result: " + (a * b));
                break;
            case "divide":
            case "/":
                if (b != 0) {
                    System.out.println("Result: " + (a / b)); 
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operation type.");
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        sc.nextLine(); 
        System.out.print("Enter operation (add, subtract, multiply, divide or +, -, *, /): ");
        String operation = sc.nextLine();

        Calculator calc = new Calculator(a, b, operation);
        calc.calculate();

        sc.close();
    }
}
