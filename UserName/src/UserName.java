import java.util.ArrayList;

public class UserName {
    private ArrayList<String> possibleNames;

    public UserName(String firstName, String lastName)
    {
        possibleNames = new ArrayList<String>();
        int firstLength = firstName.length();
        for (int i = 1; i <= firstLength; i++)
        {
            possibleNames.add(lastName + firstName.substring(0, i));
        }
    }

    public ArrayList<String> getPossibleNames()
    {
        return possibleNames;
    }

    public boolean isUsed(String name, String[] usedNames)
    {
        for (String n : usedNames)
        {
            if (n.equals(name))
            {
                return true;
            }
        }
        return false;
    }

    public void setAvailableUserNames(String[] usedNames)
    {
        for (int i = 0; i < possibleNames.size(); i++)
        {
            if (isUsed(possibleNames.get(i), usedNames))
            {
                possibleNames.remove(i);
                i--;
            }
        }
    }
}
