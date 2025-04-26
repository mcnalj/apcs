public class App {
    public static void main(String[] args) throws Exception {
        Meal burger = new Meal("hamburger", 7.99);
        System.out.println(burger.toString());
        DeluxeMeal burritoCombo = new DeluxeMeal("burrito", "chips", "lemonage", 7.49);
        System.out.println(burritoCombo.toString());
    }
}
