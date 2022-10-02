import java.util.function.*;

public class Main1 {
    public static void main(String[] args) {
        ToIntFunction<String> f1 = s->s.length();
        System.out.println(f1.applyAsInt("Amrit"));

        LongUnaryOperator f2 = i->i*7;
        System.out.println(f2.applyAsLong(106L));

        IntBinaryOperator f3 = (i1,i2)->i1+i2;
        System.out.println(f3.applyAsInt(3,4));


    }
}
