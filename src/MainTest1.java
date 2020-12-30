import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: Bravery
 * @create: 2019-09-04 15:53
 **/


public class MainTest1 {
    public static void testParttern(String str) {
        //表达式的功能：验证必须为数字（整数或小数）
        String pattern = "[0-9]+([0-9]+)?";
        //对()的用法总结：将()中的表达式作为一个整体进行处理，必须满足他的整体结构才可以。
        //(.[0-9]+)? ：表示()中的整体出现一次或一次也不出现
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        boolean res = m.matches();
        System.out.println( res);

    }


    public static void main(String[] args) {
//        testParttern("02123412");
        String str="单技能|双技能";
        String[] split = str.split("\\|");
        for (String s:split){
            System.out.println(s);
        }

    }
}
