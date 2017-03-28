/**
 * An Exception used if there is not enough storage on a {@code Smartphone} object.
 *
 * @author Logan Kulinski
 * @version March 21, 2017
 */
public class NotEnoughStorageException extends Exception {
    /**
     * Constructs a newly allocated {@code NotEnoughStorageException} object.
     *
     * @param message the message displayed when the exception is thrown
     */
    public NotEnoughStorageException(String message) {
        //initialize field
        super(message);
    } //NotEnoughStorageException
}