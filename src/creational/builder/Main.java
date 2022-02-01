package creational.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        ManualBuilder manualBuilder = new ManualBuilder();

        director.constructSportsCar(builder);
        Car sportsCar = builder.getResult();
        director.constructRegularCar(builder);
        Car regularCar = builder.getResult();

        director.constructSportsCarManual(manualBuilder);

        System.out.println(sportsCar.toString());
        System.out.println(regularCar.toString());
    }
}