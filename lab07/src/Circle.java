/**
 * Created by ma438 on 2/28/17.
 */
public class Circle implements Shape{
    String name = "Circle";
    double radius;
    double perimeter;
    double area;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void findPerimeter() {
        perimeter = Math.PI * 2* radius;
    }

    @Override
    public void findArea() {
        area = Math.PI * Math.pow(radius,2);
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
