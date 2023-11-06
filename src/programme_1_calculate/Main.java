package programme_1_calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator obj = new Calculator();

        Scanner sc = new Scanner(System.in);
        char doMoreCalculation;

        do {
            System.out.println(" Enter first number : ");
            int num1 = sc.nextInt();

            System.out.println("Enter second number : ");
            int num2 = sc.nextInt();

            System.out.println(" Please enter one of symbol + , - , * , / : ");
            char symbol1 = sc.next().charAt(0);

            obj.calculateResult(num1, num2, symbol1);

            System.out.print("Would you like to do more calculations? Please enter 'Y' or 'N': ");
            doMoreCalculation = sc.next().charAt(0);

        } while (doMoreCalculation == 'Y' || doMoreCalculation == 'y');

        System.out.println("Program terminated.");
        sc.close();


    }
}


