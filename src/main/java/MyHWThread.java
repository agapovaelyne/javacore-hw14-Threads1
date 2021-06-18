public class MyHWThread extends Thread {
    private static int pause = 3000;

    public MyHWThread(ThreadGroup g, String name) {
        super(g, name);
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
