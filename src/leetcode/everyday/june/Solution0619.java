package leetcode.everyday.june;

/**
 * 125. 验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * 示例 1:
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 * 输入: "race a car"
 * 输出: false
 */
public class Solution0619 {

    /**
     * 直接按题比较
     *
     * @param s
     * @return
     */
    public boolean isPalindrome0(String s) {
        // char[] chars= s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase().toCharArray();
        // int len = chars.length-1;
        // int num = chars.length/2;
        // int pre = 0;
        // while(num>0){
        //     if(chars[len] != chars[pre]){
        //         return false;
        //     }
        //     len--;
        //     num--;
        //     pre++;
        // }
        // return true;
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char ic = s.charAt(i);
            char jc = s.charAt(j);
            if (ic == jc) {
                i++;
                j--;
            }
            //判断字符串中的的内容是否为数字或者字母
            else if (ic < '0' || (ic > '9' && ic < 'A') || (ic > 'Z' && ic < 'a') || ic > 'z') {
                i++;
            } else if (jc < '0' || (jc > '9' && jc < 'A') || (jc > 'Z' && jc < 'a') || jc > 'z') {
                j--;
                //字母大小写都可以
            } else if (ic > '9' && jc > '9' && Math.abs(ic - jc) == 32) {
                i++;
                j--;
            } else {
                return false;
            }


        }
        return true;
    }

    /**
     * 上面的简写
     * Character.isLetterOrDigit（char c)
     * 字母和数字字符返回true,其他返回false
     */
    public boolean isPalindrome(String s) {
        int n = s.length();
        int left = 0, right = n - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                ++left;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                --right;
            } else if (Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))) {
                ++left;
                --right;
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * 字符翻转
     *
     * @param s
     * @return
     */
    public boolean isPalindrome1(String s) {
        StringBuffer sgood = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sgood.append(Character.toLowerCase(ch));
            }
        }
        StringBuffer sgood_rev = new StringBuffer(sgood).reverse();
        return sgood.toString().equals(sgood_rev.toString());
    }


    public boolean isPalindrome2(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else if (Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome3(String s) {
        StringBuilder washStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)){
                washStr.append(Character.toLowerCase(c));
            }
        }
        //直接reverse会把自己也转,
//        StringBuilder reverse = washStr.reverse();
        StringBuffer reverse = new StringBuffer(washStr).reverse();
        //直接equals相当于reverse==washStr,比较是不是相同的两个对象
        //    public boolean equals(Object obj) {
        //        return (this == obj);
        //    }
//        return reverse.equals(washStr);
        return reverse.toString().equals(washStr.toString());
    }


    /**
     * 学到了的地方:
     * 1.Character.isLetterOrDigit(c)判断是不是字母或者数字
     * 2.reverse.equals(washStr) 相当于reverse==washStr 应该转为String比较(有不同实现
     * 3.回文两种解决,一种双指针,一种反转
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome3("A man, a plan, a canal: Panama"));
    }

}
