import java.util.ArrayList;

public class MasterOrder
{
    private ArrayList<CookieOrder> orders;
    
    public MasterOrder()
    {
        orders = new ArrayList<CookieOrder>();
    }

    public void addOrder(CookieOrder theOrder)
    {
        orders.add(theOrder);
    }

    public int getTotalBoxes()
    {
        int totalBoxes = 0;
        if (orders.size() > 0)
        {
            for (CookieOrder order : orders)
            {
                totalBoxes = totalBoxes + order.getNumBoxes();
            }
        }
        return totalBoxes;
        







    }

    public int removeVariety(String cookieVar)
    {
        int totalRemoved = 0;
        int index = 0;
        while (index < orders.size())
        {
            if (orders.get(index).getVariety().equals(cookieVar))
            {
                totalRemoved = orders.get(index).getNumBoxes() + totalRemoved;
                orders.remove(index);
            }
            else
            {
                index++;
            }
        }
        return totalRemoved;
    }
}






