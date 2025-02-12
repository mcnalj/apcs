import java.util.ArrayList;

public class StringFormatter
{
    public ArrayList<String> formattedList = new ArrayList<String>();

    public StringFormatter()
    {
        formattedList = new ArrayList<String>();
    }

    public int totalLetters(ArrayList<String> wordList)
    {
        int totalLetters = 0;
        for (String word : wordList)
        {
            System.out.println(word);
            totalLetters = totalLetters + word.length();
        }
        return totalLetters;
    }

    public int basicGapWidth(ArrayList<String> wordList, int formattedLen)
    {
        int gaps = wordList.size() -1;
        int basicGap = (formattedLen - totalLetters(wordList)) / gaps;
        
        return basicGap;
    }

    public int leftoverSpaces(ArrayList<String> wordList, int formattedLen)
    {
        int gaps = wordList.size() -1;
        int leftover = (formattedLen - totalLetters(wordList)) % gaps;
        return leftover;
    }

    public String format(ArrayList<String> wordList, int formattedLen)
    {
        String formattedList = "";
        int bgw = basicGapWidth(wordList, formattedLen);
        int leftover = leftoverSpaces(wordList, formattedLen);
        for (String word : wordList)
        {
            if (leftover > 0)
            {
                formattedList = formattedList + word + bgw + 1;
                leftover = leftover - 1;    
            } else
            {
                formattedList = formattedList + word + bgw + 1;
            }
        }
        return formattedList;
    }
}


