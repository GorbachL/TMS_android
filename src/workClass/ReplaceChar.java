package workClass;

import java.util.Scanner;

public class ReplaceChar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку ");

        if (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            if (!str.isEmpty()) {
                if (str.contains("a")) {
                    System.out.println(str.replace("a", "***"));
                } else {
                    System.out.println("Буква 'a' отсутсвует..");
                }
            } else {
                System.out.println("Ничего не ввели!");
            }
        }

    }
}
