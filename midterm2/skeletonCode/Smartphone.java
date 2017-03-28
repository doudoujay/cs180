public class Smartphone extends Device {
    private int numApps;
    private int storageCapacity;

    /**
     * Constructs a newly allocated {@code Device} object.
     *
     * @param wholesalePrice the wholesale price of the device
     * @param retailPrice    the retail price of the device
     */
    public Smartphone(double wholesalePrice, double retailPrice, int numApps, int storageCapacity) {
        super(wholesalePrice, retailPrice);
        this.numApps = numApps;
        this.storageCapacity = storageCapacity;
    }

    public int getNumApps() {
        return numApps;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void downloadNewApp() throws NotEnoughStorageException {
        if(numApps<storageCapacity){
            numApps++;
        }else{
            throw new NotEnoughStorageException("No enought storage");
        }
    }

}