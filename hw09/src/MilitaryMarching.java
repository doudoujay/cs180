public class MilitaryMarching {
    public static void main(String[] args) {
        Thread left = new LeftThread();
        Thread right = new RightThread();
        left.start();
        right.start();
        try {
            left.join();
            right.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}

