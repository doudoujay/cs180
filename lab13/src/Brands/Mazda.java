package Brands;

import Types.BrandNames;
import Types.OriginType;
import Vehicles.Vehicle;
import Vehicles.VehicleDataGenerator;

import java.util.List;

/**
 * Created by jay on 4/18/17.
 */
public class Mazda extends Brand {
    public Mazda() {
        super(BrandNames.Mazda.name());
    }

    @Override
    public OriginType getBrandOrigin() {
        return OriginType.JAPAN;
    }

    @Override
    public void createVehicleList() {
        List<Vehicle> vehicles = VehicleDataGenerator.getInstance().getMazdaCars();
        for (Vehicle v : vehicles
                ) {
            addVehicleToList(v);
        }
    }
}
