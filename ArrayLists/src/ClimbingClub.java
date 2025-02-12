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

    public int distinctPeakNames()
    {

    }
}    
