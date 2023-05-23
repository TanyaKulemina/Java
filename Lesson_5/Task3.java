/*
Написать метод, который переводит число из римского формата записи в арабский. 
Например, MMXXII = 2022
 */

package Lesson_5;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        String s = "MMXXII";
        Map<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);

        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char cc = s.charAt(i);
            char nc = s.charAt(i + 1);
            if (map.get(cc) < map.get(nc)) {
                res -= map.get(cc);
            } else {
                res += map.get(cc);
            }
        }
        res += map.get(s.charAt(s.length() - 1));

        System.out.println(res);
    }
}