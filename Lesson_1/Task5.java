/*
Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
 */

package Lesson_1;
public class Task5 {
    public static void main(String[] args) {
        String phrase = "Добро пожаловать на курс по Java";
        String[] array = phrase.split(" ");
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i] + " ";
    }
        System.out.println(result);
    }
}