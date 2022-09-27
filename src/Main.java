import HomeWork2.Task1;
import HomeWork2.Task2;
import HomeWork2.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Task number");

        try {
            int task = scanner.nextInt();
            switch (task) {
                case 1:
                    Task1.validateEvenNumber();
                    break;
                case 2:
                    Task2.validateDurationOfTimeInSec();
                    break;
                case 3:
                    Task3.determineThirdDigitFromRight();
                    break;
                default:
                    System.out.println("Not ready yet..");
            }
        } catch (Exception e) {
            System.out.println("Invalid value..");
        }
    }
}