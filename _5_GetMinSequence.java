package All_Tasks_up_to_24;

public class _5_GetMinSequence {
    public static void main(String[] args) {
        int[] nums = {1, 1, 5, 4, 1, 9, 2, 4, 6};
        int n = 11;
        System.out.println(getMinSequence(nums, n));
    }
    // Дан массив, надо:
    // вернуть длину минимальной последовательности чисел, сумма которых равна n
    // в массиве все числа положительные
    // [1, 1, 5, 4, 1, 9, 2, 4, 6] n = 11
    public static int getMinSequence(int[] nums, int n) {
        int sum = 0; // Сумма элементов в последовательности
        int minSec = Integer.MAX_VALUE; // Минимальная длина последовательности
        int counter = 0; // Количество элементов в последовательности
        int startIndex = 0; // Начальный индекс последовательности
        for (int i = 0;i < nums.length; i++) {
            sum += nums[i]; // Считаем сумму элементов в последовательности
            counter++; // Считаем количество элементов в последовательности
            if (sum == n) {
                sum = 0; // Обнуляем сумму элементов в последовательности
                minSec = Math.min(minSec, counter); // Сравниваем длину последовательности с минимальной длиной и записываем минимальное значение
                counter = 0; // Обнуляем количество элементов в последовательности
                startIndex += 1;
                i = startIndex - 1; // Переходим к следующему элементу массива и начинаем считать сумму с него. "-1" потому что в конце цикла for происходит i++
            } else if (sum > n) {
                startIndex += 1;
                sum = 0;
                counter = 0;
                i = startIndex - 1;
            }
        }
        return minSec;
    }
}
