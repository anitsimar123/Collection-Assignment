package Q1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
     ThreadImplement threadImplement = new ThreadImplement();
     RunnableImplement runnableImplement = new RunnableImplement();


        Thread thread = new Thread(runnableImplement);
        thread.start();

        System.out.println("Thread created using Runnable");
        thread.join();
        System.out.println("Second Thread created using Thread class");
        threadImplement.start();

    }
}