package JVM;

import java.util.ArrayList;

/**
 * @author: Bravery
 * @create: 2019-09-16 10:23
 **/


public class HeapOOM {
    static class OOMObject {
    }

    public static void main(String[] args) {
        ArrayList<OOMObject> oomObjects = new ArrayList<>();
        int i=1;
        while(true){
            oomObjects.add(new OOMObject());
            System.out.println(i++);
        }
    }
}
