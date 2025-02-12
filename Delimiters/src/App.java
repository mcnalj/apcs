import java.util.ArrayList;

public class App {
    public static void main(String[] args)
    {
        String[] tokens1 = {"(", "x", "+", "y", ")", "=", "5"};
        String[] tokens2 = {"<q>", "xx", "yy", "</q>", "zz", "<q>", "</q>", "<q>"};
        Delimiters delimiter1 = new Delimiters("(", ")");
        System.out.println(delimiter1.getDelimitersList(tokens1)); 
        Delimiters delimiter2 = new Delimiters("<q>", "</q>");
        System.out.println(delimiter2.getDelimitersList(tokens2));
        ArrayList<String> delimiters2 = delimiter2.getDelimitersList(tokens2);
        System.out.println(delimiter2.isBalanced(delimiters2));
    }
}
