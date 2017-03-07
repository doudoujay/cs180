public class MainThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.printf("main thread = %s\n", t);

        System.out.printf("going to sleep...\n");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("ah, that was nice\n");

        System.out.printf("letting someone else run\n");
        Thread.yield();
        System.out.printf("back\n");
    }
}
