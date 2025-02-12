import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); 
        int count = 0;
        int maxCount = 0;
        int maxNum = 0;
        int superMax = 0;
        int numberBeingTested = 0;
        int numberThatWentHighest =0;
        for (int i = num; i> 1; i--)
        {
            numberBeingTested = i;
            count = 0;
            while (i != 1)
            {
                if (i >= maxNum) {
                    maxNum = i;
                }
                if (i % 2 == 0)
                {
                    i = i /2;
                } else
                {
                    i = 3 * i + 1;
                }
                count++;
            }
            if (count > maxCount)
            {
                maxCount = count;
            }
            if (maxNum > superMax)
            {
                superMax = maxNum;
                numberThatWentHighest = numberBeingTested;
                
            }
        }   
        System.out.println("The total # of caclulations was: " + maxCount);
        System.out.println("The superMax reached is: " + superMax);
        System.out.println("The number that went the highest was: " + numberThatWentHighest);
    }
}

// complete Collatz
// {
// Scanner scanner = new Scanner(System.in);
// int num = scanner.nextInt();
// int count = 0;
// int maxCount = 0;
// int max = 0;
// int globalMax = 0;
// for (int i = 1; i <= num; i++) {
//     count = 0;
//     while (num != 1) {
//         if (num % 2 == 0) {
//             num = num / 2;
//         } else {
//             num = 3* num + 1;
//         }
//         if (num > max) {
//             max = num;
//         }
//         count++;
//         System.out.println("Num is " + num);
//     }
//     if (max > globalMax) {
//         globalMax = max;
//     }
//     if (count > maxCount) {
//         maxCount = count;
//     }
// }
// System.out.println("The max it took us " + maxCount + " times to fall to 1");
// System.out.println("The max we rose to was " + globalMax);

// }

// public static void longestString(String str)
// {
//     int maxSeq = 0;
//     String maxChar = "";
//     int curSeq = 1;
//     String curChar ="";
//     String nextChar ="";

//     for (int i = 0; i < (str.length()-1); i++)
//     {   
//         curChar = str.substring(i, i+ 1);
//         nextChar = str.substring(i+ 1, i+2); 
//         if (curChar.equals(nextChar))
//         {
//             curSeq++;
//             if (curSeq > maxSeq)
//             {
//                 maxSeq = curSeq;
//                 // maxCharacter = // the current character
//             } 
//         } else
//         {
//             curSeq = 1;
//         }
//     }
//     System.out.println(maxSeq);
// }


// Scanner scanner = new Scanner(System.in);
// System.out.println("Enter your palindrome to check: ");
// String str = scanner.nextLine();
// String result = "";
// while (str.indexOf(" ") != -1)
// {
//     int spaceIndex = str.indexOf(" ");
//     str = str.substring(0, spaceIndex) + str.substring(spaceIndex + 1);
// }
// String reversed = "";
// for (int i = str.length() - 1; i >= 0; i--) {
//     reversed += str.substring(i, i+1);
// }
// if (str.equals(reversed)) {
//     result = "is a palindrome";
// } else {
//     result = "is not a palindrome";
// }
// System.out.println(str + " " + result);
// System.out.println(reversed);
// scanner.close();


// double number = Math.random() * 100;
// int roundedNumber = (int) number;
// roundedNumber = roundedNumber + 1;
// Scanner scanner = new Scanner(System.in);
// System.out.println("Guess the number (between 1 and 100): ");
// int guess = scanner.nextInt();
// if (guess < roundedNumber) {
//     System.out.println("Too low! Try again.");
// } else if (guess > roundedNumber) {
//     System.out.println("Too high! Try again.");                
// } else {
//     System.out.println("Congratulations! You guessed the number!");
// }
// scanner.close();

// double number = Math.random() * 100;
// int roundedNumber = (int) number;
// roundedNumber = roundedNumber + 1; // Increment the rounded number by 1
// System.out.println("Random number: " + roundedNumber);
// Scanner scanner = new Scanner(System.in);
// int guess = 0;
// int attempts = 7;
// boolean playing = true;
// while (guess != roundedNumber && attempts > 0 && playing) {
//     if (attempts == 7) {
//         System.out.println("You have " + attempts + " attempts to guess the number.");
//     } else {
//         System.out.println("You have " + attempts + " attempts left."); 
//     }
//     System.out.println("Guess the number (between 1 and 100): ");
//     guess = scanner.nextInt();
//     if (guess < roundedNumber) {
//         System.out.println("Too low! Try again.");
//         attempts--;
//     } else if (guess > roundedNumber) {
//         System.out.println("Too high! Try again.");
//         attempts--;
//     } else {
//         int tries = 8 - attempts;
//         System.out.println("Congratulations! You guessed the number!");
//         System.out.println("It took you " + tries + " tries.");
//     }
//     if (attempts == 0) {
//         System.out.println("Sorry, you've run out of attempts. The number was " + roundedNumber);
//         System.out.println("Would you like to play again? (y/n)");
//         String playAgain = scanner.next();
//         if (playAgain.equalsIgnoreCase("y")) {
//             playing = true;
//         } else {
//             playing = false;
//             System.out.println("Thanks for playing!");
//         }
//     }
// }
// scanner.close();

