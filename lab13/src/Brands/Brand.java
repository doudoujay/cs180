package Brands;

import Types.OriginType;
import Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jay on 4/18/17.
 */
public abstract class Brand {
    List<Vehicle> vehicleList = new ArrayList<>();
    String brandName;
    public Brand(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
    public int getNumVehicles(){
        return vehicleList.size();
    }
    public void addVehicleToList(Vehicle vehicle){
        this.vehicleList.add(vehicle);
    }

    public List<Vehicle> getVehiclesList() {
        return vehicleList;
    }
    public Vehicle getFastestVehicle(){
        ArrayList<Float> list = new ArrayList<Float>();
        for (Vehicle v:vehicleList
             ) {
            list.add(v.getTopSpeed());
        }
        float limit = list.size();
        float max = Integer.MIN_VALUE;
        int maxPos = -1;
        for (int i = 0; i < limit; i++) {
            float value = list.get(i);
            if (value > max) {
                max = value;
                maxPos = i;
            }
        }

        return vehicleList.get(maxPos);
    }
    public abstract OriginType getBrandOrigin();
    public abstract void createVehicleList();
}

