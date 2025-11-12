package org.example.springprojectvehicle;

import org.example.springprojectvehicle.modele.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Integer>{
}