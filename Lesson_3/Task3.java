/*
 Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа. 
Пройти по списку, найти и удалить целые числа.
 */
package Lesson_3;
import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList<String>();
        list1.add("Hello");
        list1.add(1);
        list1.add("Good");
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        for (int i = list1.size()-1; i >= 0; i--) {
            if(list1.get(i) instanceof Integer){
                list1.remove(i);
            }
        }
        System.out.println(list1);
    }
}
