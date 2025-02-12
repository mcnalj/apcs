import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Plot[][] seeds = {  { new Plot("corn", 20), new Plot("corn", 30), new Plot("peas", 10) },
                                    { new Plot("peas", 30), new Plot("corn", 40), new Plot("corn", 62) },
                                    { new Plot("wheat", 10), new Plot("corn", 50), new Plot("rice", 30) },
                                    { new Plot("corn", 55), new Plot("corn", 30), new Plot("peas", 30) },
                        };
        ExperimentalFarm farm1 = new ExperimentalFarm(seeds);
        Plot best = farm1.getHighestYield("corn");
        System.out.println(best.getCropYield());
        System.out.println(farm1.sameCrop(1));
    }
}
