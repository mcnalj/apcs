public class App {
    public static void main(String[] args) throws Exception {
        String[] words = {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};

        for (String word : words)
        {
            int wordLength = word.length();
            int startIndex = wordLength -3;
            String wordEnding = word.substring(startIndex); 
            if (wordEnding.equals("ing"))
            {
                System.out.println(word);
            }
        }
    }
}
