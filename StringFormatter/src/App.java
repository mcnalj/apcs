import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("AP", "COMP", "SCI", "ROCKS" ));
        StringFormatter formatter1 = new StringFormatter();
        int count = formatter1.totalLetters(words);
        System.out.println(count);
        int bgw = formatter1.basicGapWidth(words, 20);
        System.out.println(bgw);
        System.out.println(formatter1.format(words, 20));
    }
}
