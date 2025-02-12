import java.util.ArrayList;

public class ClimbingClub
{
    private ArrayList<ClimbInfo> climbList;
    
    public ClimbingClub()
    {
        climbList = new ArrayList<ClimbInfo>();
    }

    public void addClimb(String peakName, int climbTime)
    {
        ClimbInfo climb = new ClimbInfo(peakName, climbTime);
        climbList.add(climb);
    }

    public void addClimbFor(String peakName, int climbTime)
    {
        ClimbInfo climb = new ClimbInfo(peakName, climbTime);
        boolean climbAdded = false;
        if (climbList.size() > 0) {
            for (int i  = 0; i < climbList.size(); i++)
            {
                ClimbInfo comparisonInfo = climbList.get(i);
                String comparisonClimb = comparisonInfo.getName();

                if (peakName.compareTo(comparisonClimb) <= 0)
                {
                    if (!climbAdded)
                    {
                        climbList.add(i, climb);
                        climbAdded = true;
                    }
                }
            }
            if (!climbAdded)
            {
                climbList.add(climb);

            }
        } 
        else 
        {
            climbList.add(climb);
        }
    }

    public void addClimbWhile(String peakName, int climbTime) {
        ClimbInfo climb = new ClimbInfo(peakName, climbTime);
        int insertIndex = 0;

        while (insertIndex < climbList.size() && peakName.compareTo(climbList.get(insertIndex).getName()) > 0)
        {
            insertIndex++;
        }
        climbList.add(insertIndex, climb);
    }

    public int distinctPeakNames()
    {
        ArrayList<String> distinctPeaks = new ArrayList<String>();
        distinctPeaks.add(climbList.get(0).getName());
        boolean unique = true;
        for (ClimbInfo climb : climbList)
        {
            for (int i = 0; i < distinctPeaks.size(); i++)
            {
                if (climb.getName().compareTo(distinctPeaks.get(i)) == 0)
                {
                    unique = false;
                }
            }
            if (unique) {
                distinctPeaks.add(climb.getName());
            }
            unique = true;
        }
        return distinctPeaks.size();
    }

    public void listClimbs()
    {
        for (ClimbInfo climb : climbList)
        {
            System.out.println(climb.getName());
        }
    }
}
