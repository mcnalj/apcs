public class ExperimentalFarm {
    private Plot[][] farmPlots;

    public ExperimentalFarm(Plot[][] p)
    {
        farmPlots = p;
    }
















    
    public Plot getHighestYield(String c)
    {
        int highestYield = 0;
        Plot highestYielding = farmPlots[0][0];
        for (Plot[] row : farmPlots)
        {
            for (Plot plot : row)
            {
                if(plot.getCropType() == c && plot.getCropYield()> highestYield)
                {
                    highestYield = plot.getCropYield();
                    highestYielding = plot;
                }
            }
        }
        return highestYielding;
    }

    public boolean sameCrop(int col)
    {
        String type = farmPlots[0][col].getCropType();
        for (int i = 1; i < farmPlots.length; i++)
        {
            if (farmPlots[i][col].getCropType() != type)
            {
                return false;
            }
        }
        return true;
    }
}
