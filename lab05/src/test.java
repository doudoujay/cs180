import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by ma438 on 2/14/17.
 */
public class test {
    public static void main(String[] args) {
        int[] a = {1,1,1,1,1};
        int[][] b = {a,a,a,a};
        System.out.printf(Arrays.toString(b));
    }
}
