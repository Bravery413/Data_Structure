package leetCode.everyDayOneQuestion.june;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 给你一个整数数组 arr 和一个目标值 target ，请你返回一个整数 value ，使得将数组中所有大于 value 的值变成 value 后，数组的和最接近  target （最接近表示两者之差的绝对值最小）。
 * 如果有多种使得和最接近 target 的方案，请你返回这些整数中的最小值。
 * 请注意，答案不一定是 arr 中的数字。
 * 示例 1：
 * 输入：arr = [4,9,3], target = 10
 * 输出：3
 * 解释：当选择 value 为 3 时，数组会变成 [3, 3, 3]，和为 9 ，这是最接近 target 的方案。
 */
public class Solution0614 {


    /**
     * 解法:
     * 1排序
     * 2.找剩下最接近的平均数((target-sum)/rest),如果平均数<=当前数,那么剩下的都设置为这个平均数
     * 3.如果全部加起来都小于target,直接返回最大的arr[len-1];
     * 4.之前是<=target的情况,需要考虑大于的情况,让res+1,比较得出答案
     * @param arr
     * @param target
     * @return
     */
    public int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);
        int len = arr.length;
        int res = -1;
        int rest = len;
        int sum = 0;
        for (int i = 0; i < len; i++, rest--) {
            int r = (target - sum) / rest;
            if (r <= arr[i]) {
                res = r;
                break;
            }
            sum += arr[i];
        }
        //如果全部取最大都小于target,res取最大
        if (res == -1) {
            return arr[len - 1];
        }
        int dis = target - sum - res * rest;
        //上面情况考虑小于target的最接近,下面让平均数+1,试试会不会更接近
        return Math.abs(target - sum - (res + 1) * rest) < dis ? dis + 1 : dis;
    }




    /**
     * 时间最优解法
     *
     * @param arr
     * @param target
     * @return
     */
    public int findBestValue1(int[] arr, int target) {
        int result = -1;
        //原数组的总和
        int sum = 0;
        //原数组的最大整数
        int maxInt = -1;
        int len = arr.length;
        //计算平均值
        float temp = (float) target / len;
        int avg = Math.round(temp);

        for (int i = 0; i < len; i++) {
            sum += arr[i];
            if (arr[i] > maxInt) {
                maxInt = arr[i];
            }
        }
        if (sum - target == 0) {
            result = maxInt;
        } else {
            result = getResult(arr, 0, avg, target);
        }
        return result;
    }

    public int getResult(int[] arr, int lastSum, int avg, int target) {
        int sum = 0;
        for (int i = 0, ii = arr.length; i < ii; i++) {
            if (arr[i] < avg) {
                sum += arr[i];
            } else {
                sum += avg;
            }
        }
        //当前计算的平均值
        int intValue = Math.abs(sum - target);
        //上一次计算的平均值
        int lastIntValue = Math.abs(lastSum - target);
        if (lastIntValue > intValue) {
            avg++;
            avg = getResult(arr, sum, avg, target);
        } else {
            if (lastSum != 0) {
                avg--;
            }
        }
        return avg;
    }


}
