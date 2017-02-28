/**
 * Created by ma438 on 2/28/17.
 */
public class Tester {
    Shape[] shapes;
    int numShapes;
    void findPerimeters(){
        for(int i=0; i<numShapes;i++){
            shapes[i].findPerimeter();;
        }
    }
    void findArea(){
        for(int i=0; i<numShapes;i++){
            shapes[i].findArea();
        }
    }
    void print(){
        System.out.println("Name Perimeter Area");
        for(int i=0; i<numShapes;i++){
            System.out.println(shapes[i].getName()+" "+shapes[i].getPerimeter()+" "+shapes[i].getArea());
        }
    }
    public static void main(String[] args) {
        Tester t =new Tester();
        t.shapes = new Shape[3];
        t.numShapes = 3;
        t.shapes[0] = new Triangle(3,4,5);
        t.shapes[1] = new Rectangle(2,1);
        t.shapes[2] = new Circle(1);
        t.findArea();
        t.findPerimeters();
        t.print();

    }
}
