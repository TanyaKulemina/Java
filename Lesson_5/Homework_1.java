/*
 Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */

package Lesson_5;

import java.util.*;

public class Homework_1 {
    static Map<String, List<Integer>> phonebook = new HashMap<>();

    private static void addPhonebook(String s, Integer i) {
        List<Integer> tempArr = phonebook.get(s);
        if (tempArr == null)
            tempArr = new ArrayList<>();
        tempArr.add(i);
        phonebook.put(s, tempArr);
    }

    public static void main(String[] args) {
        addPhonebook("Иванов", 123);
        addPhonebook("Иванов", 789);
        addPhonebook("Петров", 456);
        addPhonebook("Смирнов", 234);
        addPhonebook("Сидоров", 917);

        System.out.println(phonebook);
    }
}
