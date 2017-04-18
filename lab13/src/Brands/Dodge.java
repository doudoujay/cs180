package Brands;

import Types.BrandNames;
import Types.OriginType;
import Vehicles.Vehicle;
import Vehicles.VehicleDataGenerator;

import java.util.List;

/**
 * Created by jay on 4/18/17.
 */
public class Dodge extends Brand {
    public Dodge() {
        super(BrandNames.Dodge.name());
    }

    @Override
    public OriginType getBrandOrigin() {
        return OriginType.UNITED_STATES;
    }

    @Override
    public void createVehicleList() {
        List<Vehicle> vehicles = VehicleDataGenerator.getInstance().getDodgeCars();
        for (Vehicle v: vehicles
                ) {
            addVehicleToList(v);
        }

    }
}
