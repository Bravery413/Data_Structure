package leetcode;

/**
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 */
public class Solution11 {
    //暴力 不解释
    public static int maxArea0(int[] height) {
        int length = 0;
        int max = 0;
        int temp = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 1; j < height.length; j++) {
                length = j - i;
                int min = Math.min(height[i], height[j]);
                temp = length * Math.min(height[i], height[j]);
                max = max > temp ? max : temp;
            }
        }
        return max;
    }

    //双指针法
    public static int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=-1;
        while (left<right){
            int len=right-left;
            //短板往前走
            if (height[left]>height[right]){
                max=Math.max(max,len*Math.min(height[left],height[right]));
                right--;
            }else {
                max=Math.max(max,len*Math.min(height[left],height[right]));
                left++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = new int[]{8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
}
