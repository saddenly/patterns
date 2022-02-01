package creational.builder;

public class Manual {
    public void describeSeats(int seats) {
        System.out.println("Данный тип машин имеет " + seats + " количество мест");
    }

    public void describeEngine(Engine engine) {
        System.out.println("Данный тип машин имеет " + engine + " тип двигателя");
    }

    public void describeTripComputer(boolean tripComputer) {
        if (tripComputer) {
            System.out.println("Данный тип машин имеет tripComputer");
        } else {
            System.out.println("Данный тип машин не имеет tripComputer");
        }
    }

    public void describeGPS(boolean gps) {
        if (gps) {
            System.out.println("Данный тип машин имеет GPS");
        } else {
            System.out.println("Данный тип машин не имеет GPS");
        }
    }
}