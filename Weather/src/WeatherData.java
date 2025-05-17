import java.util.ArrayList;

public class WeatherData
{
    private ArrayList<Double> temperatures;

    public WeatherData(ArrayList<Double> temperatures)
    {
        this.temperatures = temperatures;
    }

    public boolean searchFor(double maggieNum)
    {
        for (double temp : temperatures)
        {
            if (temp == maggieNum)
            {
                return true;
            }
        }
        return false;
    }

    public boolean ruweydaMethod(double rNum)
    {
        for (double n : temperatures)
        {
            if (n > rNum)
            {
                return true;
            }
        }
        return false;
    }

    public void reverseList()
    {
        int size = temperatures.size();
        ArrayList<Double> reversed = new ArrayList<Double>();

        for (int i = 0; i < size; i++)
        {
            reversed.add(temperatures.get(i));
        }

    }

    public void cleanData(double lower, double upper)
    {
        for (int i = 0; i < temperatures.size(); i++)
        {
            double temp = temperatures.get(i);
            if (temp < lower || temp > upper){
                temperatures.remove(i);
                i--;
            }
        }
    }

    public int longestHeatWave(double threshold)
    {
        int maxStreak = 0;
        int currentStreak = 0;
        for (double jo : temperatures)
        {
            if (jo > threshold)
            {
                currentStreak++;
                if (currentStreak > maxStreak)
                {
                    maxStreak = currentStreak;
                }
            }
            else
            {
                currentStreak = 0;
            }
        }
        return maxStreak;
    }

    public int getSize()
    {
        return temperatures.size();
    }

    public void printList()
    {
        for (int i=0; i<temperatures.size(); i++)
        {
            System.out.print(temperatures.get(i) + " ");
        }
    }


    
}
