/**
 * Representation of an electronic device.
 *
 * @author Logan Kulinski
 * @version March 21, 2017
 */
public class Device implements Sellable {
    /**
     * The wholesale price of the device.
     */
    private double wholesalePrice;

    /**
     * The retail price of the device.
     */
    private double retailPrice;

    /**
     * Constructs a newly allocated {@code Device} object.
     *
     * @param wholesalePrice the wholesale price of the device
     * @param retailPrice the retail price of the device
     */
    public Device(double wholesalePrice, double retailPrice) {
        //initialize fields
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
    } //Device

    @Override
    public double getWholesalePrice() {
        return this.wholesalePrice;
    } //getWholesalePrice

    @Override
    public double getRetailPrice() {
        return this.retailPrice;
    } //getRetailPrice
}