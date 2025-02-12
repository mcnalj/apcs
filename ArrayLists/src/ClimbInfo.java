import java.util.ArrayList;

public class ClimbInfo
{
    private String peakName;
    private int climbTime;

    public ClimbInfo(String peakName, int climbTime) {
        this.peakName = peakName;
        this.climbTime = climbTime;
    }

    public String getName() 
    {
        return peakName; 
    }

    public int getTime()
    {
        return climbTime;
    }
}


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