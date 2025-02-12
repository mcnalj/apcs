public class Payroll {

    private int[] itemsSold = {48, 50, 37, 62, 38, 70, 55, 37, 64, 60};
    private double[] wages = new double[10];

    public double computeBonusThreshold()
    {
        int max = itemsSold[0];
        int min = itemsSold[0];
        int sum = 0;
        for (int sold : itemsSold)
        {
            if (sold > max)
            {
                max = sold;
            }
            if (sold < min)
            {
                min = sold;
            };
            sum = sum + sold;
        }
        return (sum - max - min) / (double) (itemsSold.length - 2);
    }

    public void computeWages(double fixedWage, double perItem)
    {
        double bonusThreshold = computeBonusThreshold();
        for ( int i = 0; i < itemsSold.length; i++)
        {
            double empWages = fixedWage + (perItem*itemsSold[i]);
            if (itemsSold[i] > bonusThreshold)
            {
                empWages = empWages * 1.10;
            }
           empWages  = (int) (empWages * 100);
            empWages = (double) empWages / 100;
            wages[i] = empWages;
        }
    }
    public void main(String[] args) throws Exception {
        computeWages(100, 1);
        for (double wage : wages) 
        {
            System.out.println(wage);
        }
    }
}
