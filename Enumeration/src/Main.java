import java.util.Enumeration;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(12);
        v.add(33);

        Enumeration e = v.elements();

        while(e.hasMoreElements()){
            Integer integer = (Integer)e.nextElement();
            if(integer%2==0){
                System.out.println(integer);
            }

        }
    }
}