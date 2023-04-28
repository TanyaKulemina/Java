/*
 Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список
 */

package Lesson_4;

import java.util.Arrays;
import java.util.LinkedList;

public class Homework_1 {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(arr);

        LinkedList<Integer> res = new LinkedList<>();
        for (int i = arr.size() - 1; i >= 0; i--) {
            res.add(arr.get(i));
        }
        System.out.println(res);

    }
}
