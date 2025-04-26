public class NumberSystem {

    public static int gcf(int a, int b)
    {
        if (a % b == 0)
        {
            return b;
        }
        return gcf(b, a % b);
    }











    public static void reduceFraction(int numerator, int denominator)
    {
        int reducedNumerator = 1;
        int reducedDenominator = 1;
        int greatestCommonFactor = 1;
        if (numerator % denominator == 0)
        {
            reducedNumerator = numerator/denominator;
            System.out.println(numerator + "/" + denominator + " reduces to " + reducedNumerator);
        } else
        {
            greatestCommonFactor = gcf(numerator, denominator);
            reducedNumerator = numerator / greatestCommonFactor;
            reducedDenominator = denominator / greatestCommonFactor;
            System.out.println(numerator + "/" + denominator + " reduces to " + reducedNumerator + "/" + reducedDenominator);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(gcf(8, 12));
        System.out.println(gcf(30, 3));
        System.out.println(gcf(24, 9));
        System.out.println(gcf(7, 3));
        reduceFraction(30, 3);
        reduceFraction(8, 20);
        reduceFraction(24, 9);
        reduceFraction(7, 3);
    }
}
