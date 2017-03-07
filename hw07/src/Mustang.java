/**
 * Created by jay on 2017/2/24.
 */
public class Mustang implements Vehicle {
    @Override
    public String name() {
        return "Mustang";
    }

    @Override
    public int maxPassengers() {
        return 4;
    }

    @Override
    public int maxSpeed() {
        return 180;
    }

    @Override
    public int numWheels() {
        return 4;
    }

    @Override
    public String startEngine() {
        return "Vroom Vroom!";
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
