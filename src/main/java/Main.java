import experiments.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ThreadGroup mainGroup = new ThreadGroup("HW task 1 threadGroup");

        // variant 1
        Thread firstThread = new MyHWThread(mainGroup, "Thread 1");
        Thread secondThread = new MyHWThread(mainGroup, "Thread 2");
        Thread thirdThread = new MyHWThread(mainGroup, "Thread 3");
        Thread fourthThread = new MyHWThread(mainGroup, "Thread 4");

        firstThread.start();
        secondThread.start();
        thirdThread.start();
        fourthThread.start();

        /* эксперименты + часть решения с закрытием потока в самом низу
        // variant 2
        Thread firstThread = new OneHWThread(mainGroup);
        Thread secondThread = new OneHWThread(mainGroup);
        Thread thirdThread = new OneHWThread(mainGroup);
        Thread fourthThread = new OneHWThread(mainGroup);

        firstThread.start();
        secondThread.start();
        thirdThread.start();
        fourthThread.start();

        //variant 3

        Runnable firstThread = new AnotherRunnable();
        Runnable secondThread = new AnotherRunnable();
        Runnable thirdThread = new AnotherRunnable();
        Runnable fourthThread = new AnotherRunnable();


        new Thread(mainGroup, firstThread, "Thread 1" ).start();
        new Thread(mainGroup, secondThread,"Thread 2"  ).start();
        new Thread(mainGroup, thirdThread, "Thread 3" ).start();
        new Thread(mainGroup, fourthThread, "Thread 4" ).start();


        //variant 4

        OneRunnable firstThread = new OneRunnable();
        OneRunnable secondThread = new OneRunnable();
        OneRunnable thirdThread = new OneRunnable();
        OneRunnable fourthThread = new OneRunnable();


        new Thread(mainGroup, firstThread).start();
        new Thread(mainGroup, secondThread).start();
        new Thread(mainGroup, thirdThread).start();
        new Thread(mainGroup, fourthThread).start();
         */

        Thread.currentThread().sleep(15000);
        mainGroup.interrupt();
    }
}
