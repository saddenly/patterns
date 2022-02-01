package creational.builder;

public class Car {
    private Engine engineType;
    private int seats;
    private boolean gps;
    private boolean tripComputer;

    public Engine getEngineType() {
        return engineType;
    }

    public void setEngineType(Engine engineType) {
        this.engineType = engineType;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineType=" + engineType +
                ", seats=" + seats +
                ", gps=" + gps +
                ", tripComputer=" + tripComputer +
                '}';
    }
}