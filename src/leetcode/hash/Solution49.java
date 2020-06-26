package leetcode.hash;

import java.util.*;

/**
 * @author bravery
 * @date 2019/8/23 10:23
 */
//TODO 一道很好的题目,有多种解法
public class Solution49 {
    /**
     * 思路(1):
     * 我们将每个字符串按照字母顺序排序，
     * 这样的话就可以把 eat，tea，ate 都映射到 aet。其他的类似。
     * map存储 key是排好序的 value是一个组
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str:strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            //字符拍好序的作为键
            String key = String.valueOf(chars);
            //包含则加入这组里
            if (map.containsKey(key)){
                map.get(key).add(str);
                //不包含,则新建分组
            }else {
                List<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(key,temp);
            }
        }
        return new ArrayList<List<String>>(map.values());
    }


}
