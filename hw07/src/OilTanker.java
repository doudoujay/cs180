/**
 * Created by jay on 2017/2/24.
 */
public class OilTanker implements Vehicle {
    @Override
    public String name() {
        return "Oil Tanker";
    }

    @Override
    public int maxPassengers() {
        return 30;
    }

    @Override
    public int maxSpeed() {
        return 20;
    }

    @Override
    public int numWheels() {
        return 0;
    }

    @Override
    public String startEngine() {
        return "Brum Brum!";
    }

    @Override
    public boolean canFly() {
        return false;
    }
    double maxOilCarried(double radius, double height){
        return Math.PI*Math.pow(radius,2)*height;
    }
}
