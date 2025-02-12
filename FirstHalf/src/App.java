import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three words separated by spaces: ");
        String words = scanner.nextLine();

        int space1 = words.indexOf(" ");
        String word1 = words.substring(0, space1);
        String lastTwo = words.substring(space1+1);
        int space2 = lastTwo.indexOf(" ");
        String word2 = lastTwo.substring(0, space2);
        String word3 = lastTwo.substring(space2+1);
        System.out.print(word3 + " " + word2 + " " + word1);

        // int wordLength = word.length();
        // int middleIndex = (int) (wordLength/2);
        // String firstHalf = word.substring(0, middleIndex);
        // String secondHalf = word.substring(middleIndex);
        // System.out.println(secondHalf + firstHalf);
    }
}


// int spaceIndex = word.indexOf(" ");
// String lastName = word.substring(spaceIndex+1);
// String firstFive = lastName.substring(0, 5);
// String firstLetter = word.substring(0, 1);
// String teacherEmail = firstFive + firstLetter + "@portlandschools.org";
// teacherEmail = teacherEmail.toLowerCase();
// System.out.println(teacherEmail);
