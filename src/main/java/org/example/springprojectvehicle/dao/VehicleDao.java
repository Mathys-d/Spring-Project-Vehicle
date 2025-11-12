package org.example.springprojectvehicle.dao;

import org.example.springprojectvehicle.modele.Vehicle;

import java.util.List;

public interface VehicleDao {
    List<Vehicle> findAll();
    Vehicle findById(int id);
    Vehicle save(Vehicle vehicle);
    Vehicle update(Vehicle vehicle, int id);
    Vehicle deleteById(int id);
}