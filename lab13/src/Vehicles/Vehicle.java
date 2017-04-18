package Vehicles;

import Types.EngineType;

/**
 * Created by jay on 4/18/17.
 */
public interface Vehicle {
    String getVehicleName();
    float getTopSpeed();
    EngineType getEngineType();
}
