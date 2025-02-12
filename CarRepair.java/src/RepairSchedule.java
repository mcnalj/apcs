import java.util.ArrayList;

public class RepairSchedule {
    public ArrayList<CarRepair> schedule;

    private int numberOfMechanics;

    public RepairSchedule(int n)
    {
        schedule = new ArrayList<CarRepair>();
        numberOfMechanics = n;
    }

    public boolean addRepair(int m, int b)
    {
        for (int i = 0; i < schedule.size(); i++)
        {
            CarRepair r = schedule.get(i);
            if (r.getMechanicNum() == m || r.getBayNum() == b)
            {
                return false;
            }
        }
        CarRepair rep1 = new CarRepair(m, b);
        schedule.add(rep1);
        return true;
    }

    public ArrayList<Integer> availableMechanics()
    {
        ArrayList<Integer> availableMechs = new ArrayList<Integer>();
        for (int i = 1; i<numberOfMechanics; i++)
        {
            for ()
        }

    }

    public void carOut(int b)
    {

    }
}


