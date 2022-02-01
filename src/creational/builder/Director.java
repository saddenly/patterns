package creational.builder;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(Engine.SPORTS_ENGINE);
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void constructRegularCar(Builder builder) {
        builder.reset();
        builder.setSeats(5);
        builder.setEngine(Engine.REGULAR_ENGINE);
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void constructSportsCarManual(Builder manualBuilder) {
        manualBuilder.reset();
        manualBuilder.setSeats(2);
        manualBuilder.setEngine(Engine.SPORTS_ENGINE);
        manualBuilder.setTripComputer(true);
        manualBuilder.setGPS(true);
    }
}