import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());
        Thread thread1 = new ThreadExample(10);
        Thread thread2 = new ThreadExample(5);

        thread1.start();
        thread2.start();

    }

    public static void runnableTest() {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        };

        task.run();

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Done!");
    }

    public static void poolTest() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() ->

        {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        });
    }
}