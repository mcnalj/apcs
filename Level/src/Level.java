public class Level {
    private boolean reachedGoal;
    private int levelNum;

    public Level(boolean reachedGoal, int levelNum)
    {
        this.reachedGoal = reachedGoal;
        this.levelNum = levelNum;
    }

    public boolean goalReached()
    {
        return reachedGoal;
    }

    public int getPoints()
    {
        if (levelNum == 1)
        {
            return 200;
        }
        if (levelNum == 2)
        {
            return 100;
        }
        if (levelNum == 3)
        {
            return 500;
        }
        return 500;
    }
    
}

