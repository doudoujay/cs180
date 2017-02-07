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
            result = (double) 1.0 / result;
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
        } else {
            double x1 = value;
            double x2 = value / root;
            while (Math.abs(x1 - x2) > 0.000000001)
            {
                x1 = x2;
                x2 = ((root- 1.0) * x2 + value / Math.pow(x2, root - 1.0)) / root;
            }
            return x2;
        }


    }


    public static String scientificNotation(double n) {
        double coef = n;
        int exponent = 0;
        double abs = absoluteValue(n);
        int a = findSpaces(coef);
        if (abs < 1) {

           while (a <= 6){
                exponent = exponent - 1;
                n = n * 10;
                a--;
            }
            return (coef + " x 10 ^ " + exponent);
        }

        if (abs >= 10) {
            while (a <= 6) {
                exponent = exponent + 1;
                coef = coef / 10;
                a++;
            }
            return (coef + " x 10 ^ " + exponent);

        }

        return (coef + " x 10 ^ " + exponent);


    }

    public static int findSpaces(double n) {
        String text = Double.toString(Math.abs(n));
        int integerPlaces = text.indexOf('.');
        int decimalPlaces = text.length() - integerPlaces - 1;
        return decimalPlaces;
    }

    public static double calculateNext(int n, double initialGuess, double value) {
        return (double) ((double) (n - 1) * initialGuess + value / power(initialGuess, (n - 1))) / (double) n;
    }
}
