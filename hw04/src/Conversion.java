/**
 * Created by jay on 2/3/17.
 */
public class Conversion {
    /*converts the parameter binary from base 2 to its decimal (base 10) equivalent and returns the decimal equivalent.*/
    int binaryToDecimal(int binary) {
        int result = 0;
        int exp = 0;
        int length = (int) (Math.log10(binary) + 1);
        while (exp < length) {
            int lastDigit = binary % 10;
            binary = binary / 10;
            if (lastDigit != 0) {
                result = (int) (result + (Math.pow(2, exp)));
            }

            exp++;
        }

        return result;

    }

    /*converts the parameter decimal from base 10 to its binary (base 2) equivalent and returns the binary equivalent.*/
    int decimalToBinary(int decimal) {
        int result = 0;
        int exp = 0;
        while (decimal != 0) {
            int lastDigit = decimal % 2;
            decimal = decimal / 2;
            if (lastDigit != 0) {
                result = (int) (result + (Math.pow(10, exp)));
            }

            exp++;
        }

        return result;
    }


}
