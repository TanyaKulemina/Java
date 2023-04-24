package Lesson_2;

/* Задача 4.
 * Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
 * который запишет эту строку в простой текстовый файл, обработайте исключения.
 */

 import java.io.FileWriter;
 import java.io.IOException;
 
 public class Task4 {
     public static void main(String[] args) {
         String text = "TEXT";
         int repeat = 100;
         String result = strRepeat(text, repeat);
         System.out.println(result);
         writeToFile(result);
     }
 
     private static String strRepeat(String word, int count) {
         return word.repeat(count);
     }
 
     private static void writeToFile(String text) {
         try (FileWriter writer = new FileWriter("text.txt")) { // autoclosable
             writer.append(text);
         } catch (IOException ex) {
             System.out.println("Ошибка записи в файл.");
         }
     }
 }