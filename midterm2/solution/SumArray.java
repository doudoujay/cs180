/**
 * Sums a portion of an array split amongst multiple threads.
 *
 * @author Logan Kulinski
 * @version March 21, 2017
 */
public class SumArray extends Thread {
    /**
     * The array of numbers to be summed.
     */
    private int[] nums;

    /**
     * The sum of the array of numbers.
     */
    private static int sum = 0;

    /**
     * Constructs a newly allocated {@code SumArray} object.
     *
     * @param nums the array of numbers to be summed
     */
    public SumArray(int[] nums) {
        //initialize field
        this.nums = nums;
    } //SumArray

    /**
     * Gets the sum of the array of numbers.
     *
     * @return the sum of the array of numbers
     */
    public static int getSum() {
        return SumArray.sum;
    } //getSum

    /**
     * Sets the sum back to zero.
     */
    public static void resetSum() {
        SumArray.sum = 0;
    } //resetSum

    /**
     * Adds the specified amount to sum.
     *
     * @param amount the amount to be added to sum
     */
    public static synchronized void addToSum(int amount) {
        SumArray.sum += amount;
    } //addToSum

    @Override
    public void run() {
        //traverse nums
        for (int i = 0; i < this.nums.length; i++) {
            SumArray.addToSum(this.nums[i]);
        } //end for
    } //run
}