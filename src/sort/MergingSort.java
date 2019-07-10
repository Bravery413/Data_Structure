package sort;

import java.util.Arrays;

/**
 * 归并排序,没懂
 */
public class MergingSort {
    public static int MAXSIZE = 20;

    public static void mergeSort(int[] nums) {
        MSort(nums, nums, 1, nums.length);
    }

    public static void MSort(int[] sr, int[] tr1, int s, int t) {
        int m;
        int[] tr2 = new int[MAXSIZE + 1];
        if (s == t) {
            tr1[s] = sr[s];
        } else {
            m = (s + t) / 2;
            MSort(sr, tr2, s, m);
            MSort(sr, tr2, m + 1, t);
            Merge(tr2, tr1, s, m, t);

        }
    }

    public static void Merge(int[] sr, int[] tr, int i, int m, int n) {
        int j, k, l;
        for (j=m+1,k=i;i<=m&&j<=n;k++){
            if (sr[i]<sr[j]){
                tr[k]=sr[i++];
            }else {
                tr[k]=sr[j++];
            }
            if (i<=m){
                for (l=0;l<=m-i;l++){
                    tr[k+l]=sr[i+l];
                }
            }
            if (j<=n){
                for (l=0;l<=n-j;l++){
                    tr[k+l]=sr[j+l];
                }
            }
        }


    }

    public static void main(String[] args) {
        int[] nums = new int[]{50, 10, 90, 30, 70, 40, 80, 60, 20};
        mergeSort(nums);
        String result = Arrays.toString(nums);
        System.out.println(result);
    }


}
