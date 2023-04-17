/*
 Вывести все простые числа от 1 до 1000
 */

package Lesson_1;

public class Homework_2 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            boolean flag = true;
            int j = 2;
            while (flag && j*j <= i) {
                if (i % j == 0) {
                    flag = false;
                }
                j++;
            }
            if (flag) {
                System.out.printf("%d ", i);
            }
        }
    }
}
