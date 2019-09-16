package Test;

/**
 * @author: Bravery
 * @create: 2019-09-14 18:41
 **/


public class Test {
    public static void main(String[] args) {
        int[] q={1,3,6,14,6,3,8,4,1};
        System.out.println(max(q,0,q.length-1));
    }
    private static int max(int[] sums,int start,int end){
        if (start==end){
            return sums[start];
        }else {
            int mid=(start+end)/2;
            int left_max=max(sums,0,mid);
            int right_max=max(sums,mid+1,end);
            return left_max>right_max?left_max:right_max;
        }
    }
}
