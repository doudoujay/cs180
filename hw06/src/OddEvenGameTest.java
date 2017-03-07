import junit.framework.TestCase;

/**
 * Created by jay on 2017/2/17.
 */
public class OddEvenGameTest extends TestCase {


    public void testGetEvenSum() {
        OddEvenGame obj1 = new OddEvenGame();
        OddEvenGame obj2 = new OddEvenGame();
        obj1.addEven(new int[]{1, 2, 3, 4, 5, 6});
        obj1.addOdd(new int[]{1, 2, 3, 4, 5, 6});
        obj2.addEven(new int[]{100, 101, 241, 302, 501, 623});
        obj2.addOdd(new int[]{100, 101, 241, 302, 501, 623});
        assertEquals(12, obj1.getEvenSum());

    }

    public void testGetOddSum() {
        OddEvenGame obj1 = new OddEvenGame();
        OddEvenGame obj2 = new OddEvenGame();
        obj1.addEven(new int[]{1, 2, 3, 4, 5, 6});
        obj1.addOdd(new int[]{1, 2, 3, 4, 5, 6});

        obj2.addEven(new int[]{100, 101, 241, 302, 501, 623});
        obj2.addOdd(new int[]{100, 101, 241, 302, 501, 623});
        assertEquals(1466, obj2.getOddSum());

    }

    public void testGetTotalOddSum() {
        OddEvenGame obj1 = new OddEvenGame();
        OddEvenGame obj2 = new OddEvenGame();
        obj1.addEven(new int[]{1, 2, 3, 4, 5, 6});
        obj1.addOdd(new int[]{1, 2, 3, 4, 5, 6});

        obj2.addEven(new int[]{100, 101, 241, 302, 501, 623});
        obj2.addOdd(new int[]{100, 101, 241, 302, 501, 623});
        assertEquals(1475, obj1.getTotalOddSum());

    }

    public void testGetTotalEvenSum() {
        OddEvenGame obj1 = new OddEvenGame();
        OddEvenGame obj2 = new OddEvenGame();
        obj1.addEven(new int[]{1, 2, 3, 4, 5, 6});
        obj1.addOdd(new int[]{1, 2, 3, 4, 5, 6});

        obj2.addEven(new int[]{100, 101, 241, 302, 501, 623});
        obj2.addOdd(new int[]{100, 101, 241, 302, 501, 623});
        assertEquals(414, obj2.getTotalEvenSum());

    }
}
