package pp;

import java.util.IdentityHashMap;
import java.util.TreeMap;

public class Main2 {
    public static void main(String[] args) {
        IdentityHashMap<StringBuffer,Integer> hashMap = new IdentityHashMap();
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        StringBuffer stringBuffer1 = new StringBuffer("Amrit");
        StringBuffer stringBuffer2 = new StringBuffer("Amrit");
        hashMap.put(stringBuffer1,10);
        hashMap.put(stringBuffer2,100);

        System.out.println(hashMap);

        TreeMap<String, String> treeMap = new TreeMap();
        treeMap.put("null","null");

        System.out.println(treeMap);
    }

}
