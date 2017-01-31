/**
 * Created by jay on 1/31/17.
 */
public class MathTools {
    public static double absoluteValue(double n) {
        if (n >= 0) {
            return n;
        }
        return -n;
    }

    public static double power(double base, int exponent) {
        double result = 1;
        if (exponent < 0) {
            double abs = absoluteValue(exponent);
            for (int i = 0; i < exponent; i++) {
                result = result * base;
            }
            result = 1/result;
        } else {
            for (int i = 0; i < exponent; i++) {
                result = result * base;
            }
        }
        return result;
    }

    public static double nthRoot(double value, int root) {
        double result = 0;
        if (root>0){

        }


        return result;
    }
}
