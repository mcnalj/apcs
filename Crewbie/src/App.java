public class App {
    public static void main(String[] args) throws Exception {
        Crewbie person1 = new Crewbie(245559, "Giulio", "Natarajan", 45, 3.501342);
        person1.introduceSelf();
        person1.orderLunch();
        person1.updateGPA(4.0, 3.0);
        person1.reportGPA();
    }
}


