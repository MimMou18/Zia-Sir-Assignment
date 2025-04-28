import java.util.Scanner;

public class CalculatorProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        System.out.print("Select operation (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result = 0;
        boolean valid = true;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                    valid = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operation!");
                valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }
    }
}
