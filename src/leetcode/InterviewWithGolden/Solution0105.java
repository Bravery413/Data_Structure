package leetcode.InterviewWithGolden;

/**
 * 字符串有三种编辑操作:插入一个字符、删除一个字符或者替换一个字符。
 * 给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。
 */
public class Solution0105 {
    public static boolean oneEditAway1(String first, String second) {
        int count = 0;
        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        } else if (Math.abs(first.length() - second.length()) == 1) {
            String shorter = first.length() < second.length() ? first : second;
            String longer = first.length() > second.length() ? first : second;
            int shortPoint = 0;
            int longPoint = 0;
            while (shortPoint < shorter.length() && longPoint < longer.length()) {
                if (shorter.charAt(shortPoint) != longer.charAt(longPoint)) {
                    count++;
                } else {
                    shortPoint++;
                }
                longPoint++;
            }
        } else {
            for (int i = 0; i < first.length(); i++) {
                char c = second.charAt(i);
                if (first.charAt(i) != c) {
                    count++;
                }

            }
        }
        return count > 1 ? false : true;
    }

    /**
     * 优化写法;双指针,把情况统一
     *
     * @param first
     * @param second
     * @return
     */
    public static boolean oneEditAway2(String first, String second) {
        int sub = first.length() - second.length();
        if (sub >= 2 || sub <= -2) {
            return false;
        }
        int flag = 1;
        for (int i = 0, j = 0; i < first.length() && j < second.length(); i++, j++) {
            if (first.charAt(i) != second.charAt(j)) {
                if (sub == 1) { //说明first长
                    j--; //相当于first正常加1，second原地一下
                } else if (sub == -1) {
                    i--;
                }
                flag--;
                if (flag == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean oneEditAway(String first, String second) {
        int sub = first.length() - second.length();
        if (sub > 1 || sub < -1) return false;
        int flag = 1;
        for (int i = 0, j = 0; i < first.length() && j < second.length(); i++, j++) {
            if (first.charAt(i) != second.charAt(j)) {
                if (sub == 1) {//first长
                    j--;//first会加1,但是second会原地
                } else if (sub==-1){
                    i--;
                }
                flag--;
            }
        }
        return flag < 0 ? false : true;
    }


    /**
     * 递归写法
     *
     * @param first
     * @param second
     * @return
     */
    public static boolean oneEditAway3(String first, String second) {
        if (first == null || second == null) return false;
        int len1 = first.length();
        int len2 = second.length();
        if (Math.abs(len1 - len2) > 1) return false;
        if (len2 > len1) return oneEditAway3(second, first);

        // 保持第一个比第二个长
        for (int i = 0; i < len2; i++) {
            if (first.charAt(i) != second.charAt(i)) {
                // 如果是长度相同字符串，那就比较下一个，如果长度不一样，那就从该字符开始进行比较。
                return first.substring(i + 1).equals(second.substring(len1 == len2 ? i + 1 : i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(oneEditAway("teacher", "teach"));
    }
}
