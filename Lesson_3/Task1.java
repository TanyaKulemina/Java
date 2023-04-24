/*
 Заполнить список десятью случайными числами. 
Отсортировать список методом sort() и вывести его на экран.
 */

package Lesson_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        Random rd = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(i, rd.nextInt(1, 100));
        }
        System.out.println(list);

        list.sort(null);
        System.out.println(list);
    }
}
