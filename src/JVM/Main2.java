package JVM;

import java.util.*;

/**
 * @author: Bravery
 * @create: 2019-09-16 21:35
 **/


public class Main2 {
    public static int seq(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }else if (length==2){
            return 2;
        }
        HashMap<String, String> map = new HashMap<>();
        Set<String> strings = map.keySet();
        Set<Map.Entry<String, String>> e = map.entrySet();

        Arrays.sort(nums);
        int diffMax = nums[length - 1] - nums[0];
        int[][] dp = new int[length][diffMax + 1];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < diffMax; j++) {
                dp[i][j]=1;
            }
        }
        int longestLength=1;
        for (int i = 1; i < length; i++) {
            for (int j = i-1; j >=0; j--) {
                int temp=nums[i]-nums[j];
                dp[i][temp]=dp[j][temp]+1;
                longestLength=Math.max(longestLength,dp[i][temp]);
            }
        }
        return longestLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array=new int[num];
        for (int i=0;i<num;i++){
            int nextInt = scanner.nextInt();
            array[i]=nextInt;
        }
        int res=seq(array);
        System.out.println(res);
    }
}
