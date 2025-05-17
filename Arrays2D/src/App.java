public class App {
    
    public static int[][] seatPrices = {{10, 15, 11}, {20, 30, 21}, {25, 35, 26}, {5, 9, 6}};
    public static void main(String[] args) throws Exception {
        System.out.println(seatPrices[0][1]);
        System.out.println(seatPrices.length);
        System.out.println(seatPrices[0].length);



        for (int[] row : seatPrices)
        {
            for (int price : row)
            {
                System.out.println(price);
            }
        }
    }

}
