/**
 * Created by jay on 2/21/17.
 */
public class AddressBook {
    private int totalContacts;    // The total number of Contacts currently in this AddressBook
    private int maxContacts;      // The maximum number of Contacts this AddressBook can hold
    private Contact[] contacts;   // The array that holds the Contacts of this AddressBook

    /**
     * Constructor. Sets the initial size of the AddressBook to hold 10 Contacts.
     */
    public AddressBook() {
        this.maxContacts = 10;
        this.contacts = new Contact[maxContacts];
        this.totalContacts = 0;
    }

    /**
     * Adds the specified Contact to this AddressBook at the end of the contacts array. If
     * the Contact already exists, it updates its phone number if the argument's number is not 0 and
     * address if the argument's address is not null. If the totalContacts reaches the
     * maxContacts, then the contacts array is doubled in size and maxContacts is doubled
     * before the new Contact is added.
     *
     * @param contact The Contact to add to this AddressBook
     * @return true if the Contact was added, false otherwise
     */
    public boolean addContact(Contact contact) {

        if (contains(contact)) {
            for (int i = 0; i<maxContacts;i++){
                if (contacts[i].equals(contact)){
                    if(contact.getNumber() != 0 && contact.getAddress() != null)
                        contacts[i] = contact;
                    return false;
                }
            }
        }
        if (totalContacts == maxContacts) {
            this.maxContacts = this.maxContacts * 2;
            Contact[] tempContacts = this.contacts;
            this.contacts = new Contact[maxContacts];
            for (int i = 0; i<tempContacts.length;i++){
                this.contacts[i] = tempContacts[i];
            }

        }
//        Adds the specified Contact to this AddressBook at the end of the contacts array.
        this.contacts[totalContacts] = contact;
        totalContacts++;
        return true;

    }

    /**
     * Removes the specified Contact from this AddressBook and moves all entries
     * that follow it in the contacts array to the left so that there are no empty
     * entries between Contacts. For example:
     * <p>
     * before -> {C1, C2, C3, C4, C5, C6, C7, C8, C9, null}
     * remove C6
     * after -> {C1, C2, C3, C4, C5, C7, C8, C9, null, null}
     *
     * @param contact The Contact to remove from this AddressBook
     * @return true if the Contact was removed, false otherwise
     */
    public boolean removeContact(Contact contact) {
        if(contains(contact)){
            int target=0;
            for(int i = 0;i<maxContacts;i++){
                if (contacts[i].equals(contact)){
                    target = i;
                    break;
                }
            }
            for (int j = target;j<maxContacts-1;j++){
                contacts[j] = contacts[j+1];
            }
//            contacts[maxContacts-1] = null;
            this.totalContacts--;
            return true;
        }
        return false;
    }

    /**
     * Gets a Contact by the specified name from this AddressBook.
     *
     * @param name The name of the Contact to get
     * @return The Contact if they are found, null otherwise
     */
    public Contact getContactByName(String name) {
        Contact compareObj = new Contact(name);
        for (int i = 0; i < totalContacts; i++) {
            if (contacts[i].equals(compareObj))
                return contacts[i];
        }
        return null;
    }

    /**
     * Checks if the given contact is already in this AddressBook.
     *
     * @param contact The contact to find
     * @return True if the contact is found, false otherwise
     */
    public boolean contains(Contact contact) {

        for (Contact c : this.contacts) {
            if (c != null && c.equals(contact))
                return true;
        }
        return false;
    }

    /**
     * Prints all the Contacts in this AddressBook.
     */
    public void printAddressBook() {
        for (int i = 0; i < this.totalContacts; i++) {
            System.out.printf("Name: %s%n", this.contacts[i].getName());
            System.out.printf("Number: %d%n", this.contacts[i].getNumber());
            System.out.printf("Address: %s%n%n", this.contacts[i].getAddress());
        }
    }

}