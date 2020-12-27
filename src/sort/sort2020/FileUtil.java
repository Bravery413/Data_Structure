package sort.sort2020;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

/**
 * @author: Bravery
 * @create: 2020-11-06 15:42
 **/


public class FileUtil {
    public static final String filePath="D:/test.txt";
    /**
     * 输出一行
     *
     * @param txt
     * @throws Exception
     */
    public static void charOutStream(int[] txt) throws Exception {
        // 1：利用File类找到要操作的对象
        File file = new File(filePath);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }

        //2：准备输出流
        FileWriter out = new FileWriter(file, true);
        out.write(Arrays.toString(txt));
        out.write("\r\n");
        out.close();

    }

    public static boolean deleteFile(String sPath) {
        boolean flag = false;
        File file = new File(sPath);
        // 路径为文件且不为空则进行删除
        if (file.isFile() && file.exists()) {
            file.delete();
            flag = true;
        }
        return flag;
    }

}
