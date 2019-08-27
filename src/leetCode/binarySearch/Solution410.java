package leetCode.binarySearch;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bravery
 * @date 2019/8/27 8:15
 */
public class Solution410 {
    //方法一：排除法（双指针）
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> res = new ArrayList<>();
        int len=arr.length;
        int removeNum=len-k;
        int left=0;
        int right=len-1;
        while (removeNum>0){
            if (x-arr[left] <= arr[right]-x) {
                right--;
            }else {
                left++;
            }
            removeNum--;
        }
        for (int i=left;i<left+k;i++){
            res.add(arr[i]);
        }
        return res;
    }

}
