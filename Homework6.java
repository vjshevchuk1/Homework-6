/**
 * AIT-TR, cohort 42.1, Java Basic, Home work   #6
 *
 * @autor Vitalij Shevchuk
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Task 1
        System.out.println("Task 1: Enter a number (1, 2, or 3): ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Invalid input");
        }
        
        // Task 2
        System.out.println("\nTask 2: Enter a number from 1 to 7: ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid input");
        }
        
        // Task 3
        System.out.println("\nTask 3:");
        int i = 1;
        while (i <= 10) {
            System.out.println("Task " + i);
            i++;
        }
        
        // Task 4
        System.out.println("\nTask 4:");
        int num = 1;
        do {
            if (num % 5 == 0) {
                System.out.println(num);
            }
            num++;
        } while (num <= 100);
        
        // Task 5
        System.out.println("\nTask 5: Enter the word \"hello\": ");
        String input;
        int attempts = 0;
        do {
            input = scanner.nextLine();
            attempts++;
        } while (!input.equalsIgnoreCase("hello"));
        System.out.println("Thank you for the correct input!");
        System.out.println("Number of attempts: " + attempts);
        
        // Task 6
        System.out.println("\nTask 6:");
        String expression = "34 + 8"; // Your expression
        String[] elements = expression.split(" ");
        int firstNumber = Integer.parseInt(elements[0]);
        char operator = elements[1].charAt(0);
        int secondNumber = Integer.parseInt(elements[2]);

        int result = 0;
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Invalid operator");
        }
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}
