package leetCode.ArrayAndString;

/**
 * @author bravery
 * @date 2019/8/30 7:41
 */
public class Solution344 {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while (left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
        }
    }
}
