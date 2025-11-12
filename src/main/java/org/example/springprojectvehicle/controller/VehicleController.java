package org.example.springprojectvehicle.controller;

import org.example.springprojectvehicle.VehicleRepository;
import org.example.springprojectvehicle.modele.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class VehicleController {
    @Autowired
    private VehicleRepository vehicleRepository;

    public VehicleController() {}

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }


    @RequestMapping("/Vehicle/{id}")
    public Optional<Vehicle> requestVehiclesById(@PathVariable int id) {
        return vehicleRepository.findById(id);
    }

    @GetMapping("/Vehicle")
    public Iterable<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @GetMapping("/Vehicle/{id}")
    public Optional<Vehicle> getVehiclesById(@PathVariable int id) {
        return vehicleRepository.findById(id);
    }


    @PostMapping("/Vehicle")
    public Vehicle addVehicle(
            @RequestBody Vehicle vehicle
    ) throws Exception {
        return vehicleRepository.save(vehicle);
    }

    @PutMapping("/Vehicle/{id}")
    Vehicle replaceVehicle(@RequestBody Vehicle newVehicle, @PathVariable int id) {
        newVehicle.setId(id);
        return vehicleRepository.save(newVehicle);
    }

    @DeleteMapping("/Vehicle/{id}")
    public void deleteVehicleById(@PathVariable int id) {
        vehicleRepository.deleteById(id);
    }
}