package Vehicles;

import Types.EngineType;

/**
 * Created by jay on 4/18/17.
 */
public class VehicleImpl implements Vehicle {
    private String vehicleName;
    private EngineType engineType;
    private float topSpeed;

    public VehicleImpl(String vehicleName, EngineType engineType, float topSpeed) {
        this.vehicleName = vehicleName;
        this.engineType = engineType;
        this.topSpeed = topSpeed;
    }

    @Override
    public String getVehicleName() {
        return vehicleName;
    }

    @Override
    public float getTopSpeed() {
        return topSpeed;
    }

    @Override
    public EngineType getEngineType() {
        return engineType;
    }
}
