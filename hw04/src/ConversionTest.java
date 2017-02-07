import junit.framework.TestCase;

/**
 * Created by jay on 2017/2/3.
 */
public class ConversionTest extends TestCase {
    public void testBinaryToDecimal() {
        Conversion obj = new Conversion();
        assertEquals(72, obj.binaryToDecimal(1001000));
        assertEquals(88, obj.binaryToDecimal(1011000));

    }

    public void testDecimalToBinary() {
        Conversion obj = new Conversion();
        assertEquals(1110001, obj.decimalToBinary(113));
        assertEquals(1000000, obj.decimalToBinary(64));
    }
}
