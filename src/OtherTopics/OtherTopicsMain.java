package OtherTopics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OtherTopicsMain {

    public static void main(String[] args) {
        //exception - an event that occurs during the execution of a program and interrupts the normal flow of instructions
        Scanner scanner = new Scanner(System.in);
        int numerator, denominator;
        int divisionResult;

        while (true) {
            //try division and catch possible errors
            try {
                System.out.print("Enter a whole number to divide: ");
                numerator = scanner.nextInt();

                System.out.print("Enter a whole number to divide by: ");
                denominator = scanner.nextInt();

                divisionResult = numerator / denominator;
                System.out.println("Division result is " + divisionResult);

                break;
            }
            catch (InputMismatchException e){
                System.out.println("Input is not correct");
            }
            catch (ArithmeticException e) {
                System.out.println("You can't divide by 0");
            }
            finally {
                scanner.nextLine(); //in case input is not correct
            }
        }
    }
}

