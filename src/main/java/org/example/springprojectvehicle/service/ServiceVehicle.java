package org.example.springprojectvehicle.service;


import io.swagger.v3.oas.annotations.tags.Tag;

import org.example.springprojectvehicle.dao.VehicleDao;
import org.example.springprojectvehicle.modele.Vehicle;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
@Tag(name = "tag_at_class_Servicev-Vehicle",description = "")
@Service
public class ServiceVehicle implements VehicleDao {


    public ServiceVehicle() throws ParseException {
    }

    public static List<Vehicle> Vehicles = new ArrayList<>();

    @Override
    public List<Vehicle> findAll() {
        return Vehicles;
    }

    @Override
    public Vehicle findById(int id) {
        for  (Vehicle vehicle : Vehicles) {
            if(vehicle.getId() == id) {
                return vehicle;
            }
        }
        return null;
    }

    @Override
    public Vehicle save(Vehicle vehicle) {
        int lastId = Vehicles.get(Vehicles.size() - 1).getId();
        int nextId = lastId + 1;
        vehicle.setId(nextId);
        Vehicles.add(vehicle);
        return vehicle;
    }

    //recuperer le vehicle pour l'update
    @Override
    public Vehicle update(Vehicle vehicle,int id) {
        for  (Vehicle updateVehicle : Vehicles) {
            if(updateVehicle.getId() == id) {
                updateVehicle.setBrand(vehicle.getBrand());
                updateVehicle.setModel(vehicle.getModel());
                updateVehicle.setColor(vehicle.getColor());
                updateVehicle.setHorsePower(vehicle.getHorsePower());
                updateVehicle.setImmatriculation(vehicle.getImmatriculation());
                updateVehicle.setKilometricPrice(vehicle.getKilometricPrice());
                updateVehicle.setReservationPrice(vehicle.getReservationPrice());
            }
        }
        return vehicle;
    }

    @Override
    public Vehicle deleteById(int id){
        Vehicles.remove(findById(id));
         if(findById(id) == null){
             return null;
         }
         System.out.println("didnt find the vehicle at id: " + id);
        return null;
    }
}