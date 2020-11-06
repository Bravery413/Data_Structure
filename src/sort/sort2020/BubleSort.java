package sort.sort2020;

/**
 * @author: Bravery
 * @create: 2020-11-06 15:33
 **/


public class BubleSort {
    public static void bubleSort(int[] qus) {
        for (int i = 0; i < qus.length; i++) {
            for (int j = 0; j < qus.length - i - 1; j++) {
                if (qus[j] > qus[j + 1]) {
                    int temp = qus[j];
                    qus[j] = qus[j + 1];
                    qus[j + 1] = temp;
                }
            }
        }
    }

}
