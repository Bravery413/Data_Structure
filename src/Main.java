import java.util.HashMap;

/**
 * @author: Bravery
 * @create: 2019-08-22 16:02
 **/


public class Main {
    public static void main(String[] args){
        String str="MPMPCPMCM DEFEGDE HINHKLIN";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if (!map.containsKey(c)){
                map.put(c,i);
                for (int j=str.length()-1;j>=i;j--){
                    if (map.containsKey(c)){

                    }
                }
            }
        }
    }
}
