/*Реализовать консольное приложение, которое в цикле:
Принимает от пользователя строку вида 
text~num
Нужно разделить строку по ~, сохранить text в связный список на позицию num.
Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */

package Lesson_4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> inputList = new LinkedList<>();

        while (true) {
            System.out.println("Введите text~num");
            String input = scan.nextLine();
            if (input.equals("exit")) {
                System.out.println(inputList);
                break;
            }

            String[] arr = input.split("~");
            int num = Integer.parseInt(arr[1]);
            if (num > inputList.size()) {
                System.out.printf("Введите число, не превышающее %d \n", inputList.size());
                continue;
            }

            if (arr[0].equals("print")) {
                System.out.println(inputList.remove(num));

            } else {
                inputList.add(num, arr[0]);
            }

            System.out.println(inputList);
        }
        scan.close();
    }

}
