package leetCode;

public class Solution299 {
    public static String getHint(String secret, String guess) {
        Integer A = 0;
        Integer B = 0;
        for (int i = 0; i < secret.length(); i++) {
            for (int j = 0; j < secret.length(); j++) {
                if(i==j&&secret.charAt(i) == guess.charAt(j)){
                    A++;
                } else if (secret.charAt(i) == guess.charAt(j))
                    B++;
            }
        }
        return A.toString() + "A" + B.toString() + "B";
    }

    public static void main(String[] args) {
        System.out.println(getHint("1807","7810"));
    }
}
