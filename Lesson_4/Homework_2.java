/*
 Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя.
 */

package Lesson_4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Homework_2 {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(arr);

        // enqueue()
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите элемент, который необходимо добавить в конец очереди: ");
        arr.add(scan.nextInt());
        System.out.println(arr);
        scan.close();

        // dequeue()
        System.out.printf("Удаляем первый элемент из очереди: %d \n", arr.removeFirst());
        System.out.println(arr);

        // first()
        System.out.printf("Первый элемент из очереди: %d \n", arr.get(0));
    }
}