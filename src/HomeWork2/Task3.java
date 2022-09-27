package HomeWork2;

import java.util.Scanner;

public class Task3 {

    /*
        Пользователь задает целое число, больше или равно 100 (например, 3801).
        Определить третью цифру справа в этом числе (в данном случае 8)
    */
    public static void determineThirdDigitFromRight() {

        System.out.println("Task 3");

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number greater than or equal to 100");
            int b = scanner.nextInt();

            String s = "" + b;
            System.out.println("The number of characters in this digit is - " + s.length() +
                    "\n" + "You entered: " + b + "\n" +
                    "The third digit from the right is - " + s.charAt(s.length() - 3));
        } catch (Exception e) {
            System.out.println("Invalid value..");
        }
    }
}
