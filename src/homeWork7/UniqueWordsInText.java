package homeWork7;

import java.util.*;

public class UniqueWordsInText {

    /* Для заданного текста (как ArrayList) `text`
    построить множество встречающихся в нем слов
    (множество - это набор уникальных элементов)
     */

    public static void main(String[] args) {

        String text = "Шла Саша по шоссе Саша несла сушку на шесте и сушку";

        System.out.println(text); // Шла Саша по шоссе Саша несла сушку на шесте и сушку

        List<String> list1 = new ArrayList<>(Arrays.asList(text.split(" ")));
        Set<String> list2 = new LinkedHashSet<>(list1);

        System.out.println(list1); // [Шла, Саша, по, шоссе, Саша, несла, сушку, на, шесте, и, сушку]
        System.out.println(list2); // [Шла, Саша, по, шоссе, несла, сушку, на, шесте, и]

    }

}
