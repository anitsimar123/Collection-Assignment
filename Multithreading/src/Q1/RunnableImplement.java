package Q1;

import java.util.stream.IntStream;

public class RunnableImplement implements Runnable{

    @Override
    public void run() {
        IntStream.range(0,10).forEach(System.out::println);
    }
}
