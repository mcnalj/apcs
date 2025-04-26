public class App {

    public static void countdown(int num)
    {
        if (num == 0)
        {
            System.out.println("Blastoff!");
        } else
        {
            System.out.println(num);
            countdown(num -1);
        }
        System.out.println("Done");
    }

    public static int sumNumbers(int num)
    {
        if (num == 0)
        {
            return 0;
        } else
        {
            System.out.println(num);
            return num + sumNumbers(num -1);
        }
    }

    public static String reverse(String str)
    {
        if (str.isEmpty())
        {
            return str;
        }
        System.out.println("Calling reverse: " + str.substring(1));
        return reverse(str.substring(1)) + str.charAt(0);
    }    

    public static int countOccurrences(String str, char ch)
    {
        if (str.isEmpty())
        {
            return 0;
        }
        int count = (str.charAt(0)== ch) ? 1 : 0;
        System.out.println("Calling countOccurences: " + str.substring(1) + " and " + ch);
        return count + countOccurrences(str.substring(1), ch);
    }

    public static void reduceFraction(int numerator, int denominator)
    {
        System.out.print(numerator + "/" + denominator + " reduces to ");
        if (numerator % denominator == 0)
        {
            System.out.println(numerator/denominator);
        }
        else
        {
            int factor = gcf(numerator, denominator);
            System.out.println(numerator / factor + "/" + denominator / factor);
        }
    }
    public static void main(String[] args)
     {
        //
        char ch = 'e';
        System.out.println(countOccurrences("picklejuice", ch));
    }
}
