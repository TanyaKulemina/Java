// Функция сортировки слиянием

// Оформим приведенный код как рекурсивную функцию, которая станет разделять массивы до тех пор, пока это возможно, с параметрами, соответствующими целому массиву при первом вызове, его половинам при втором и третьем вызовах и т. д.
package Lesson_3;

import java.util.Arrays;

public class hhh {
    public static void main(String[] args) {
        int[] arr = new int[] { 16, 34, 9, 56, 26, 11, 4, 89 };
        SortUnsorted(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void SortUnsorted(int[] a, int lo, int hi) {

        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        SortUnsorted(a, lo, mid);
        SortUnsorted(a, mid + 1, hi);

        int[] buf = Arrays.copyOf(a, a.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }
}

// Здесь:

// a – массив;
// lo – позиция первого элемента в массиве (для первой итерации = 0);
// hi – позиция последнего элемента в массиве (для первой итерации = a.length —
// 1).
