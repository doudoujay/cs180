package Brands;

import Types.BrandNames;
import Types.OriginType;
import Vehicles.Vehicle;
import Vehicles.VehicleDataGenerator;

import java.util.List;

/**
 * Created by jay on 4/18/17.
 */
public class Audi extends Brand {
    public Audi() {
        super(BrandNames.Audi.name());
    }

    @Override
    public OriginType getBrandOrigin() {
        return OriginType.GERMANY;
    }

    @Override
    public void createVehicleList() {
        List<Vehicle> vehicles = VehicleDataGenerator.getInstance().getAudiCars();
        for (Vehicle v: vehicles
             ) {
            addVehicleToList(v);
        }

    }
}
