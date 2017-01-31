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
            double initialGuess = value;
            if (root < 0) {
                initialGuess = (double) 1 / value;
            }
            double nextGuess = calculateNext(root, initialGuess, value);
            double change = nextGuess - initialGuess;
            while (change > 0.000000001) {
                initialGuess = nextGuess;
                nextGuess = calculateNext(root, initialGuess, value);
                change = nextGuess - initialGuess;
            }
            return nextGuess;
        }


    }

    public static String scientificNotation(double n) {
        double coef = n;
        int exponent = 0;
        double abs = absoluteValue(n);

        if (abs < 1) {
            while (findSpaces(n) < 6) {
                exponent = exponent - 1;
                coef = coef * 10;
            }
            return (n + " x 10 ^ " + exponent);
        }

        if (abs >= 10) {
            while (findSpaces(n) < 6) {
                exponent = exponent + 1;
                coef = coef / 10;

            }
            return (n + " x 10 ^ " + exponent);

        }

        return (n + " x 10 ^ " + exponent);


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
