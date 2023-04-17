/*
1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */


package Lesson_1;
import java.util.Scanner;
public class Homework_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
		System.out.printf("Введите число n: ");
		int n = iScanner.nextInt();
        int sum = 0;
        int multi = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        for (int i = 1; i <= n; i++) {
            multi = multi * i;
        }
        System.out.println(sum);
        System.out.println(multi);
        iScanner.close();
    }
}

