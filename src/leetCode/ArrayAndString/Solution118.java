package leetCode.ArrayAndString;

import java.util.List;

/**
 * @author bravery
 * @date 2019/8/28 8:44
 */
public class Solution118 {
    //TODO 写到这里
    public static List<List<Integer>> generate(int numRows) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
        return null;
    }

    public static void main(String[] args) {
        List<List<Integer>> generate = generate(1);
    }
}
