package leetcode;

public class Solution299 {
    public static String getHint(String secret, String guess) {
        int A = 0;
        int[] bucket = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                A++;
            } else {
                bucket[secret.charAt(i)-'0'] += 1;
                bucket[guess.charAt(i)-'0'] -= 1;
            }
        }
        int count = 0;
        for (int i=0;i<10;i++) {
            if (bucket[i] > 0) {
                count+=bucket[i];
            }
        }
        int B = secret.length() - count - A;
        return A + "A" + B + "B";
    }

    public static void main(String[] args) {
        System.out.println(getHint("1122", "3456"));
    }
}
