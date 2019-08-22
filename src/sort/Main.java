package sort;

import java.util.*;

/**
 * @author: Bravery
 * @create: 2019-08-22 16:31
 **/


public class Main {
    /**
     * 实现一个邻接表,作为优先规则表
     *  HashMap<Character,LinkedList<Character>> aaa=new HashMap<>();
     * 键部分存储字符,然后比它优先级小的字符放入链表中
     * 最后遍历出现的字符,用优先规则加入到一个数组中得到答案
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
//        String str = "wrt wrf er ett rftt";
        String[] words = str.split(" ");
        HashSet<Character> charSet = new HashSet<>();
        ArrayList<LinkedList<Character>> compare = new ArrayList<>();

        HashMap<Character,LinkedList<Character>> aaa=new HashMap<>();


//        HashSet<LinkedList<Character>> a;
//        for (LinkedList<Character> link:a){
//
//        }
        //按已有顺序保存一个答案数组
        ArrayList<Character> result = new ArrayList<>();
        //遍历字符串数组得到单个单词
        for (String word : words) {
            //遍历单词得到字母
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                //判断是否遍历过,如果有就跳过,没有就插入到顺序中,保存已
                if (!charSet.contains(c)) {


                    charSet.add(c);
                }
            }
        }

    }

}
