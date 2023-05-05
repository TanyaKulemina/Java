/*
 На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
 */
package Lesson_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework_4 {

    private static List makeCombinations() {
        List<String> comb = new ArrayList<String>();
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                comb.add(String.format("%d=%d", i, j));
            }
        }
        return comb;
    }

    private static Map<Integer, Integer> findQueens(List<String> combinations) {
        Map<Integer, Integer> result = new HashMap<>();

        while (combinations.size() > 0) {
            int one = 0;
            int eight = combinations.size() - 1;
            int n = one + (int) (Math.random() * eight);
            String combString = combinations.get(n).toString();
            String[] combArr = combString.split("=");
            int a = Integer.parseInt(combArr[0]);
            int b = Integer.parseInt(combArr[1]);
            if (!result.containsKey(a) && !result.containsValue(b)) {
                result.put(a, b);

                // цикл для горизонтали
                for (int j = 0; j <= 8; j++) {
                    if (combinations.contains(String.format("%d=%d", j, b))) {
                        combinations.remove(combinations.indexOf(String.format("%d=%d", j, b)));
                    }
                }

                // цикл для вертикали
                for (int j = 0; j <= 8; j++) {
                    if (combinations.contains(String.format("%d=%d", a, j))) {
                        combinations.remove(combinations.indexOf(String.format("%d=%d", a, j)));
                    }
                }

                // цикл для диагонали вправо-вниз
                for (int j1 = 0; j1 <= Math.min(8 - a, 8 - b); j1++) {
                    if (combinations.contains(String.format("%d=%d", a + j1, b + j1))) {
                        combinations.remove(combinations.indexOf(String.format("%d=%d", a + j1, b + j1)));
                    }
                }
                // цикл для диагонали вправо-вверх
                for (int j2 = 0; j2 <= Math.min(8 - a, b); j2++) {
                    if (combinations.contains(String.format("%d=%d", a + j2, b - j2))) {
                        combinations.remove(combinations.indexOf(String.format("%d=%d", a + j2, b - j2)));
                    }
                }
                // цикл для диагонали влево-вниз
                for (int j3 = 0; j3 <= Math.min(a, 8 - b); j3++) {
                    if (combinations.contains(String.format("%d=%d", a - j3, b + j3))) {
                        combinations.remove(combinations.indexOf(String.format("%d=%d", a - j3, b + j3)));
                    }
                }
                // цикл для диагонали влево-вверх
                for (int j4 = 0; j4 <= Math.min(a, b); j4++) {
                    if (combinations.contains(String.format("%d=%d", a - j4, b - j4))) {
                        combinations.remove(combinations.indexOf(String.format("%d=%d", a - j4, b - j4)));
                    }
                }
            }
        }
        return result;
    }

    private static Map<Integer, Integer> find8Queens() {
        Map<Integer, Integer> res = new HashMap<>();

        while (res.size() != 8) {
            List comb = makeCombinations();
            res = findQueens(comb);
        }
        return res;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> result = find8Queens();
        System.out.println(result);
        for (int i = 1; i <= 8; i++) {
            ArrayList<Integer> table = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0));
            table.add(result.get(i) - 1, 1);
            System.out.println(table.toString().replace(",", "").replace("[", "").replace("]", ""));
        }
    }
}
