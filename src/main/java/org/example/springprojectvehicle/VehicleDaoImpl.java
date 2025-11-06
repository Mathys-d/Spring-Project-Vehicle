package org.example.springprojectvehicle;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VehicleDaoImpl implements VehicleDao{
    public static List<Vehicle> Vehicles = new ArrayList<>();

    static {
        Vehicles.add(new Vehicle());
        Vehicles.add(new Vehicle());
        Vehicles.add(new Vehicle());
    }

    @Override
    public List<Vehicle> findAll() {

        return Vehicles;
    }

    @Override
    public Vehicle findById(int id) {
        for (Vehicle Vehicle : Vehicles){
            if (Vehicle.getId() == id){
                return Vehicle;
            }
        }
        return null;
    }

    @Override
    public Vehicle save(Vehicle Vehicle) {
        Vehicles.add(Vehicle);
        return Vehicle;
    }

    @Override
    public Vehicle delete(int id) {
        for (Vehicle Vehicle : Vehicles){
            if (Vehicle.getId() == id){
                Vehicles.remove(id);
            }
        }
        return null;
    }
}