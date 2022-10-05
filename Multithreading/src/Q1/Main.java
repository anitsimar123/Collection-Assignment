package Q1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
     ThreadImplement threadImplement = new ThreadImplement();
     RunnableImplement runnableImplement = new RunnableImplement();

     threadImplement.start();


        System.out.println("First Thread");
        threadImplement.join();
        Thread.sleep(5000);
        System.out.println("Second Thread");

     Thread thread = new Thread(runnableImplement);
     thread.start();

    }
}