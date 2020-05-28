package leetCode.InterviewWithGolden;

/**
 * 三步问题。有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶或3阶。
 * 实现一种方法，计算小孩有多少种上楼梯的方式。结果可能很大，你需要对结果模1000000007。
 *
 */
public class Solution0801 {
    /**
     * 和两个的差不多 结果是最近三次之和,注意数字太大溢出问题
     * @param n
     * @return
     */
    public static int waysToStep1(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        long a=1;
        long b=2;
        long c=4;
        long sum=0;
        while (n > 3) {
            sum=a+b+c;
            a=b;
            b=c;
            c=sum;
            n--;
        }
        long res=sum%1000000007;
        return (int)res;
    }


    final static int mod = 1000000007;
    public static int waysToStep(int n) {
        //f = [1, 2, 4]
        long[] f = new long[]{1, 2, 4};

        if(n <= 3){
            return (int)f[n-1];
        }

        long[][] A = {{0, 0, 1}, {1, 0, 1}, {0, 1, 1}};
        long[][] B = matPow(A, n-3);

        long res = 0;
        for(int i=0; i<3; i++){
            res = (res + f[i] * B[i][2])%mod;
        }

        return (int)res;
    }

    /**
     * 高级解法看不懂,有空了解
     * @param A
     * @param n
     * @return
     */
    private static long[][] matPow(long[][] A, int n){
        // m = A.shape[0]
        int m = A.length;

        //B = np.eye(m, dtype=np.int64)
        long[][] B = new long[m][m];
        for (int i = 0; i < B.length; i++) {
            B[i][i] = 1;
        }

        while(n>0){
            if((n&1) != 0){
                B = matMul(B, A);
            }
            A = matMul(A, A);
            n >>=1;
        }
        return B;
    }

    private static long[][] matMul(long[][] mat1, long[][] mat2) {
        int row1 = mat1.length;
        int row2 = mat2.length, column2 = mat2[0].length;

        long[][] resultMatrix = new long[row1][column2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                for (int k = 0; k < row2; k++) {
                    resultMatrix[i][j] = (resultMatrix[i][j] + mat1[i][k] * mat2[k][j])%mod;
                }
            }
        }
        return resultMatrix;
    }

    public static void main(String[] args) {
        System.out.println(waysToStep(5));
    }
}
