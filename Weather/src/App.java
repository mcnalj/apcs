import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Double> montereyTemps = new ArrayList<Double>(Arrays.asList(2.0, 3.3, 5.5));
        montereyTemps.add(99.1);
        montereyTemps.add(142.0);
        montereyTemps.add(85.0);
        montereyTemps.add(85.1);
        montereyTemps.add(84.6);
        montereyTemps.add(94.3);
        montereyTemps.add(124.9);
        montereyTemps.add(98.0);
        montereyTemps.add(101.0);
        montereyTemps.add(102.5);

        WeatherData monterey = new WeatherData(montereyTemps);
        System.out.println(monterey.getSize());
        monterey.cleanData(85.0, 120.0);
        monterey.printList();
        monterey.reverseList();
        System.out.println(reverseList());
        monterey.printList();
        // // System.out.println(monterey.longestHeatWave(100));
        // System.out.println(monterey.searchFor(130.7));
        // System.out.println(monterey.ruweydaMethod(100.0));
    }
}
