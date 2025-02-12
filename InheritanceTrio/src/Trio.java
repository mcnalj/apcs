public class Trio extends MenuItem
{
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    
    public Trio(Sandwich sando, Salad sld,  Drink dk)
    {
        sandwich = sando;
        salad = sld;
        drink = dk;
    }

    public double calculatePrice(Salad sld, Sandwich sando, Drink dk)
    {
        
        double price = 0;
        if (sld.getPrice() < sando.getPrice())
        {
            price = price + sando.getPrice();
            if (sld.getPrice() < dk.getPrice())
            {
                price = price + dk.getPrice();
            } else {
                price = price + sld.getPrice();
            }
        } else {
            price = price + sld.getPrice();
            if (sando.getPrice() < dk.getPrice())
            {
                price = price + dk.getPrice();
            }
            else
            {
                price = price + sld.getPrice();
            }
        }
        return price; 
    }
}
