import java.util.Scanner;

public class PigLatin {
    public static String toPigLatin(String word)
    {
        String pigLatin = "";
        String firstLetter = word.substring(0, 1);
        String restOfWord = word.substring(1);
        pigLatin = restOfWord + firstLetter + "ay";
        return pigLatin;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to convert to Pig Latin: ");
        String word = scanner.nextLine();
        String wordInPigLatin = toPigLatin(word);
        System.out.print(wordInPigLatin);
    }
}
