/*
Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.
Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.
 */
package Lesson_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class Task5 {

    private static void sortTreeMap(TreeMap<String, Integer> tM) {
        if (tM.size() == 0) {

        } else {
            ArrayList<String> rem = new ArrayList<>();
            for (String key : tM.keySet()) {
                int min = Collections.min(tM.values());
                if (tM.get(key) == min) {
                    System.out.println(key);
                    rem.add(key);
                }
            }
            for (int i = 0; i < rem.size(); i++) {
                tM.remove(rem.get(i));
            }
            sortTreeMap(tM);
        }
    }

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>(
                Arrays.asList("Мороз и солнце день чудесный", "Пора кресавица проснись.",
                        "Еще ты дремлешь друг прелестный", "Пора красавица проснись."));
        TreeMap<String, Integer> tMap = new TreeMap<>();
        for (int i = 0; i < arr.size(); i++) {
            tMap.put(arr.get(i), arr.get(i).length());
        }
        sortTreeMap(tMap);
    }
}
