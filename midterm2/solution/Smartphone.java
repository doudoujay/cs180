/**
 * Representation of a smartphone.
 *
 * @author Logan Kulinski
 * @version March 21, 2017
 */
public class Smartphone extends Device {
    /**
     * The number of apps on the smartphone.
     */
    private int numApps;

    /**
     * The storage capacity of the smartphone.
     */
    private int storageCapacity;

    /**
     * Constructs a newly allocated {@code Smartphone} object.
     *
     * @param wholesalePrice the wholesale price of the smartphone
     * @param retailPrice the retail price of the smartphone
     * @param numApps the number of apps on the smartphone
     * @param storageCapacity the storage capacity of the smartphone
     */
    public Smartphone(double wholesalePrice, double retailPrice, int numApps, int storageCapacity) {
        //initialize fields
        super(wholesalePrice, retailPrice);
        this.numApps = numApps;
        this.storageCapacity = storageCapacity;
    } //Smartphone

    /**
     * Gets the number of apps on the smartphone.
     *
     * @return the number of apps on the smartphone
     */
    public int getNumApps() {
        return this.numApps;
    } //getNumApps

    /**
     * Gets the storage capacity of the smartphone.
     *
     * @return the storage capacity of the smartphone
     */
    public int getStorageCapacity() {
        return this.storageCapacity;
    } //getStorageCapacity

    /**
     * Attempts to download an app to the smartphone.
     *
     * @throws NotEnoughStorageException if the smartphone does not have enough storage to download the app
     */
    public void downloadNewApp() throws NotEnoughStorageException {
        //determine if numApps is less than storageCapacity
        if (this.numApps < this.storageCapacity) {
            //increment numApps
            this.numApps++;
        } else {
            throw new NotEnoughStorageException("not enough storage on this smartphone to download another app");
        } //end if
    } //downloadNewApp
}