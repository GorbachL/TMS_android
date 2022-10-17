package homeWork6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class DateTask1 {

    /*
     * Дата представлена строкой вида "15 июля 2016".
     * Перевести её в цифровой формат "15.07.2016".
     * День и месяц всегда представлять двумя цифрами, например: 03.04.2011.
     * При неверном формате входной строки вернуть пустую строку.
     *
     * Обратите внимание: некорректная с точки зрения календаря дата (например, 30.02.2009) считается неверными
     * входными данными.
     */


    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter day");
            int day = scanner.nextInt();
            System.out.println("Enter month");
            String month = scanner.next();
            System.out.println("Enter year");
            int year = scanner.nextInt();

            String oldDateString = day + " " + month + " " + year; // 12 january 2022
            System.out.println(oldDateString);

            SimpleDateFormat oldDateFormat = new SimpleDateFormat("dd MMMM yyyy", Locale.getDefault());
            SimpleDateFormat newDateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());

            Date date;
            date = oldDateFormat.parse(oldDateString);

            String result = newDateFormat.format(date); // 12.01.2022

            System.out.println(result);

        } catch (InputMismatchException e) {
            System.out.println("Invalid value..");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
