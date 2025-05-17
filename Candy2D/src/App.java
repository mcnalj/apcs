public class App {
    public static void main(String[] args) throws Exception {
        Candy[] row1 = {new Candy(null), new Candy("lime"), new Candy("cherry")};
        Candy[] row2 = {new Candy(null), new Candy("orange"), new Candy(null)};
        Candy[] row3 = {new Candy(null), new Candy(null), new Candy(null)};
        Candy[] row4 = {null, new Candy("lemon"), new Candy("grape")};
        Candy[][] box1 = {row1, row2, row3, row4};
        BoxOfCandy candyBox = new BoxOfCandy (box1);
        candyBox.moveCandyToFirstRow(0);
        candyBox.printBox();
    }
}
