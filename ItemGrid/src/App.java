public class App {
    public static void main(String[] args) throws Exception {
        ItemGrid grid1 = new ItemGrid(3, 4);
        // System.out.println(grid1.grid[0][1].getName());
        // for (Item[] row : grid1.grid)
        // {
        //     for (Item item : row)
        //     {
        //         System.out.println(item.getName());
        //     }
        // }
        System.out.println(grid1.mostValuableNeighbor(1,3));
    }
}
