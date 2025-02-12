import java.util.ArrayList;

public class Delimiters
{
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close)
    {
        this.openDel = open;
        this.closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens)
    {
        ArrayList<String> delimetersList = new ArrayList<String>();
        for (String token : tokens)
        {
            if (token.equals(openDel) || token.equals(closeDel))
            {
                delimetersList.add(token);
            }
        }
        return delimetersList;
    }

    public boolean isBalanced(ArrayList<String> delimitersList)
    {
        boolean isBalanced = false;
        int openers = 0;
        int closers = 0;
        // int delLength = delimitersList.size();
        // for (int i = 0; i < delLength; i++)
        for (String delimiter : delimitersList)
        {
            if (delimiter.equals(openDel))
            {
                openers++;
            }
            else
            {
                closers++;
            }
            if (closers > openers)
            {
                return isBalanced;
            }
        }
        if (openers == closers)
        {
            isBalanced = true;
        }
        return isBalanced;
    }
}
