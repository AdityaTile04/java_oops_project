public class Main {
    public static void main(String[] args) {

    }
}

class Car {
    private String carId;
    private String brand;
    private String model;
    private double basePricePerDay;
    private boolean isAvailale;

    public Car(String carId, String brand, String model, double basePricePerDay) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.basePricePerDay = basePricePerDay;
        this.isAvailale = true;
    }

    public String getCarId() {
        return carId;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double calculatePrice(int rentalDays) {
        return basePricePerDay * rentalDays;
    }
    public boolean isAvailale() {
        return isAvailale;
    }
    public void rent() {
        isAvailale = false;
    }
    public void returnCar() {
        isAvailale = true;
    }



}