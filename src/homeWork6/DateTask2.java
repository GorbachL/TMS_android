package homeWork6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class DateTask2 {

    /*
     * Дата представлена строкой вида "15.07.2016".
     * Перевести её в строковый формат вида "15 июля 2016".
     * При неверном формате входной строки вернуть пустую строку
     *
     * Обратите внимание: некорректная с точки зрения календаря дата (например, 30 февраля 2009) считается неверными
     * входными данными.
     */

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter day");
            int day = scanner.nextInt();
            System.out.println("Enter month");
            int month = scanner.nextInt();
            System.out.println("Enter year");
            int year = scanner.nextInt();

            String oldDateString = day + "." + month + "." + year; // 12.01.2022
            System.out.println(oldDateString);

            SimpleDateFormat oldDateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
            SimpleDateFormat newDateFormat = new SimpleDateFormat("dd MMMM yyyy", Locale.getDefault());

            Date date;
            date = oldDateFormat.parse(oldDateString);

            String result = newDateFormat.format(date); // 12 January 2022

            System.out.println(result);

        } catch (InputMismatchException e) {
            System.out.println("Invalid value..");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
