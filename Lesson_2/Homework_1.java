package Lesson_2;
// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. 
// Значения null не включаются в запрос.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) throws FileNotFoundException {

        File students = new File("Lesson_2/students.txt");
        FileReader reader = new FileReader("Lesson_2/students.txt");
        String file = students.getName();
        Scanner scan = new Scanner(reader);
        String input = scan.nextLine();
        scan.close();
        input = input.substring(1, input.length() - 2);
        input = input.replace(":", ",").replaceAll("[\" ]", "");

        String[] parts = input.split(",");
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("SELECT * FROM %s WHERE ", file.replaceAll("\\.\\w+$", "")));
        for (int i = 0; i < parts.length; i+=2) {
            if(!parts[i+1].equals("null")){
                if (i<parts.length-2) {
                    sb.append(String.format("%s = %s AND ", parts[i], parts[i+1]));
                }
                else {sb.append(String.format("%s = %s;", parts[i], parts[i+1]));     
            }
        } 
        }
        System.out.println(sb);

    }
}


