package HomeWork2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Таск 1");

        /*
        Определить, четное ли данное число
         */

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number");
            int a = scanner.nextInt();

            String result = a % 2 == 0
                    ? "Even: " + a
                    : "Odd: " + a;

            System.out.println(result);

        } catch (InputMismatchException e) {
            System.out.println("Invalid value..");
        }
    }
}
