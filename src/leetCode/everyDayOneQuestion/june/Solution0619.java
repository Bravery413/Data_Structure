package leetCode.everyDayOneQuestion.june;

public class Solution0619 {

    /**
     * 直接按题比较
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
        int i=0;
        int j=s.length()-1;
        while(i<j) {
            char ic=s.charAt(i);
            char jc=s.charAt(j);
            if(ic==jc) {
                i++;
                j--;
            }
            //判断字符串中的的内容是否为数字或者字母
            else if(ic < '0' || (ic > '9' &&  ic < 'A') || (ic > 'Z' && ic < 'a') || ic > 'z') {
                i++;
            }else if(jc < '0' || (jc > '9' &&  jc < 'A') || (jc > 'Z' && jc < 'a') || jc  > 'z') {
                j--;
                //字母大小写都可以
            }else if(ic > '9' && jc > '9' && Math.abs(ic - jc) == 32) {
                i++;
                j--;
            }else {
                return false;
            }


        }
        return true;
    }

    /**
     * 直接比较,没太看懂
     */
    public boolean isPalindrome(String s) {
        int n = s.length();
        int left = 0, right = n - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                ++left;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                --right;
            }
            if (left < right) {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                ++left;
                --right;
            }
        }
        return true;
    }
    /**
     * 字符翻转
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

}
