import java.util.ArrayList;
public class App {
    public static void main(String[] args) {
        UserName person = new UserName("Misk", "Abdullah");
        String[] usedNames = {"AbdullahM"};
        person.setAvailableUserNames(usedNames);
        ArrayList<String> pNames = person.getPossibleNames();
        for (String n : pNames)
        {
            System.out.println(n);
        }
    }
}
