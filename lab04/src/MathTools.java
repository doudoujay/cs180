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
            for (int i = 0; i < abs; i++) {
                result = result * base;
            }
            result = 1.0 / result;
        } else {
            for (int i = 0; i < exponent; i++) {
                result = result * base;
            }
        }
        return result;
    }

    public static double nthRoot(double value, int root) {

        if (root == 0 || value <= 0) {
            return 0;
        }
        double initialGuess = 0;
        if (root > 0)
            initialGuess = value;
        else if (root < 0)
            initialGuess = (double) 1 / value;


        double nextGuess = (1.0 / root) * ((root - 1) * initialGuess + value / power(initialGuess, root - 1));
        while (absoluteValue(initialGuess - nextGuess) > 0.000000000001) {
            initialGuess = nextGuess;
            nextGuess = (1.0 / root) * ((root - 1) * initialGuess + value / power(initialGuess, root - 1));
        }
        return nextGuess;


    }


    public static String scientificNotation(double n) {
        if (n < 0) {
            n = MathTools.absoluteValue(n);
        }
        if (n < 1) {
            int i = 0;
            while (n < 1) {
                n = n * 10;
                i++;
            }
            n = ((int) (n * 1000000)) / 1000000.0;
            String ans = (n + " x 10 ^ " + "-" + i);
            return ans;
        } else if (n >= 10) {
            int i = 0;
            while (n >= 10) {
                n = n / 10;
                i++;
            }
            n = ((int) (n * 1000000)) / 1000000.0;
            String ans = (n + " x 10 ^ " + i);
            return ans;
        } else {
            n = ((int) (n * 1000000)) / 1000000.0;
            String ans = n + " x 10 ^ 0";
            return ans;
        }


    }

    public static int findSpaces(double n) {
        String text = Double.toString(Math.abs(n));
        int integerPlaces = text.indexOf('.');
        int decimalPlaces = text.length() - integerPlaces - 1;
        return decimalPlaces;
    }


}
