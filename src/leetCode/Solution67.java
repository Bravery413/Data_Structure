package leetCode;

public class Solution67 {
    /**
     * 通过二进制转为10进制求和再转为二进制
     *
     * @param a
     * @param b
     * @return
     */
    public static String addBinary0(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }

    public static String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int add = 0;//进位标识符
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int now = add;//进位赋值上去
            now += (i >= 0 ? a.charAt(i) - '0' : 0);//不够位了就直接补0,否则把那位+给now
            now += (j >= 0 ? b.charAt(j) - '0' : 0);//同上
            res.append(now % 2);//把当前位的值确认了
            add = now / 2;//看当前有没进位 有进位就赋予add   当now=3,2 add=1 ;当 now=1,0 add=0
        }
        res.append(add==1?add:"");//最前1位进位
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1110", "1111"));
    }
}
//        StringBuilder ans = new StringBuilder();
//        int add = 0;
//        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
//            int sum = add;
//            sum += (i >= 0 ? a.charAt(i) - '0' : 0);
//            sum += (j >= 0 ? b.charAt(j) - '0' : 0);
//            ans.append(sum % 2);
//            add = sum / 2;
//        }
//        ans.append(add == 1 ? add : "");
//        return ans.reverse().toString();