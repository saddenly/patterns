package creational.builder;

public class CarBuilder implements Builder{
    private Car car;

    public void reset() {
        car = new Car();
    }

    public void setSeats(int seats) {
        car.setSeats(seats);
    }

    public void setEngine(Engine engine) {
        car.setEngineType(engine);
    }

    public void setTripComputer(boolean tripComputer) {
        car.setTripComputer(tripComputer);
    }

    public void setGPS(boolean gps) {
        car.setGps(gps);
    }

    public Car getResult() {
        return car;
    }
}