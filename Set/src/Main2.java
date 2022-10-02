import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
//        List<Employee> l = new ArrayList<>();
//        l.add(new Employee("Amrit",23, 22232.330));
//        l.add(new Employee("Aarush",23,34343.564));
//        l.add(new Employee("Tarun",43,23232.534));
//        l.add(new Employee("Tarun",33,12222.333));
//
//        Collections.sort(l,new Comp().thenComparing(Employee::getAge));
//
//        Iterator itr = l.iterator();
//
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

       List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

       Function<Integer,Integer> f1 = i->i*i;

       for(Integer i: list){
           System.out.println(f1.apply(i));
       }


    }
}
