import org.junit.Test;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Test cases for the {@code SumArray} class.
 *
 * @author Logan Kulinski
 * @version March 21, 2017
 */
public class SumArrayTest {
    @Test
    public void testGetSumOne() throws Exception {
        SumArray.resetSum();

        //create int array object
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};

        //calculate the midpoint of nums
        int mid = nums.length / 2;

        //create two int subarray objects
        int[] halfOne = new int[mid];
        int[] halfTwo = new int[mid];

        //coppy the nums into the halfOne and halfTwo
        System.arraycopy(nums, 0, halfOne, 0, mid);
        System.arraycopy(nums, mid, halfTwo, 0, mid);

        //create two SumArray objects
        SumArray s1 = new SumArray(halfOne);
        SumArray s2 = new SumArray(halfTwo);

        //start s1 and s2
        s1.start();
        s2.start();

        //wait for s1 and s2 to finish
        s1.join();
        s2.join();

        assertEquals("ensure that your run() method is correctly summing the array!", 21, SumArray.getSum());
    } //testGetSumOne

    @Test
    public void testGetSumTwo() throws Exception {
        SumArray.resetSum();

        //create int array object
        int[] nums = new int[] {1, 34, 3, 65, 5, 47, 5};

        //calculate the midpoint of nums
        int mid = nums.length / 2;

        //create two int subarray objects
        int[] halfOne = new int[mid];
        int[] halfTwo = new int[nums.length - mid];

        //coppy the nums into the halfOne and halfTwo
        System.arraycopy(nums, 0, halfOne, 0, halfOne.length);
        System.arraycopy(nums, mid, halfTwo, 0, halfTwo.length);

        //create two SumArray objects
        SumArray s1 = new SumArray(halfOne);
        SumArray s2 = new SumArray(halfTwo);

        //start s1 and s2
        s1.start();
        s2.start();

        //wait for s1 and s2 to finish
        s1.join();
        s2.join();

        assertEquals("ensure that your run() method is correctly summing the array!", 160, SumArray.getSum());
    } //testGetSumTwo

    @Test
    public void testGetSumThree() throws Exception {
        SumArray.resetSum();

        int[] nums = new int[1000000];
        int sum = 0;

        //create Random objects to generate random values for nums
        Random randGen = new Random();

        //traverse nums, and initialize each element and the sum
        for (int i = 0; i < nums.length; i++) {
            nums[i] = randGen.nextInt(100) + 1;
            sum += nums[i];
        } //end for

        //calculate the midpoint of nums
        int mid = nums.length / 2;

        //create two int subarray objects
        int[] halfOne = new int[mid];
        int[] halfTwo = new int[nums.length - mid];

        //copy the nums into the halfOne and halfTwo
        System.arraycopy(nums, 0, halfOne, 0, halfOne.length);
        System.arraycopy(nums, mid, halfTwo, 0, halfTwo.length);

        //create two SumArray objects
        SumArray s1 = new SumArray(halfOne);
        SumArray s2 = new SumArray(halfTwo);

        //start s1 and s2
        s1.start();
        s2.start();

        //wait for s1 and s2 to finish
        s1.join();
        s2.join();

        assertEquals("ensure that your run() method is correctly summing the array!", sum, SumArray.getSum());
    } //testGetSumThree
}