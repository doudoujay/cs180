/**
 * Solution to Q1 of practice midterm test
 * @author Sahil Pujari (pujari@purdue.edu)
 */
class Bug {
    //Directions possible to move to
    private final String[] DIRECTIONS = {"right", "left"};

    private int position; //Current position
    private String directionHeaded; //Direction headed towards currently
    private int directionFactor = 1; //Used to compute position with respect to direction
    private int currentDirectionIndex = 0; //Used to track current direction

    public Bug(int initialPosition) {
        position = initialPosition;
        directionHeaded = DIRECTIONS[currentDirectionIndex];
    }

    /**
     * Turn to the opposite direction
     */
    public void turn() {
        //Compute the new opposite direction
        currentDirectionIndex = Math.abs(currentDirectionIndex - 1);
        //Initialize the direction headed towards
        directionHeaded = DIRECTIONS[currentDirectionIndex];
        //Update the factor used to calculate position with respect to direction
        directionFactor *= -1;
    }

    /**
     * Move by a factor of 1 also respecting direction at the same time
     */
    public void move() {
        position += directionFactor;
    }

    /**
     * Get current position
     * @return
     */
    public int getPosition() {
        return position;
    }

    /**
     * Get current direction
     * @return
     */
    public String getDirection() {
        return directionHeaded;
    }

    /**
     * Overriding the toString method to print the attributes of object
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Now the position is ").append(position).append(" ");
        sb.append("and direction is ").append(DIRECTIONS[currentDirectionIndex]);

        return sb.toString();
    }
}
