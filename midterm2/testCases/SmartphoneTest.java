import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test cases for the {@code Smartphone} class.
 *
 * @author Logan Kulinski
 * @version March 21, 2017
 */
public class SmartphoneTest {
    private Smartphone smartphone;

    @Before
    public void setUp() {
        smartphone = new Smartphone(299.0, 699.0, 9, 10);
    } //setUp

    @Test
    public void testGetWholesalePrice() throws Exception {
        assertEquals("make sure your getWholesalePrice() method is returning the correct value!", 299.0, smartphone.getWholesalePrice(), 0.00001);
    } //testGetWholesalePrice

    @Test
    public void testGetRetailPrice() throws Exception {
        assertEquals("make sure your getRetailPrice() method is returning the correct value!", 699.0, smartphone.getRetailPrice(), 0.00001);
    } //testGetRetailPrice

    @Test
    public void testDownloadNewAppOne() throws Exception {
        smartphone.downloadNewApp();
        assertEquals("make sure your downloadNewApp() method increments numApps by one!", 10, smartphone.getNumApps());
    } //testDownloadNewAppOne

    @Test(expected = NotEnoughStorageException.class)
    public void testDownloadNewAppTwo() throws Exception {
        smartphone.downloadNewApp();
        smartphone.downloadNewApp();
        fail("make sure downloadNewApp() throws a NotEnoughStorageException when the smartphone cannot hold any more apps!");
    } //testDownloadNewAppTwo
}