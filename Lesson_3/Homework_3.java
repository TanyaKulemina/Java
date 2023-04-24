/*
 Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
 */

package Lesson_3;

import java.util.ArrayList;
import java.util.Random;

public class Homework_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(i, rd.nextInt(-30, 30));
        }
        System.out.println(list);

        int max = list.get(0);
        int min = list.get(0);
        double sum = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
            if (list.get(i) < min) {
                min = list.get(i);
            }
            sum = sum + list.get(i);
        }
        double average = sum / list.size();

        System.out.println(max);
        System.out.println(min);
        System.out.println(average);
    }
}
