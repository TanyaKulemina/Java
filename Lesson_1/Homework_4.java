/*
 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. 
 Некоторые цифры могут быть заменены знаком вопроса, например 1? + ?5 = 69. 
 Требуется восстановить выражение до верного равенства. 
 Предложить хотя бы одно решение или сообщить, что его нет.
 */

package Lesson_1;

public class Homework_4 {
    public static void main(String[] args) {
        boolean flag = false;
        for (int a = 1; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 1; c < 10; c++) {
                    for (int d = 0; d < 10; d++) {
                        for (int e = 1; e < 10; e++) {
                            for (int f = 0; f < 10; f++) {                                                     
                                if (((a * 10) + b) + ((c * 10) + d) == (e * 10) + f && a == 1 && b == b && c == c && d == 5 && e == 6 && f == 9) {
                                    while (flag == false) {
                                        System.out.printf("%d%d + %d%d = %d%d\n", a, b, c, d, e, f);
                                        flag = true;
                                    }       
                                }
                            }
                        }
                    }
                }   
            }         
        }
        if (flag == false) {
            System.out.print("Таких значений нет");
        }
    }
}

 