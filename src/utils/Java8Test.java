package utils;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author 潘勇
 * @date 2020/12/21 16:43
 */


public class Java8Test {


    /**
     * filter
     *
     * @param args
     */
    public static void main(String[] args) {
        List<String> l = Arrays.asList("abc", "weae", "", "eafafaf", "dffaa", "ioh", "");
        System.out.println(l);
        //filter
        List<String> l2 = l.stream().filter(string -> "abc".equals(string)).collect(Collectors.toList());
        System.out.println("filter: " + l2);
        //forEach
        l.stream().forEach(str -> System.out.println("forEach: " + str));
//        l.stream().forEach(System.out::println);

        //map & distinct
        List<Integer> l3 = Arrays.asList(1, 2, 3, 5, 6, 8, 8, 14, 45, 56);
        List<Integer> l4 = l3.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        l4.stream().forEach(System.out::println);
        //limit
        List<Integer> l6 = l3.stream().limit(3).collect(Collectors.toList());
        l6.stream().forEach(System.out::println);

        //sorted
        new Random().ints().limit(100).sorted().forEach(System.out::println);

        //Collectors.joining()
        String collect = l.stream().collect(Collectors.joining(","));
        System.out.println(collect);


        //统计  max,min,sum,avg
        IntSummaryStatistics l3s = l3.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println(l3s.getMax());
        System.out.println(l3s.getAverage());


    }


}
