package experiments;

public class AnotherRunnable implements Runnable {
    private static int pause = 3000;

    @Override
    public void run() {
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