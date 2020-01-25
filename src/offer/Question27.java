package offer;

public class Question27 {
    public static int RectCover(int target) {
        if (target <= 0) {
            return 0;
        }
        if (target == 1 || target == 2) {
            return target;
        } else {
            return RectCover(target - 1) + RectCover(target - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(RectCover(5));
    }
}
