import java.util.Objects;

/**
 * Created by jay on 2017/2/16.
 */
public class Bug {
    private int Position;
    private String Direction = "right";

    public String getDirection() {
        return Direction;
    }

    public int getPosition() {
        return Position;
    }

    public Bug(int initialPosition) {
        this.Position = initialPosition;

    }

    public void turn() {
        if (this.Direction.equals("right"))
            this.Direction = "left";
        else
            this.Direction = "right";
    }

    public void move() {


        if (this.Direction.equals("right"))
            this.Position++;
        else
            this.Position--;
    }
}
