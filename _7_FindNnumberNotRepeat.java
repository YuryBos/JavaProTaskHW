package All_Tasks_up_to_24;

public class _7_FindNnumberNotRepeat {
    public static void main(String[] args) {
        System.out.println(findNonRepeatedNumber(new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
   }
    //    1. Дан массив чисел в котором все числа имеют повторения, кроме одного числа. Найти это число
    public static int findNonRepeatedNumber(int[] nums) {
        int result = 0; // 0 ^ 0 = 0, 0 ^ 1 = 1, 1 ^ 1 = 0 и т.д. - это свойство XOR операции (побитовое исключающее ИЛИ)
        for (int num : nums) {
            result ^= num; // XOR операция - если два числа одинаковые, то результат будет 0
        }
        return result;
    }
}
