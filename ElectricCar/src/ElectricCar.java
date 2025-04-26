public class ElectricCar {
    String make;
    int year;
    double chargeRange;

    public ElectricCar(String make, int year, double chargeRange)
    {
        this.make = make;
        this.year = year;
        this.chargeRange = chargeRange;
    }

    public void addCharge(int charge)
    {
        chargeRange+= charge;
    }

    public void displayRange()
    {
        System.out.println("Your car has a range of " + chargeRange + "miles.");
    }
}

