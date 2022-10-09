package pp;

import java.util.Comparator;

public class Comp implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        String s1 = (String)o;
        String s2 = (String)t1;
        return s1.compareTo(s2);
    }
}