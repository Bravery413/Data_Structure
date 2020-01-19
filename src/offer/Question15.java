package offer;

import java.util.stream.IntStream;

/**
 * 替换空格
 */
public class Question15 {

    public static String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }
        StringBuffer res = new StringBuffer();
        IntStream chars = str.chars();
        chars.forEach(c -> {
            if (c == ' ') {
                System.out.println("我是空格");
                res.append("%20");
            } else {
                res.append((char) c);
            }
        });

        return res.toString();
    }

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("We Are Happy.");
        String s = replaceSpace(stringBuffer);
        System.out.println(s);


    }

}
