/*
Пусть дан произвольный список целых чисел, удалить из него чётные числа
*/ 
package Lesson_3;
import java.util.ArrayList;
import java.util.Random;

public class Homework_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(i, rd.nextInt(1, 100));
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i = i - 1;
            }
        }
        System.out.println(list);
    }
}
