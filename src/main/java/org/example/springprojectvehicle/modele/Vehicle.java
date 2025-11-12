package org.example.springprojectvehicle.modele;

public class Vehicle {
    private int id;
    private String immatriculation;
    private String brand;
    private String model;
    private String color;
    private int reservationPrice;
    private int kilometricPrice;
    private int horsePower;

    public Vehicle() {
    }

    public Vehicle(int id, String immatriculation, String brand, String model, String color, int reservationPrice, int kilometricPrice, int horsePower) {
        this.id = id;
        this.immatriculation = immatriculation;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.reservationPrice = reservationPrice;
        this.kilometricPrice = kilometricPrice;
        this.horsePower = horsePower;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getReservationPrice() {
        return reservationPrice;
    }

    public void setReservationPrice(int reservationPrice) {
        this.reservationPrice = reservationPrice;
    }

    public int getKilometricPrice() {
        return kilometricPrice;
    }

    public void setKilometricPrice(int kilometricPrice) {
        this.kilometricPrice = kilometricPrice;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", immatriculation='" + immatriculation + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", reservationPrice=" + reservationPrice +
                ", kilometricPrice=" + kilometricPrice +
                ", horsePower=" + horsePower +
                '}';
    }
}