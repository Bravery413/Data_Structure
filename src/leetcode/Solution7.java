package leetcode;

class Solution7 {
    public static int reverse(int x) {
        int result=0;
        while (x!=0){
            if (result > Integer.MAX_VALUE / 10) {
                result = 0;
                return result;
            } else if (result < Integer.MIN_VALUE / 10) {
                result = 0;
                return result;
            }
            result*=10;

            result=result+x%10;
            x/=10;
        }
        return result;
    }

    public static void main(String[] args) {
        int reverse = reverse(1463847412);
        System.out.println(reverse);
    }
}