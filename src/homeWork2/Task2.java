package homeWork2;

import java.time.Duration;
import java.time.LocalTime;

public class Task2 {

    /*
        Пользователь задает время в часах, минутах и секундах, например, 8:20:35.
        Рассчитать время в секундах, прошедшее с начала суток (30035 в данном случае).
    */
    public static void validateDurationOfTimeInSec() {

        System.out.println("Task 2");

        LocalTime startTime = LocalTime.of(0, 0, 0);
        LocalTime currentTime = LocalTime.now();
        Duration duration1 = Duration.between(startTime, currentTime);

        System.out.println("From time: " + startTime);
        System.out.println("To current time: " + currentTime);
        System.out.println(duration1.getSeconds() + " seconds passed");
    }
}
