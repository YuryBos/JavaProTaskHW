package All_Tasks_up_to_24;

import java.util.Scanner;

public class _6_GetNewString {
    public static void main(String[] args) {
        System.out.println(getNewString());
    }
    //AAASSDDFFRRTGGBNHYUUU -> 3A2S2D2F2R1T2G1B1N1H1Y3U
    //**ДОБАВИТЬ ПРОВЕРКУ
    public static String getNewString() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();

        String result = "";
        int count = 1;
        if (str.matches("[a-zA-Zа-яА-Я]+")) { //проверка на буквы в строке
            for (int i = 0; i < str.length() - 1; i++) { //проходим по всей строке
                if (str.charAt(i) == str.charAt(i + 1)) { // сравниваем текущий символ со следующим
                    count++; // если символы равны, то увеличиваем счетчик
                } else if (count > 1) { // если символы не равны, то проверяем счетчик
                    System.out.print(count + "" + str.charAt(i)); // если счетчик больше 1, то выводим его и текущий символ
                    count = 1; // обнуляем счетчик
                } else { // если счетчик равен 1, то выводим текущий символ
                    System.out.print("1" + str.charAt(i));
                }
                if (i == str.length() - 2) { // если символ последний, то выводим его и счетчик
                    System.out.print(count + "" + str.charAt(i + 1));
                }
            }
        } else {
            result = "В строке есть не только буквы";// если в строке есть не только буквы - выводим сообщение
        }
        return result;
    }
}
