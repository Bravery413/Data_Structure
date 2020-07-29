package regExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 潘勇
 * @date 2020/7/29 15:54
 */


public class Test {
    /**
     *  转义字符\,对java来说是\\
     *  一个的:
     *  .  匹配一个字符
     *  \w 匹配一个字母,数字或者下划线 \w和\W是反的        word
     *  \d 匹配任意一个数字,\D匹配任意一个非数字           digit
     *  \s 匹配空格和tab, \S 与\s是反的
     *  多个的:
     *  ? 匹配0或者1个字符,可结合上面:a\d?c  ?还可表示表示非贪婪匹配
     *  + 匹配至少一个字符,可结合上面:a\d+c
     *  * 匹配任意个字符,可结合上面:a\d*c
     *  匹配n个:{n}      a\d{1}c
     *  匹配n~m个:{n,m}  a\d{1,2}c
     *  匹配大于n个{n,}   a\d{1,}c
     *
     *  练习:匹配国内电话号码规则: 3~4位区号加7~8位电话，中间用-连接，例如：010-12345678。
     *  String re1 = "\\d{3,4}-\\d{7,8}";
     *
     *  ^ 表示开头 $表示结尾 ^A\d{3}$  表示A开头三个数字结尾的字符串 A001
     *  [] 匹配范围内的字符:[123456789]\\d{6,7} 除0开头6-7位数字或者[1-9] 还有[a-z] [A-Z]都是可以的,顺序0-9 A-Z a-z
     *  [^] 取反 [^1-9]{3}   数字外三个字符
     *  | 表示或,括号提取公共部分 learn\\s(java|php|go)
     *  ()重要作用，就是分组匹配

     */
    public static void main(String[] args) {

        String s = "The     quick\t\t brown   fox  jumps   over the  lazy dog.";
        String r = s.replaceAll("\\s+", " ");
        System.out.println(r); // "The quick brown fox jumps over the lazy dog."

//        String s = "the quick brown fox jumps over the lazy dog.";
//        Pattern p = Pattern.compile("\\wo\\w");
//        Matcher m = p.matcher(s);
//        while (m.find()) {
//            String sub = s.substring(m.start(), m.end());
//            System.out.println(sub);
//        }

//        Pattern p = Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
//        Matcher m = p.matcher("010-12345678");
//        if (m.matches()) {
//            String g0=m.group(0);
//            String g1 = m.group(1);
//            String g2 = m.group(2);
//            System.out.println(g0);
//            System.out.println(g1);
//            System.out.println(g2);
//        } else {
//            System.out.println("匹配失败!");
//        }


//        String re1 = "learn\\s(java|php|go)";
//        System.out.println("learn java".matches(re1));

//        String regex = "20\\d\\d";
//        System.out.println("2019".matches(regex));
//        System.out.println("1998".matches(regex));



    }
}
