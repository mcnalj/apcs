import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice
{
    public static void main(String[] args)
    {    
        ArrayList<String> wordList = new ArrayList<String>();
        wordList.addAll(Arrays.asList("how", "much", "wood", "can", "a", "wood", "chuck", "chuck")); 
        ArrayListPractice practice1 = new ArrayListPractice();
        System.out.println(practice1.totalCount(wordList));
        System.out.println(practice1.wordSearch("wood", wordList));
        System.out.println(practice1.reverseList(wordList));
        
    }

    public ArrayListPractice()
    {

    }

    public int totalCount(ArrayList<String> words)
    {
        int totalCount = 0;
        for (String word : words)
        {
            totalCount = totalCount + word.length();
        }
        return totalCount;
    }

    public boolean wordSearch(String word, ArrayList<String> words)
    {
        for (String w : words)
        {
            if(w.compareTo(word) == 0)
            {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> reverseList(ArrayList<String> list){
        ArrayList<String> reversedList = new ArrayList<String>();
        for (String item : list)
        {
            reversedList.add(0, item);
        }
        return reversedList;
    }

    public ArrayList<String> insertWord(String word, ArrayList<String> words)
    {
        for (int i = 0; i < words.size(); i++)
        {
            String item = words.get(i);
            if (word.length() > item.length() )
            {
            
                words.add(i, word);
                return words;
            }
        }
        
    }
}






































    // public boolean wordSearch(String word, ArrayList<String> words)
    // {
    //     boolean inList = false;
    //     for (String item : words)
    //     {
    //         if (item.equals(word))
    //         {
    //             inList = true;
    //             return inList;
    //         }
    //     }
    //     return inList;
    // }

    // public ArrayList<String> reverseList(ArrayList<String> words)
    // {
    //     ArrayList<String> reversedList = new ArrayList<String>();
    //     for (int i = words.size()-1; i >= 0; i--)
    //     {
    //         reversedList.add(words.get(i));
    //     }
    //     return reversedList;
    // }