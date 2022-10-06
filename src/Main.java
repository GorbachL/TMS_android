import homeWork2.Task1;
import homeWork2.Task2;
import homeWork2.Task3;
import homeWork3.Task4;
import homeWork3.Task5;

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
                case 4:
                    Task4.Weather();
                    break;
                case 5:
                    Task5.RatingChange();
                    break;
                default:
                    System.out.println("Not ready yet..");
            }
        } catch (Exception e) {
            System.out.println("Invalid value..");
        }
    }
}