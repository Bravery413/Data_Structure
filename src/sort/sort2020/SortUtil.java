package sort.sort2020;

import java.util.Arrays;
import java.util.Random;

/**
 * @author: Bravery
 * @create: 2020-11-06 14:58
 **/


public class SortUtil {
    public static void main(String[] args) throws Exception {
//        int[] qus = getRandom(10, 100);
        int[] qus={86, 1, 12, 42, 58, 71};
        BubleSort.bubleSort(qus);
        System.out.println(isSort(qus));
    }


    /**
     * 获得一个int[] 随机数组
     *
     * @param num 个数
     * @param max 大小
     * @return
     */
    public static int[] getRandom(int num, int max) {
        if (num <= 0 || max <= 0) {
            return new int[0];
        }
        int[] qus = new int[num];
        for (int i = 0; i < qus.length; i++) {
            Random random = new Random();
            qus[i] = random.nextInt(max) + 1;
        }
        System.out.println(Arrays.toString(qus));
        return qus;
    }

    /**
     * 检查是否排序
     * 入参有待排序数组,排序数组
     * 调用APIArrays.sort()排序然后一一比较
     * 如果不等,命令行输出两边下标和数字
     *
     * @param target
     * @param que
     * @return
     */
    public static boolean isSort(int[] target, int[] que) {
        if (target.length != que.length) {
            System.out.println("两数组长度不等");
            return false;
        }
        Arrays.sort(target);
        for (int i = 0; i < target.length; i++) {
            if (target[i] != que[i]) {
                System.out.println("数组下标:" + i + " 原始数组值:" + target[i] + " 排序数组值:" + que[i]);
                return false;
            }
        }
        return true;
    }

    /**
     * 判断是否升序
     *
     * @param target
     * @param target
     * @return
     */
    public static boolean isSort(int[] target) {
        if (target.length == 0) {
            System.out.println("数组为空");
            return false;
        }
        for (int i = 0; i < target.length - 1; i++) {
            if (target[i] > target[i + 1]) {
                System.out.println("数组下标:" + i + " 原始数组值:" + target[i]);
                return false;
            }
        }
        return true;
    }
}
