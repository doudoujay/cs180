/**
 * Created by ma438 on 2/28/17.
 */
public class Rectangle implements Shape {
    String name = "rectangle";
    double[] sides = new double[2];
    double perimeter;
    double area;

    public Rectangle(double a, double b) {
        this.sides[0] = a;
        this.sides[1] = b;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void findPerimeter() {
        perimeter = 2 * (sides[0] + sides[1]);
    }

    @Override
    public void findArea() {
        area = sides[0] * sides[1];

    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public double getArea() {
        return area;
    }
}
