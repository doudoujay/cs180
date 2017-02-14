/**
 * Created by jay on 2017/2/9.
 */
public class Tree {
    int serial;
    double circumference;
    String species;

    Tree(int serial, double circumference, String species) {
        this.serial = serial;
        this.circumference = circumference;
        this.species = species;
    }

    String describe() {
        return String.format("Tree number %d has a circumference of %.2f and is of species %s.", serial, circumference, species);
    }

    double getDiameter() {
        return circumference / Math.PI;
    }

    double getCircumference() {
        return circumference;
    }

}
