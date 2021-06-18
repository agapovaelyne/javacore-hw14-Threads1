package experiments;

public class OneHWThread extends Thread {
    private static int threadCounter = 1;
    private static int pause = 3000;
    private int index;

    public OneHWThread() {
        index = threadCounter;
        setName("HWThread " + index);
        threadCounter++;
    }

    public OneHWThread(ThreadGroup g) {
        super(g, "HWThread " + threadCounter);
        threadCounter++;
        index = threadCounter;
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(pause);
                System.out.printf("Hello! I'm %s!\n", getName());
            }
        } catch (InterruptedException e) {
        } finally {
            System.out.printf("%s is closed\n", getName());
        }
    }
}
