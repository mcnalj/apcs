public class ItemGrid
{
    public Item[][] grid;
    
    public ItemGrid(int rows, int columns)
    {
        String[] items = {  "acorn", "book", "carrot", "desk",
                            "egg", "flag", "globe", "harp",
                            "island", "jacket", "kale", "lunch"};
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
        System.out.println(grid[0].length);
        if (xPos >= grid.length || xPos < 0)
        {
            return false;
        }
        if (yPos >= grid[0].length || yPos < 0)
        {
            return false;
        }
        return true;
    }

    public String mostValuableNeighbor(int r, int c)
    {
        System.out.println(r + ", " + c);
        int maxValue = grid[r][c].getValue();
        String maxName = grid[r][c].getName();
        // if(isValid(r, c + 1))
        // {
            if(isValid(r,c+1) && grid[r][c+1].getValue() > maxValue)
            {
                maxValue = grid[r][c+1].getValue();
                maxName = grid[r][c+1].getName();
            };
        //}
        
        if (isValid(r, c - 1))
        {
            if(grid[r][c-1].getValue() > maxValue)
            {
                maxValue = grid[r][c - 1].getValue();
                maxName = grid[r][c - 1].getName();
            };
        }
        return maxName;
    }

    public double findAverage()
    {
        return 0.0;
    }

    public void printGrid()
{
    for (Item[] row : grid)
    {
        for (Item i : row)
        {
            System.out.println(i.getName() + ", " + i.getValue());
        }
    }
}

    public static void main(String[] args) throws Exception {
        ItemGrid grid1 = new ItemGrid(3, 4);
        System.out.println(grid1.mostValuableNeighbor(0, 3));
    }
}









// public String mostValuableNeighbor(int r, int c)
// {
//     System.out.println(r + ", " + c);
//     int maxValue = grid[r][c].getValue();
//     String maxName = grid[r][c].getName();
//     System.out.println("calling is Valid");
//     System.out.println("Right: " + (c+1));
//     if(isValid(r, c + 1))
//     {
//         System.out.println("Right is valid: " + c+1);
//         if(grid[r][c+1].getValue() > maxValue){
//             maxValue = grid[r][c+1].getValue();
//             maxName = grid[r][c+1].getName();
//         };
//     }
//     System.out.println(c - 1);
//     if (isValid(r, c - 1))
//     {
//         System.out.println("Left is valid: " + (c-1));
//         if(grid[r][c-1].getValue() > maxValue)
//         {
//             maxValue = grid[r][c - 1].getValue();
//             maxName = grid[r][c - 1].getName();
//         };
//     }
//     return maxName;
// }

// public void printGrid()
// {
//     for (Item[] row : grid)
//     {
//         for (Item i : row)
//         {
//             System.out.println(i.getName() + ", " + i.getValue());
//         }
//     }
// }
