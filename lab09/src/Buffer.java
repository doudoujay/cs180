/**
 * Created by jay on 3/21/17.
 */
public class Buffer {
    private int contents;
    private boolean empty = true;

    public synchronized int get() {
        while (empty) {

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }


        System.out.println("Consumer got: " + contents);
        empty = true;
        notifyAll();
        return contents;

    }

    public synchronized void set(int contents) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Producer put: " + contents);
        this.contents = contents;
        empty = false;
        notifyAll();
    }
}
