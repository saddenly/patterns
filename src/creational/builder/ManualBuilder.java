package creational.builder;

public class ManualBuilder implements Builder {
    private Manual manual;

    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setSeats(int seats) {
        manual.describeSeats(seats);
    }

    @Override
    public void setEngine(Engine engine) {
        manual.describeEngine(engine);
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        manual.describeTripComputer(tripComputer);
    }

    @Override
    public void setGPS(boolean gps) {
        manual.describeGPS(gps);
    }
}