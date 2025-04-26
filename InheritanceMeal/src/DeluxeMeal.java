public class DeluxeMeal extends Meal
{
    String side;
    String drink;

    public DeluxeMeal(String entree, String side, String drink, double mealCost)
    {
        super(entree, mealCost);
        this.side = side;
        this.drink = drink;
    }

    public String toString()
    {
        double mealCost = super.mealCost + 3.00;
        return "Deluxe " + entree + " meal, $" + mealCost; 
    }
}
