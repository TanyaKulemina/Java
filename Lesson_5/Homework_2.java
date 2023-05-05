/*
Пусть дан список сотрудников. 
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности.
*/

package Lesson_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Homework_2 {
    public static void main(String[] args) {
        String input = "Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова Иван Юрин Петр Лыков Павел Чернов Петр Чернышов Мария Федорова Марина Светлова Мария Савина Мария Рыкова Марина Лугова Анна Владимирова Иван Мечников Петр Петин Иван Ежов";
        String[] employees = input.split(" ");

        Map<String, Integer> countNames = new HashMap<>();
        int a = 0;
        for (int i = 0; i < employees.length; i += 2) {
            if (!countNames.containsKey(employees[i])) {
                countNames.put(employees[i], 1);
            } else {
                a = countNames.get(employees[i]);
                countNames.put(employees[i], a + 1);
            }
        }

        Map<String, Integer> popularNames = new HashMap<>();
        for (Map.Entry<String, Integer> pair : countNames.entrySet()) {
            if (pair.getValue() > 1) {
                popularNames.put(pair.getKey(), pair.getValue());
            }
        }

        // непонятный код из интеренета, который делает тоже самое, что и код ниже
        // popularNames.entrySet().stream().sorted(Map.Entry.<String,
        // Integer>comparingByValue().reversed()).forEach(System.out::println);

        ArrayList<String> names = new ArrayList<>(popularNames.keySet());
        ArrayList<Integer> count = new ArrayList<>(popularNames.values());
        Map<String, Integer> resultNames = new LinkedHashMap<>();

        while (count.size() > 0) {
            int max = Collections.max(count);
            resultNames.put(names.get(count.indexOf(max)), max);
            names.remove(count.indexOf(max));
            count.remove(count.indexOf(max));
        }

        System.out.println(resultNames);
    }
}