package offer;

/**
 * 剪绳子
 */
public class Question46 {
    /**
     * 这个是贪心算法 因为3(n−3)≥2(n−2),还可以动态规划做
     * @param target
     * @return
     */
    public int curRope(int target){
        if (target<=1){
            return 0;
        }
        if (target==2){
            return 1;
        }
        if (target==3){
            return 2;
        }
        if (target%3==1){
            int k=target/3-1;
            return (int)Math.pow(3,k)*2*2;
        }if (target%3==2){
            int k=target/3;
            return (int)Math.pow(3,k)*2;
        }
        return (int)Math.pow(3,target/3);
    }

}
