package pp;

import java.util.*;

public class Main {
    public static void main(String[] args) {


//        TreeSet treeSet = new TreeSet((i1,i2)->-(i1.toString()).compareTo(i2.toString()));
//
//        treeSet.add(new StringBuffer("D"));
//        treeSet.add(new StringBuffer("T"));
//        treeSet.add(new StringBuffer("U"));
//        treeSet.add(new StringBuffer("A"));
//        treeSet.add(new StringBuffer("C"));
//        treeSet.add(new StringBuffer("R"));


//        System.out.println(treeSet);

//        HashSet h = new HashSet<>();
//        h.add(null);
//        h.add("A");
//
//        System.out.println(h);


        HashMap<String,Integer> hashMap = new HashMap();
        hashMap.put("Amrit",100);
        hashMap.put("Keshav",200);
        hashMap.put("Deepesh",300);

        System.out.println(hashMap);

        Set s1 = hashMap.keySet();
        System.out.println(s1);

        Set s2 = hashMap.entrySet();
        System.out.println(s2);


        hashMap.entrySet().stream().forEach(System.out::println);

        for(Map.Entry entry: hashMap.entrySet()){

            if(entry.getKey().equals("Amrit")){
                entry.setValue(1000);
            }
            System.out.println(entry);
        }
    }
}
