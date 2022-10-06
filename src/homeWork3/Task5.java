package homeWork3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {

    /*
    2. есть форум, у которого есть комментарии с оценками.
    Нам нужно заменить наихудшую оценку на среднее арифметическое всех других оценок,
    если разница минимальной оценки и второй по минимальности 3 и более.
    (Оценки могут быть от 0 до 10)
    Входные данные: массив, до 100 элементов
     */

    private final static Random RND = new Random();
    private final static int MIN_RATING = 0;
    private final static int MAX_RATING = 10;

    private static int[] generateRating(int rating) {
        return RND.ints(rating, MIN_RATING, MAX_RATING).toArray();
    }

    private static void ReplaceMinElementToAverageInArray() {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of ratings on the site");
            int a = scanner.nextInt();

            int[] mass = generateRating(a);
            System.out.println("1. Generate Rating Array: " + Arrays.toString(mass));

            int min = mass[0];
            for (int j : mass) {
                if (j < min)
                    min = j;
            }
            System.out.println("2. Min Rating: " + min);

            int avg = (int) Arrays.stream(mass).average().orElse(0);
            for (int i = 0; i < mass.length; i++) {
                if (mass[i] == min)
                    mass[i] = avg;
            }
            System.out.println("3. Average Rating: " + avg);
            System.out.println("4. New Array with New Ratings: " + Arrays.toString(mass));

        } catch (Exception e) {
            System.out.println("Invalid value..");
        }
    }

    public static void RatingChange() {

        System.out.println("Таск 5");

        ReplaceMinElementToAverageInArray();
    }
}
