/**
 * Created by jay on 2017/2/24.
 */
public class FighterJet implements Vehicle{
    @Override
    public String name() {
        return "F-15";
    }

    @Override
    public int maxPassengers() {
        return 2;
    }

    @Override
    public int maxSpeed() {
        return 1875;
    }

    @Override
    public int numWheels() {
        return 3;
    }

    @Override
    public String startEngine() {
        return "Whoosh!";
    }

    @Override
    public boolean canFly() {
        return true;
    }
    String sonicBoom(int currentSpeed){
        if (currentSpeed>761)
            return "BOOM!!";
        return "Whoosh!";
    }
}
