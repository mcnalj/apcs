public class ItemGrid
{
    public Item[][] grid;
    
    public ItemGrid(int rows, int columns)
    {
        String[] items = {"acorn", "book", "carrot", "desk", "egg", "flag", "globe", "harp", "island", "jacket", "kale", "lunch"};
        int[] values = {7, 10, 8, 9, 5, 8, 8, 9, 7, 19, 8, 16};
        grid = new Item[rows][columns];
        int count = 0;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                Item obj = new Item(items[count], values[count]);
                grid[i][j] = obj;
                count++;
            }
        }
    }

    public boolean isValid(int xPos, int yPos)
    {
        if (yPos >= grid.length || yPos < 0)
        {
            return false;
        }
        if (xPos >= grid[0].length || xPos < 0)
        {
            return false;
        }
        return true;
    }

    public String mostValuableNeighbor(int r, int c)
    {
        int[] values = new int[3];
        values[0] = grid[r][c].getValue();
        if(isValid(r, c-1))
        {
            values[1] = grid[r][c-1].getValue();
        }
        if (isValid(r, c+1))
        {
            values[2] = grid[r][c+1].getValue();
        }
        int max = 0;
        int maxItem = 0;
        for (var i = 0; i < 3; i++)
        {
            if (values[i] > max)
            {
                max = values[i];
                maxItem = i;
            }
        }
        if (maxItem == 0)
        {
            return grid[r][c].getName();
        } 
        else if (maxItem == 1)
        {
            return grid[r][c-1].getName();
        } else
        {
            return grid[r][c+1].getName();
        }
    }

    public double findAverage()
    {
        return 0.0;
    }
}
