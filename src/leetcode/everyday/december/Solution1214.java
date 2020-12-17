package leetcode.everyday.december;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author 潘勇
 * @date 2020/12/14 8:36
 */

/**
 * 49. 字母异位词分组
 */
public class Solution1214 {


    /**
     * 每个排序/用map[26]再变成String 作为key
     * 放到map中，调用map.getOrDefault(key,new ArrayList<>());
     * 放到一个key的数组中去
     * 重点是找到方法找到共同的特点的key
     *
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagrams0(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "123");
        String value = map.getOrDefault(1, "23");
        System.out.println(value);
    }

}
