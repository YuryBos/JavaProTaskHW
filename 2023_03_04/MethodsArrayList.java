package All_Tasks_up_to_24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MethodsArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        fillListRandom(list);
        printEvenNumbers(list);
        printOddNumbers(list);

        System.out.println("Random string: " + generateRandomString());
        
        String a = "f"; // Символ который нужно найти
        System.out.println("Char you want: " + printsCharYouWant(generateRandomString(), a));
    }

    //    1 уровень сложности:
//    Написать класс, который содержит ArrayList и методы:
//    заполняют лист рандомными цифрами
    public static void fillListRandom(ArrayList<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }
        System.out.println(list);
    }

    //    перебирают Итератором и выводят на экран все четные
    public static void printEvenNumbers(ArrayList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        System.out.print("Even numbers: ");
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                System.out.print(next + " ");
            }
        }
        System.out.println();
    }

    //    перебирают итератором и выводят на экран все нечетные
    public static void printOddNumbers(ArrayList<Integer> list) {
        Iterator<Integer> iterator1 = list.iterator();
        System.out.print("Odd numbers: ");
        while (iterator1.hasNext()) {
            Integer next = iterator1.next();
            if (next % 2 != 0) {
                System.out.print(next + " ");
            }
        }
        System.out.println();
    }

    //    генерируют рандомную стрингу длиной 5
    public static String generateRandomString() {
        String s = "";
        for (int i = 0; i < 5; i++) {
            int x = ((int) (Math.random() * 26) + 97);
            // Math.random() - возвращает число от 0 до 1
            // (int) (Math.random() * 26) - возвращает число от 0 до 25
            // 97 - это код символа 'a' в таблице ASCII 26 - это количество букв в англ алфавите
            s += (char) x; // преобразование int в char
        }
        return s;
    }

    //    перебираю итератором эту стрингу с конца и выводит
//    тот символ который нужен если он есть, если нет то выдает сообщение
    public static String printsCharYouWant(String s, String a) {

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) { // Добавляем в лист символы строки
            list.add(String.valueOf(s.charAt(i)));
        }
        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) { // Перебираем лист с конца
            String previous = iterator.previous();
            if (previous.equals(a)) { // Сравниваем символы методом equals (не ==) т.к. это строки а не примитивы (char) если сравнивать == то будет сравниваться ссылка на объект
                return previous;
            }
        }
        return "There is no such character in the string";
    }
}
