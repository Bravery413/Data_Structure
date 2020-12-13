package sort.sort2020;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author: Bravery
 * @create: 2020-11-06 15:33
 **/


public class BubleSort {
    public static void bubleSort(int[] qus) throws Exception {
        FileUtil.deleteFile(FileUtil.filePath);
        for (int i = 0; i < qus.length; i++) {
            for (int j = 0; j < qus.length - i - 1; j++) {
                FileUtil.charOutStream(qus);
                if (qus[j] > qus[j + 1]) {
                    int temp = qus[j];
                    qus[j] = qus[j + 1];
                    qus[j + 1] = temp;
                }
            }
        }
    }

}
