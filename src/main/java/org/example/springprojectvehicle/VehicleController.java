package org.example.springprojectvehicle;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {

    private final VehicleDao vehicleDao;

    public VehicleController(VehicleDao vehicleDao) {

        this.vehicleDao = vehicleDao;
    }

    @GetMapping("/Vehicles")
    public List<Vehicle> listVehicles() {
        return vehicleDao.findAll();
    }

    @GetMapping(value = "/Vehicles/{id}")
    public Vehicle displayVehicle(@PathVariable int id) {
        Vehicle vehicle = new Vehicle(id, "AB-123-CD", "Honda", "Civic", "Grey", 5000, 400, 7);
        return vehicleDao.findById(id);
        // ou : return vehicle = new Vehicle();
        // return "Voici le vehicle possédant l'id " + id + " : Vehicle " + id;
    }

    @PostMapping(value = "/Vehicles")
    public void addVehicle(@RequestBody Vehicle vehicle) {
        vehicleDao.save(vehicle);
    }

    @DeleteMapping(value = "/Vehicles/{id}")
    public Vehicle removeVehicle(@PathVariable int id) {
        return vehicleDao.delete(id);
    }
}
