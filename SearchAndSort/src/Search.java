import java.util.ArrayList;
import java.util.Arrays;

public class Search {

    public static int sequentialSearch(int[] elements, int target)
    {
        for (int j = 0; j < elements.length; j++)
        {
            if (elements[j] == target)
            {
                return j;
            }
        }
        return -1;
    }

    public static int sequentialSearchArray(ArrayList<String> words, String word)
    {
        for (int j = 0; j < words.size(); j++)
        {
            if (words.get(j).equals(word))
            {
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        String[] myCrew = {"Ruweyda", "Otis", "Aryeh", "Leah", "Ruby"};
        
        ArrayList<String> crewbies = new ArrayList<String>();
        crewbies.addAll(Arrays.asList(myCrew));
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23};
        System.out.println(sequentialSearch(primes, 13));
        System.out.println(sequentialSearch(primes, 21));
        System.out.println(sequentialSearchArray(crewbies, "Otis"));
        System.out.println(sequentialSearchArray(crewbies, "Faisal"));
    }
}



