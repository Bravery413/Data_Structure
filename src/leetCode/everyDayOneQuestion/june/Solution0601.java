package leetCode.everyDayOneQuestion.june;

import java.util.ArrayList;
import java.util.List;

public class Solution0601 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        ArrayList<Boolean> res = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (candies[i] + extraCandies >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] qus=new int[]{2,3,5,1,3};
        System.out.println(kidsWithCandies(qus,3));
    }
}
