package realQuestion.meituan;

/**
 * @author bravery
 * @date 2019/8/22 7:49
 */

import org.omg.CORBA.INTERNAL;

/**
 * 美团点评2016研发工程师在线编程题1
 */
public class Question1 {
    public int getDis(int[] A, int n) {
        int max=0;
        int min= Integer.MAX_VALUE;
        int res=0;
        for (int a:A){
            if (a>max){
                max=a;
                if (res<max-min){
                    res=max-min;
                }
            }
            if (a<min){
                min=a;
                if (res<max-min){
                    res=max-min;
                }
            }

        }
       return max-min;
    }
}
