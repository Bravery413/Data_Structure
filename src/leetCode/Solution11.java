package leetCode;

/**
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 */
public class Solution11 {
    //暴力 不解释
    public static int maxArea(int[] height) {
        int length=0;
        int max=0;
        int temp=0;
        for (int i=0;i<height.length;i++){
            for (int j=1;j<height.length;j++){
                length=j-i;
                int min = Math.min(height[i], height[j]);
                temp=length*Math.min(height[i],height[j]);
                max=max>temp?max:temp;
            }
        }
        return max;
    }
    //双指针法
    public int maxArea0(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }

    public static void main(String[] args) {
        int[] height=new int[]{8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
