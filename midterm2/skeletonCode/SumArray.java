public class SumArray extends Thread {
    private static int sum=0;
    private int[] nums;

    public SumArray(int[] nums) {
        this.nums = nums;
    }

    public static int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i: nums
             ) {
            addToSum(i);

        }
    }

    public static void resetSum() {
        sum =0;
    }
    public static synchronized void addToSum(int amount){
        sum+=amount;
    }

}