package utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 潘勇
 * @date 2020/12/21 16:43
 */


public class Java8Test {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("abc", "weae", "","eafafaf", "dffaa", "ioh","");
        System.out.println(l);
        List<String> l2 = l.stream().filter(string -> "abc".equals(string)).collect(Collectors.toList());
        System.out.println(l2);
    }


}
