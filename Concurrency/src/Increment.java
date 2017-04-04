import java.util.concurrent.atomic.AtomicInteger;

/**
 * Increment: different thread safe (and one unsafe) approaches to incrementing a shared counter
 * @author Tori Shurman, 03/21/2017
 */
public class Increment extends Thread {

    private static int count; //static counter for approaches 1-2

    private static Object gate; //gatekeeper object for approach 2

    private static AtomicInteger counter; //AtomicInteger for approach 3

    public Increment() {
        //Initialize ALL reference types
        gate = new Object();
        counter = new AtomicInteger();
    }

    /*
     * Approach 0. Not thread safe. If you place a call to increment0() in run() and
     * run the program multiple times, you will see different results
     */
    public void increment0() {
        count++;
    }

    /*
     * Approach 1: synchronized method. More thread safe. If you place a call to increment1()
     * in run() and run the program multiple times, you will see similar results
     */
    public synchronized void increment1() {
        count++;
    }

    /*
     * Approach 2: gatekeeper method. Thread safe. If you place a call to increment2()
     * in run() and run the program multiple times, you will see the same result
     */
    public void increment2() {
        synchronized (gate) {
            count++;
        }
    }

    /*
     * Approach 3: AtomicInteger. Thread safe. If you place a call to increment3()
     * in run() and run the program multiple times, you will see the same result.
     * There are other Atomic classes for you to utilize for other projects which
     * require thread safety. See the java.util.concurrent.atomic package for more.
     * Also look at the API documentation for AtomicInteger to find other methods
     * you can use
     */
    public void increment3() {
        counter.getAndIncrement();
    }

    /*
     * run(): overrides the run method of the superclass. Change the version of increment
     * that is called to see the output of the different approaches outlined above.
     */
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            //change the method called here to see the results of different approaches to
            //synchronization. If you are switching from approach 0-2 to approach 3 or
            //from approach 3 to one of approaches 0-2, make sure to uncommnt the appropriate
            //print statement in main
            increment3();
        }
    }

    public static void main(String[] args) {
        //create three instances of increment for the three threads that will run the program
        Increment i1 = new Increment();
        Increment i2 = new Increment();
        Increment i3 = new Increment();

        //create three threads, each one taking an Increment object as an argument
        //as this class extends Thread
        Thread t1 = new Thread(i1);
        Thread t2 = new Thread(i2);
        Thread t3 = new Thread(i3);

        //start the threads
        t1.start();
        t2.start();
        t3.start();

        //calls to join() and some other thread methods must be placed in a try/catch block
        //as the thread can throw an InterruptedException
        try {
            //join the threads. t1.join() tells the thread running this method (the main thread)
            // to wait for t1 to finish before further execution. Likewise for t2.join and t3.join()
            t1.join();
            t2.join();
            t3.join();

            //uncomment the line below this for approaches 0-2, and the line after that for approach 3
//            System.out.println("count: " + count);
            System.out.println("count: " + counter.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


