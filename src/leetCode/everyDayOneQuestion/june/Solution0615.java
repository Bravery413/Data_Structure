package leetCode.everyDayOneQuestion.june;

/**
 * @author 潘勇
 * @date 2020/6/15 14:02
 */

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 */
public class Solution0615 {

    /**
     * 两两配对,找最长公共前缀
     *
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0 || strs[0].length() == 0) {
            return "";
        }
        String sameIndex = strs[0];
        for (int i = 1; i < strs.length; i++) {
            sameIndex = getSameIndex(sameIndex, strs[i]);
            if ("".equals(sameIndex)) {
                return "";
            }
        }
        return sameIndex;
    }

    private static String getSameIndex(String s1, String s2) {
        int len = s1.length() < s2.length() ? s1.length() : s2.length();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return res.toString();
            }
            res.append(s1.charAt(i));
        }
        return res.toString();
    }

    /**
     * 调用找子串的方法 str1.indexOf(str);
     * flower.indexOf(fl)->0
     * flower.indexOf(ow)->2*
     *
     * @param strs
     * @return
     */
    public static String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String headStr = strs[0];
        for (int i = 1; i < strs.length; i++) {
            //一直找str[i]是不是headStr的子串
            while (strs[i].indexOf(headStr) != 0) {
                //如果不是,削末尾,直到变空或者是子串
                headStr = headStr.substring(0, headStr.length() - 1);
                if (headStr.length() == 0) {
                    return "";
                }
            }
        }
        return headStr;
    }

    public static void main(String[] args) {
        String[] qus = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix1(qus));
//        String s1 = "flower";
//        String s2 = "flight";
//        System.out.println(s1.indexOf(s1));

    }
}
