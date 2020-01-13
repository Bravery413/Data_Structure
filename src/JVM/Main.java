package JVM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: Bravery
 * @create: 2019-09-16 21:13
 **/


public class Main {
    private static String letterMap[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    private static ArrayList<String> res;
    public static List<String> method(String digits){
        res=new ArrayList<String>();
        if (digits.equals("")){
            return res;
        }
        find(digits,0,"");
        return res;
    }
    private static void find(String digits,int index,String s){
        if (index==digits.length()){
            res.add(s);
            return;
        }
        Character c=digits.charAt(index);
        String ls=letterMap[c-'0'];
        for (int i=0;i<ls.length();i++){
            find(digits,index+1,s+ls.charAt(i));
        }
        return;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(method(str));
    }
}
