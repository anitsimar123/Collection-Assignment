package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
      List<String> l1 = Arrays.asList("A","AAA","BBB","AA","EEE");
      List<String> l2 = new ArrayList<>();
      l2.add("EE");
      l2.add("DD");
      l2.add("AA");
      l2.add("BB");

//      List<Double> l3 = Arrays.asList(2.56,1.34,3.43,5.88,4.78);
//      Comparator<Double> c = (i1,i2)->-i1.compareTo(i2);
//      l3 = l3.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
//        System.out.println(l3);

        Comparator<String> c = (i1,i2)->{
            Integer le1 = i1.length();
            Integer le2 = i2.length();
            return  le1 < le2 ? -1 : le1 > le2 ? 1 : i1.compareTo(i2);
        };
        l2=l2.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(l2);

        l1 = l1.stream().sorted(c).collect(Collectors.toList());
        System.out.println(l1);
    }
}
