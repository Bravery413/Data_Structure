package leetcode.hash;

import java.util.HashMap;

/**
 * @author bravery
 * @date 2019/8/23 11:32
 */
public class Solution3 {
    /**
     *思路:
     * map保存<字符,下标>,res保存总最大长度  temp保存当前长度
     * 遍历字符串
     * 如果没有重复,添进去                           //试试不用(temp++,如果大于res  res=temp)
     * 如果重复了,找出当前下标index然后temp=i-index,更新当前元素c下标为i
     * 如果大于res res=temp
     */

    //需要滑动窗口
    //也就是说，如果 s[j]s[j] 在 [i, j)[i,j) 范围内有与 j'j
    //′
    //  重复的字符，我们不需要逐渐增加 ii 。 我们可以直接跳过 [i，j'][i，j
    //′
    // ] 范围内的所有元素，并将 ii 变为 j' + 1j
    //′
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res=0;
        for (int i=0,temp=0;i<s.length();i++){
            char c=s.charAt(i);
            if (map.containsKey(c)){
                temp=Math.max(map.get(c),temp);
            }
            res=Math.max(res,i-temp+1);
            map.put(c,i+1);
        }
        return res;
    }

    public static void main(String[] args) {
        int dvdf = lengthOfLongestSubstring("abba");
        System.out.println(dvdf);
    }
}
