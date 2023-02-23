package All_Tasks_up_to_24;

import java.util.Arrays;
public class _3_Get2Numbers {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 4, 8, 9, 3, 2, 6};
        int num = 13;
        getTwoNumbers(arr1, num);
    }
    // Дан массив и число n, надо:
    // вывести два числа, сумма которых равна n
    // если таких чисел нет, то вывести сообщение, что таких чисел нет
    // [1, 5, 4, 8, 9, 3, 2, 6] n = 13
    // *вывести все пары чисел, сумма которых равна n
    public static void getTwoNumbers(int[] arr1, int num) {
        Arrays.sort(arr1); // Сортируем массив

        int print = 0; // Счетчик для вывода сообщения, что таких чисел нет
        int left = 0;
        int right = arr1.length - 1; // Устанавливаем левую и правую границы массива

        while (left < right) { // Пока левая граница не совпадет с правой
            int sum = arr1[left] + arr1[right]; // Сумма чисел на левой и правой границе массива
            if (sum == num) { // Если сумма равна n, то выводим пару чисел
                System.out.println("Pair found: " + arr1[left] + ", " + arr1[right]);
                left++; // Сдвигаем левую границу вправо
                print++; // Счетчик увеличивается на 1
            } else if (sum < num) { // Если сумма меньше n, то сдвигаем левую границу вправо
                left++;
            } else { // Если сумма больше n, то сдвигаем правую границу влево
                right--;
            }
        }
        if (print == 0) {
            System.out.println("No pair found"); // Если счетчик не изменился, то выводим сообщение, что таких чисел нет
        }
    }
}
