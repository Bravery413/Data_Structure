import java.util.*;

/**
 * 输入样例有误,N,M需要先输入才知道边界
 */
public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gifNum = scanner.nextInt();
        int place1 = scanner.nextInt();
        int place2 = scanner.nextInt();
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        for (int i=0;i<gifNum;i++){
            int pl1 = scanner.nextInt();
            int pl2 = scanner.nextInt();
            p1.add(pl1);
        }
        Collections.sort(p1);
        Collections.sort(p2);
        int totalPay=0;
        for (int i=0;i<place1;i++){
            totalPay+=p1.get(i);
        }
        for (int i=0;i<place2;i++){
            totalPay+=p2.get(i);
        }
        System.out.println(totalPay);
    }
}


//        String str="# : a:3#b:8#c:9";
//        String substring = str.substring(4);
//        System.out.println(substring);
//        String[] split = substring.split("#");
//        System.out.println(split.length);
//        for (String s:split){
//            char[] chars = s.toCharArray();
//            chars[1]=' ';
//            s=String.valueOf(chars);
//            System.out.println(s);
//        }
//    public static int getResult(int N){
//        if (N<=2){
//            return 1;
//        }
//        int c=0;
//        for (int i=1;i<N;i++){
//            int s=i*(i+1)/2;
//            if (s>N){
//                break;
//            }
//            else if(s==N){
//                c++;
//                break;
//            }
//            else {
//                if ((N-s)%i==0){
//                    c++;
//                }
//            }
//        }
//        return c;
//    }

//        Scanner scan = new Scanner(System.in);
//        String str1 = scan.next();
//        String str2 = scan.next();
//        System.out.println(minDistance(str1,str2));
//                String str="# : a:3#b:8#c:9";
//Scanner scanner = new Scanner(System.in);
//    String str = scanner.nextLine();
//    String substring = str.substring(4);
//    String[] split = substring.split("#");
//        System.out.println(split.length);
//                for (String s:split){
//                char[] chars = s.toCharArray();
//                chars[1]=' ';
//                s=String.valueOf(chars);
//                System.out.println(s);
//                }
//public static int minDistance(String word1, String word2) {
//    int m = word1.length();
//    int n = word2.length();
//    int[][] dp = new int[m + 1][n + 1];
//    for (int i = 0; i <= m; i++) {
//        dp[i][0]=i;
//    }
//    for (int i = 0; i <= n; i++) {
//        dp[0][i]=i;
//    }
//    for (int i = 1; i <= m; i++) {
//        for (int j = 1; j <= n; j++) {
//            if (word1.charAt(i-1)==word2.charAt(j-1)){
//                dp[i][j]=dp[i-1][j-1];
//            }else {
//                dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
//            }
//        }
//    }
//    return dp[m][n];
//}