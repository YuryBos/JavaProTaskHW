package All_Tasks_up_to_24;

public class _8_FindMissingNumber {
    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{1, 0, 2, 8, 6, 5, 4, 7}));
    }
    //    Дан массив чисел, в котором есть все числа от 0 до N. Все эти числа в единственном экземпляре.
    //    Расположены в разнобой. Одно число в этом массиве пропущено (Например {1 0 2 8 6 5 4 7} - это 3).
    //    Найти пропущенное число
    public static int findMissingNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= i ^ nums[i]; // если в массиве есть все числа от 0 до N, то результат XOR операции будет равен N
        }
        return result ^ nums.length;
    }
}