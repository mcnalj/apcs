public class WordMatch {
    private String secret;

    public WordMatch(String word)
    {
        secret = String.valueOf(word);
    }

    public int scoreGuess(String guess)
    {
        int count = 0;
        for (int i = 0; i <= secret.length() - guess.length(); i++)
        {
            if (secret.substring(i, i + guess.length()).equals(guess))
            {
                count++;
            }
        }
        return count * guess.length() * guess.length()
    }

    public String findBetterGuess(String guess1, String guess2)
    {
        int firstScore = scoreGuess(guess1);
        int secondScore = scoreGuess(guess2);

        if (firstScore > secondScore)
        {
            return guess1;
        }
        else if (secondScore > firstScore)
        {
            return guess2;
        }
        if (guess1.compareTo(guess2) > 0)
        {
            return guess1;
        }
        return guess2;
    }
}













