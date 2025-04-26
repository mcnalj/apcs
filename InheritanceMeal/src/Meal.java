public class Meal
{
    public String entree;
    public double mealCost;

    public Meal(String entree, double mealCost)
    {
        this.entree = entree;
        this.mealCost = mealCost;
    }

    public String toString()
    {
        return entree + " meal, $" + mealCost;
    }
}