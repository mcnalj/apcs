import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Double> data = new ArrayList<>(Arrays.asList(99.1, 142.0, 85.0, 85.1, 84.6, 94.3, 124.9, 98.0, 101.0, 102.5 ));
        WeatherData phoenix = new WeatherData(data);
    }
}
