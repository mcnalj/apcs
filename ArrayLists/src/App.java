import java.util.ArrayList;
import ClimbingClub;


public class App
{
    public static ArrayList<String> newList = new ArrayList<String>();
    public static void main(String[] args)
    {
        // String[] words2 = {"TAN", "ABRACADABRA", "WHOA", "APPLE", "EGGS"};
        // ArrayList<String> wordList = new ArrayList<String>();
        // for (String word : words2)
        // {
        //     wordList.add(word);
        // }
        // System.out.println("Original List: " + wordList);
        // scrambleOrRemove(wordList);
        // System.out.println(" ===> " + newList);

        ClimbingClub hikerClub = new ClimbingClub();

        
    }

    public static String scrambleWord(String word)
    {
        String scrambled = "";
        int i = 0;

        while (i < word.length())
        {
            String letter1 = word.substring(i, i + 1);
            String letter2 = "";
            if (i < word.length() - 1)
            {
                letter2 = word.substring(i + 1, i + 2);
            
                if (letter1.equals("A")
                    && !letter2.equals("A")
                    && !letter2.equals(""))
                {
                    scrambled += letter2 + letter1;
                    i += 2;
                } else
                {
                    scrambled += letter1;
                    i += 1;
                }
            }
            else {
                scrambled += letter1;
                i++;
            }
        }
        return scrambled;
    }

    public static void scrambleOrRemove(ArrayList<String> wordList)
    {
        for (String word : wordList)
        {
            String scrambled = scrambleWord(word);
            if (!scrambled.equals(word))
            {
                newList.add(scrambled);
            }
        }
    }


}
