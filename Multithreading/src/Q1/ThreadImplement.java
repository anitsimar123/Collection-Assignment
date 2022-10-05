package Q1;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ThreadImplement extends Thread{
    @Override
    public void run() {
        IntStream.range(0,10).forEach(System.out::println);
    }
}
