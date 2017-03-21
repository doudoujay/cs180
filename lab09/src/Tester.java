/**
 * Created by jay on 3/21/17.
 */
public class Tester {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Runnable p = new Producer(buffer);
        Runnable c = new Consumer(buffer);
        Thread producer = new Thread(p);
        Thread consumer = new Thread(c);
        producer.start();
        consumer.start();


    }
}
