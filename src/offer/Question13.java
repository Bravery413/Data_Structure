package offer;

import java.util.ArrayList;

/**
 * 和为S的连续正数序列(有序)
 */
public class Question13 {

    //双指针 ,左右往里收,直到中间
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int left = 1;
        int right = 1;
        while (left <= sum / 2) {
            int count = count(left, right);
            if (count == sum) {
                ArrayList<Integer> res = createArrayList(left, right);
                result.add(res);
                //相等后是right先走还是left先走呢
                right++;
            } else if (count < sum) {
                right++;
            } else {
                left++;
            }
        }

        return result;
    }

    private static Integer count(int left, int right) {
        Integer count = 0;
        for (int i = left; i <= right; i++) {
            count += i;
        }
        return count;
    }

    private static ArrayList<Integer> createArrayList(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(FindContinuousSequence(9));

    }
}
