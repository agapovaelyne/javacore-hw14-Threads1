package experiments;

public class OneRunnable implements Runnable {
    private static int jobCounter = 0;
    private static int pause = 3000;
    private int index;

    public OneRunnable() {
        jobCounter++;
        this.index = jobCounter;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("experiments.OneRunnable thread " + index);
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Thread.sleep(pause);
                System.out.printf("Hello! I'm %s!\n", Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
        } finally {
            System.out.printf("%s is closed\n", Thread.currentThread().getName());
        }
    }
}