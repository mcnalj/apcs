public class App {
    public static void main(String[] args) throws Exception {

        // MenuItem item1 = new MenuItem();
        // System.out.println(item1.toString());
        // item1.setPrice(6);
        // System.out.println(item1.toString());
        // MenuItem item2 = new MenuItem();
        // System.out.println(item2.toString());
        Order order1 = new Order();
        MenuItem item1 = new MenuItem("burrito", 10.00);
        System.out.println(item1.toString());        
        order1.addItemToOrder(item1);
        MenuItem item2 = new MenuItem("pizza", 25.00);
        order1.raisePrice(item2);
        order1.addItemToOrder(item2);
        MenuItem item3 = new MenuItem();
        order1.addItemToOrder(item3);
        System.out.println(order1.totalPrice);
    }
}

class MenuItem
{
    public String name;
    private double price;

    public MenuItem(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public MenuItem()
    {
        name = "taco";
        price = 5.00;
    }

    public double getPrice()
    {
        return this.price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }

    public String toString()
    {
        return "We serve a delicious " + name + " for $" + price + ".";
    }
}

class Order{
    public int totalItems = 0;
    public double totalPrice = 0;

    public Order()
    {
        totalItems = 0;
        totalPrice = 0;
    }

    public void addItemToOrder(MenuItem m)
    {
        totalItems = totalItems + 1;
        totalPrice = totalPrice + m.getPrice();
        System.out.println("Thank you for ordering a " + m.name);
    }

    public void raisePrice(MenuItem m)
    {
        double price = m.getPrice();
        m.setPrice(price * 1.1);
        
    }
}


