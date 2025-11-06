package org.example.springprojectvehicle;

import java.util.List;

public interface VehicleDao {
    List<Vehicle> findAll();
    Vehicle findById(int id);
    Vehicle save(Vehicle Vehicle);
    Vehicle delete(int id);
}