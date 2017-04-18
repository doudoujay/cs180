package Brands;

import Types.BrandNames;
import Types.OriginType;
import Vehicles.Vehicle;
import Vehicles.VehicleDataGenerator;

import java.util.List;

/**
 * Created by jay on 4/18/17.
 */
public class Maserati extends Brand {
    public Maserati() {
        super(BrandNames.Maserati.name());
    }

    @Override
    public OriginType getBrandOrigin() {
        return OriginType.ITALY;
    }

    @Override
    public void createVehicleList() {
        List<Vehicle> vehicles = VehicleDataGenerator.getInstance().getMaseratiCars();
        for (Vehicle v: vehicles
                ) {
            addVehicleToList(v);
        }
    }
}
