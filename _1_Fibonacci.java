package All_Tasks_up_to_24;

import java.util.Arrays;

public class _1_Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci numbers: ");
        arrayFibonacci(15); // число элементов в массиве
    }

    // заполнить массив числами фибоначчи
        public static void arrayFibonacci(int n) {

        int[] fibArr = new int[n]; // создаем массив
        fibArr[0] = 0; // первый элемент массива
        fibArr[1] = 1; // второй элемент массива
        for (int i = 2; i < n; i++) {
            fibArr[i] = fibArr[i - 1] + fibArr[i - 2]; // каждый следующий элемент массива равен сумме двух предыдущих
        }
        System.out.println(Arrays.toString(fibArr)); // выводим массив
    }
}
