package jdk8.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Java 8 API添加了一个新的抽象称为流Stream，可以让你以一种声明的方式处理数据。
 *
 * Stream 使用一种类似用 SQL 语句从数据库查询数据的直观方式来提供一种对 Java 集合运算和表达的高阶抽象。
 *
 * Stream API可以极大提高Java程序员的生产力，让程序员写出高效率、干净、简洁的代码。
 *
 * 这种风格将要处理的元素集合看作一种流， 流在管道中传输， 并且可以在管道的节点上进行处理， 比如筛选， 排序，聚合等。
 *
 * 元素流在管道中经过中间操作（intermediate operation）的处理，最后由最终操作(terminal operation)得到前面处理的结果。
 */
public class Java8Tester3 {
    public static void main(String[] args) {
        /**
         *     在 Java 8 中, 集合接口有两个方法来生成流：
         *     stream() − 为集合创建串行流。
         *     parallelStream() − 为集合创建并行流。
         */


        /**
         * filter:
         * filter 方法用于通过设置的条件过滤出元素。
         * 以下代码片段使用 filter 方法过滤出空字符串：
         */
        //filter筛选非空元素集合
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        long count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println("空字符的数量:" + count);
        System.out.println(filtered);


        /**
         * forEach:
         * Stream 提供了新的方法 'forEach' 来迭代流中的每个数据
         * 以下代码片段使用 forEach 输出了10个随机数
         * limit:
         * limit 方法用于获取指定数量的流。
         */
        Random random = new Random();
//        random.ints().limit(10).forEach(System.out::println);
        IntStream ints = random.ints();
        IntStream limit = ints.limit(3);
        limit.forEach(System.out::println);


        /**
         * map:
         * map 方法用于映射每个元素到对应的结果
         * 以下代码片段使用 map 输出了元素对应的平方数：
         * distinct:
         * 去除重复
         */
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println(squaresList);

        /**
         * sorted:
         * sorted 方法用于对流进行排序。
         * 以下代码片段使用 sorted 方法对输出的 10 个随机数进行排序：
         */
        random.ints().limit(10).sorted().forEach(System.out::println);


        /**
         * parallelStream
         * parallelStream 是流并行处理程序的代替方法。
         * 以下实例我们使用 parallelStream 来输出空字符串的数量：
         */
        List<String> strings1 = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        // 获取空字符串的数量
        long count1 = strings.parallelStream().filter(string -> string.isEmpty()).count();


        /**
         * Collectors
         * Collectors 类实现了很多归约操作，例如将流转换成集合和聚合元素。
         * Collectors 可用于返回列表或字符串：
         */
        List<String> strings2 = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered2 = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        System.out.println("筛选列表: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);


        /**
         * 统计
         * 另外，一些产生统计结果的收集器也非常有用。
         * 它们主要用于int、double、long等基本类型上，它们可以用来产生类似如下的统计结果。
         */
        List<Integer> numbers2 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());

    }
}
