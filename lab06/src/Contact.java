/**
 * Created by jay on 2/21/17.
 */
public class Contact {
    private String name;
    private long number;
    private String address;

    public Contact(String name) {
        this.name = name;
        this.number = 0;
        this.address = null;
    }

    public Contact(String name, long number) {
        this.name = name;
        this.number = number;
        this.address = null;
    }

    public Contact(String name, long number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //    The two Contacts are equal if they have the same name
    public boolean equals(Contact contact) {
        return (this.name.equals(contact.getName()));
    }

}
