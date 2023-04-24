/*
 Реализовать алгоритм сортировки слиянием
 */

package Lesson_3;

import java.util.Arrays;

public class Homework_1 {
    public static void main(String[] args) {
        int[] arr = new int[] { 16, 34, 9, 56, 26, 21, 6, 58 };
        int[] res = mergeSort(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int[] arrLeft = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] arrRight = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

        arrLeft = mergeSort(arrLeft);
        arrRight = mergeSort(arrRight);

        return merge(arrLeft, arrRight);
    }

    private static int[] merge(int[] arrLeft, int[] arrRight) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] res = new int[arrLeft.length + arrRight.length];

        while (i < arrLeft.length && j < arrRight.length) {
            if (arrLeft[i] < arrRight[j]) {
                res[k] = arrLeft[i];
                i++;
            } else {
                res[k] = arrRight[j];
                j++;
            }
            k++;
        }

        while (i < arrLeft.length) {
            res[k] = arrLeft[i];
            i++;
            k++;
        }

        while (j < arrRight.length) {
            res[k] = arrRight[j];
            j++;
            k++;
        }

        return res;
    }
}