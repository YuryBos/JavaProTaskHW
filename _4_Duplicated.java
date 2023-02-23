package All_Tasks_up_to_24;

import java.util.Arrays;

public class _4_Duplicated {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {1, 10, 5, 4, 11, 9, 2, 14, 6, 21, 54, 44, 8, 19, 3, 12, 16};
        System.out.println(isDuplicated(arr));
        System.out.println(isDuplicated(arr2));
    }
    // проверить есть ли в массиве повторяющиеся числа
    public static boolean isDuplicated(int[] arr2) {
        Arrays.sort(arr2); // Сортируем массив

        for (int i = 0; i < arr2.length - 1; i++) { // Проверяем каждый элемент массива на совпадение со следующим
            if (arr2[i] == arr2[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
