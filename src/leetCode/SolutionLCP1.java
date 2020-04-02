package leetCode;

public class SolutionLCP1 {
    public static int game(int[] guess, int[] answer) {
        int res=0;
        for (int i = 0; i <= guess.length; i++) {
            if (guess[i]==answer[i]) res++;
        }
        return res;
    }

    public static void main(String[] args) {

    }

}
