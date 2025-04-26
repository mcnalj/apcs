public class App {
    public static void main(String[] args) throws Exception {
        ElectricCar car = new ElectricCar("Kia", 2020, 320);
        System.out.println(car.getRange());
        System.out.println(car.getMake());
        System.out.println(car.getYear());
        System.out.println(car.drive());
        System.out.println(car.driveLikeAGasCar());
    }
}
