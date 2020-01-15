package offer;

/**
 * 输出n个数(范围1~n-1)的数组第一个重复的数字
 */
public class Question11 {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public static boolean duplicate(int numbers[], int length, int[] duplication) {
        if (length == 0) {
            duplication[0] = -1;
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {
            while (i != numbers[i]) {
                int n = numbers[i];
                if (n == numbers[n]) {
                    duplication[0] = n;
                    System.out.println(duplication[0]);
                    return true;
                } else {
                    numbers[i] = numbers[n];
                    numbers[n] = n;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 0, 2, 5, 3};
        boolean duplicate = duplicate(array, 7, array);
        System.out.println(duplicate);

    }
}
