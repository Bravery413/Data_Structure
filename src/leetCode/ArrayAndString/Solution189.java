package leetCode.ArrayAndString;

/**
 * @author bravery
 * @date 2019/8/30 9:44
 */
public class Solution189 {
    //超时
    public static void rotate0(int[] nums, int k) {
        int temp;
        for (int i = 0; i < k; i++) {
            for (int j = nums.length - 1; j > 0; j--) {
                temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }
        }
    }

    public static void rotate1(int[] nums, int k) {
        int[] res = new int[nums.length];
        k = k % nums.length;
//        for (int i = 0; i < nums.length; i++) {
//            a[(i + k) % nums.length] = nums[i];
//        }
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (i < nums.length - k) {
                res[k + i] = nums[i];
            } else {
                res[j++] = nums[i];
            }
        }
        for (int i = 0, j = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }
    }

    //TODO 有空弄懂,和链表差不多
    //环状旋转,每一个元素直接放到最终位置,需要一个temp保存被覆盖元素
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        rotate(a, 3);

    }
}
