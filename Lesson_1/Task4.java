package Lesson_1;
/*
 Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
 */

public class Task4 {
    public static void main(String[] args) {
        String Str1 = "Добрый вечер";
        String Str2 = "Доброе утро";

        int minLenght = Math.min(Str1.length(), Str2.length());
        for (int i = 0; i < minLenght; i++) {
            if (Str1.charAt(i) == Str2.charAt(i)) {
                System.out.print(Str1.charAt(i));
            }
        }
    }
}
