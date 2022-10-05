package Q3;

import java.util.stream.IntStream;

public class Table {
synchronized public void table(int number){
    IntStream.rangeClosed(1,10).map(i->i*number).forEach(System.out::println);
}
}
