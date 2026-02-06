package conditionalStatements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char op = sc.next().charAt(0);
        int b = sc.nextInt();

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                if (b != 0)
                    System.out.println(a / b);
                else
                    System.out.println("Division by zero not allowed");
                break;

            case '%':
                if (b != 0)
                    System.out.println(a % b);
                else
                    System.out.println("Modulo by zero not allowed");
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}
