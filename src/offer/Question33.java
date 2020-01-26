package offer;

/**
 * 二叉搜索树的后序遍历序列
 */
public class Question33 {
    public static boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return VerifySquenceOfBST(sequence, 0, sequence.length - 1);


    }

    public static boolean VerifySquenceOfBST(int[] sequence, int start, int end) {

        if (end <= start) {
            return true;
        }
        int root = sequence[end];
        int i = start;
        while (sequence[i] < root) {
            i++;
        }
        int j = end;
        while (j >= i) {
            if (sequence[j] < root) {
                return false;
            }
            j--;
        }

        return VerifySquenceOfBST(sequence, start, i-1) && VerifySquenceOfBST(sequence, j+1, end - 1);
    }

    public static void main(String[] args) {
        int[] array = {5, 4,3,2,1};
        System.out.println(VerifySquenceOfBST(array));
    }

}
