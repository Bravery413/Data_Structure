package JVM;

import java.util.Scanner;

/**
 * @author: Bravery
 * @create: 2019-09-16 21:04
 **/




public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String IP = scanner.next();
        if(IP==null){
            System.out.println("Neither");
        }
        String regex0 = "(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])";
        String regexIPv4 = regex0 + "(\\." + regex0 + "){3}";
        String regex1 = "([\\da-fA-F]{1,4})";
        String regexIPv6 = regex1 + "(:" + regex1 + "){7}";

        String result = "Neither";
        if (IP.matches(regexIPv4)) {
            result = "IPv4";
        } else if (IP.matches(regexIPv6)) {
            result = "IPv6";
        }
        System.out.println(result);
    }
}
