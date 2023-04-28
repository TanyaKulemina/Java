/*
Напишите постфиксный калькулятор. Пользователь вводит данные и операции в обратной польской записи. 
Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.
Например:
5 4 3 - + => 5 1 + => 6
1 2 + 3 * => 3 3 * => 9
1 2 3 * + => 1 6 + => 7
*/

package Lesson_4;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Stack;

public class Homework_3 {

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static String format(float value) {
        return NumberFormat.getInstance().format(value);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите данные в формате обратной польской записи: ");
        String input = scan.nextLine();
        scan.close();
        String[] arr = input.split(" ");

        Stack<Float> stack = new Stack<>();
        float res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isDigit(arr[i])) {
                stack.push(Float.parseFloat((arr[i])));
            } else {
                switch (arr[i]) {
                    case "+":
                        res = stack.pop() + stack.pop();
                        stack.push(res);
                        break;

                    case "-":
                        res = -stack.pop() + stack.pop();
                        stack.push(res);
                        break;

                    case "*":
                        res = stack.pop() * stack.pop();
                        stack.push(res);
                        break;

                    case "/":
                        // int temp = stack.pop();
                        res = 1 / stack.pop() * stack.pop();
                        stack.push(res);
                        break;
                }
            }
        }
        if (stack.size() > 1) {
            System.out.println("Неправильная запись");
        } else {
            System.out.println(format(stack.pop()));
        }
    }
}
