import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        String[] a = {"Amrit","Singh","Race","Football"};

        Supplier<String> s1 = ()-> {
            String otp ="";

            for(int i=0;i<6;i++){
                otp+=(int)(Math.random()*10);
            }
            return otp.trim();
        };

        Function<Integer,Integer> f1 = i->i*5;

        Function<String,Integer> f2 = s->s.length();

        for(String s : a){
            System.out.println(f2.andThen(f1).apply(s));
            System.out.println(f1.compose(f2).apply(s));

        }

        System.out.println(s1.get());



        List<Employee> l1 = new ArrayList();
        BiFunction<Integer,String,Employee> bf1 = Employee::new;

        l1.add(bf1.apply(1,"Amrit"));
        l1.add(bf1.apply(2,"Aarush"));

        for(Employee e : l1){
            System.out.println(e);
        }
    }
}