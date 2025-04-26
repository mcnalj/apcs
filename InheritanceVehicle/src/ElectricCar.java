public class ElectricCar extends Car {
    
    private int range;

    public ElectricCar(String make, int year, int range) {
        super(make, year);
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    public String drive() {
        return "Whoa, that's a cool spaceship sound!";
    }

    public String driveLikeAGasCar() {
        return super.drive();
    }
}




