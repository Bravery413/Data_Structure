package newCoder;

import java.util.Scanner;
import java.util.UUID;
import java.util.Vector;

/**
 * @author: Bravery
 * @create: 2019-09-18 21:02
 **/


public class Main {
    public static int maxSubArray(int[] nums) {
        int res=nums[0];
        int sum=0;
        for (int n:nums){
            sum += n;
            if (sum>res){
                res=sum;
            }else if(sum<0) {
                sum=n;
            }
            res=Math.max(res,sum);
        }

        return res;
    }
    public static void main(String[] args) {
//       int[] array={-8,-2,-3};
//        System.out.println(maxSubArray(array));
//        try {
//            int i=5/0;
//        }catch (Exception e){
//            System.out.println("找到异常了!");
//        }
        UUID uuid = UUID.randomUUID();
        new Vector<String>();
        System.out.println(uuid);
        System.out.println("继续执行下去了");
    }
}


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int res = 0;
//        for (int i = 0; i < num; i++) {
//            int temp = scanner.nextInt();
//            res ^= temp;
//        }
//        System.out.println(res);
//
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String next = scanner.next();
//        String[] strs = next.split(";");
//        String str1 = strs[0];
//        String str2 = strs[1];
//        char[] cs1 = str1.toCharArray();
//        char[] cs2 = str1.toCharArray();
//        if (cs1.length != cs2.length) {
//            System.out.println("False");
//        }
//        HashMap<Character, Character> map = new HashMap<>();
//        for (int i = 0; i < cs1.length; i++) {
//            if (!map.containsKey(cs1[i])) {
//                map.put(cs2[i], cs1[i]);
//            }
//        }
//        for (int i = 0; i < cs2.length; i++) {
//            if (!map.containsKey(cs1[i])) {
//                System.out.println("False");
//                break;
//            }else {
//                map.get(cs2[i])!=
//            }
//        }
//    }

//    sum += n;
//            if (sum>res){
//            res=sum;
//            }else if(sum<0) {
//        sum=0;
//        }
//        res=Math.max(res,sum);