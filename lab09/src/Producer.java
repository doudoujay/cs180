/**
 * Created by jay on 3/21/17.
 */
public class Producer implements Runnable {
    private Buffer buffer;

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            buffer.set(i);
            try {
                Thread.sleep((int)Math.random()*100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }
}
