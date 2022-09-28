package HomeWork3;

import java.text.DecimalFormat;
import java.util.*;

public class Task4 {

    /*
    1. есть сервис, который дает информацию о погоде на каждый день месяца.
    Нужно найти среднюю температуру за месяц.
    Входные данные:  программа должна работать с массивами размерностей 28 - 31
     */

    private final static Random RND = new Random();
    private final static DecimalFormat FORMAT = new DecimalFormat("#0.0");
    private final static int MIN_TEMP = 0;
    private final static int MAX_TEMP = 35;

    private static int[] generateTemperature(int days) {
        return RND.ints(days, MIN_TEMP, MAX_TEMP).toArray();
    }

    private static String getAverageTempAndDaysTemp(int[] temperatureData) {
        double avg = Arrays.stream(temperatureData).average().orElse(0);
        return String.join(" ",
                "Average temperature: ", FORMAT.format(avg), "\n",
                "Monthly temperature by day: ", Arrays.toString(temperatureData));
    }

    public static void Weather() {

        System.out.println("Таск 4");

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of days in a month");
            int a = scanner.nextInt();
            System.out.println(getAverageTempAndDaysTemp(generateTemperature(a)));
        } catch (InputMismatchException e) {
            System.out.println("Invalid value..");
        }
    }
}
