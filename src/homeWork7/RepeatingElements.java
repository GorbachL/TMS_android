package homeWork7;

import java.util.*;
import java.util.stream.Collectors;

public class RepeatingElements {

    /*
    Найти в заданном списке (ArrayList) повторяющиеся элементы и вернуть ассоциативный массив
    с информацией о числе повторений для каждого повторяющегося элемента.
    Если элемент встречается только один раз, включать его в результат
    не следует.
     */

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("test", "test", "test", "test", "not a test", "not a test", "test", "value"));

        System.out.println(list); // [test, test, test, test, not a test, not a test, test, value]

        Set<String> list2 = list.stream()
                //group in map (element -> number of occurrences
                .collect(Collectors.groupingBy(e -> e))
                //iterate the pairs in map
                .entrySet()
                .stream()
                //select elements that occur more than once
                .filter(e -> e.getValue().size() > 1)
                //get keys
                .map(Map.Entry::getKey)
                //collect in a list
                .collect(Collectors.toSet());

        System.out.println(list2); // [test, not a test]

        HashMap<String, Integer> occurrence = new HashMap<>();

        for (String i : list) {
            Integer j = occurrence.get(i);
            occurrence.put(i, (j == null) ? 1 : j + 1);
        }
        System.out.println(occurrence); //{test=5, not a test=2, value=1}
    }

}
