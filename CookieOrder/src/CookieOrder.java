public class CookieOrder
{
    private String variety;
    private int numBoxes;

    public CookieOrder(String variety, int numBoxes)
    {
        this.variety = variety;
        this.numBoxes = numBoxes;
    }    

    public String getVariety()
    {
        return variety;
    }

    public int getNumBoxes()
    {
        return numBoxes;
    }
}
