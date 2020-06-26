package leetcode.hash;

import java.util.HashSet;

/**
 * @author bravery
 * @date 2019/8/23 11:25
 */
public class Solution771 {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet<>();
        for (int i=0;i<J.length();i++){
            char c=J.charAt(i);
            set.add(c);
        }
        int res=0;
        for (int i=0;i<S.length();i++){
            char c=S.charAt(i);
            if (set.contains(c)){
                res++;
            }
        }
        return res;
    }

}
