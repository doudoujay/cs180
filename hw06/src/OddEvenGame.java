/**
 * Created by jay on 2017/2/17.
 */
public class OddEvenGame {
    int oddsum;
    int evensum;
    static int totalOddSum;
    static int totalEvenSum;

    public void addEven(int[] array) {
        for (int a : array) {
            if (a % 2 == 0) {
                evensum += a;
            }

        }
        totalEvenSum += evensum;
    }

    public void addOdd(int[] array) {
        for (int a : array) {
            if (a % 2 != 0) {
                oddsum += a;

            }
        }
        totalOddSum += oddsum;
    }

    public int getOddSum() {
        return oddsum;
    }

    public int getEvenSum() {
        return evensum;
    }

    public int getTotalOddSum() {
        return totalOddSum;
    }

    public int getTotalEvenSum() {
        return totalEvenSum;
    }
}
