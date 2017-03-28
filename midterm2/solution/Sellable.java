/**
 * Representation of an object that can be sold.
 *
 * @author Logan Kulinski
 * @version March 21, 2017
 */
public interface Sellable {
    /**
     * Gets the wholesale price of the item.
     *
     * @return the wholesale price of the item
     */
    double getWholesalePrice();

    /**
     * Gets the retail price of the item.
     *
     * @return the wholesale price of the item
     */
    double getRetailPrice();
}