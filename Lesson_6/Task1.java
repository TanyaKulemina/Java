import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// 1. Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24. 
// 2. Создайте метод, в который передайте заполненный выше массив, и с помощью Set вычислите процент уникальных значений в данном массиве, и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

public class Task1 {
    public static void main(String[] args) {
        int[] myArray = fillArray();
        System.out.println(Arrays.toString(myArray));
        System.out.println("процент уникальных чисел: " + countUnique(myArray));
    }

    public static int[] fillArray() {
        Random random = new Random();
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 25);
        }
        return array;
    }

    public static double countUnique(int[] array) {
        Set<Integer> hashSet = new HashSet<Integer>();
        for (int number : array) {
            hashSet.add(number);
        }
        return hashSet.size() / array.length * 100.0;
    }
}