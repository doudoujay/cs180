/**
 * Created by ma438 on 2/28/17.
 */
public class Triangle implements Shape {
    String name = "triangle";
    double[] sides = new double[3];
    double perimeter;
    double area;
    String type;

    public Triangle(double a, double b, double c) {
        this.sides[0] = a;
        this.sides[1] = b;
        this.sides[2] = c;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void findPerimeter() {
        if(isValidTriangle()){
            for (double s : sides) {
                perimeter += s;
            }
        }

    }

    @Override
    public void findArea() {
        if(isValidTriangle()){
            double s = (sides[0] + sides[1] + sides[2]) / 2;
            area = Math.sqrt(s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]));
        }

    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public double getArea() {
        return area;
    }

    public boolean isValidTriangle() {
        double sum1 = sides[0] + sides[1];
        double sum2 = sides[1] + sides[2];
        double sum3 = sides[2] + sides[0];
        return (sum1 >= sides[2] && sum2 >= sides[0] && sum3 >= sides[1]);
    }

    public void findType() {
        if (sides[0] == sides[1] && sides[1] == sides[2]) {
            type = "equilateral";
            return;
        }
        if (sides[0] != sides[1] && sides[1] != sides[2] && sides[2] != sides[0]) {
            type = "scalene";
            return;
        }
        type = "isosceles";

    }
}
