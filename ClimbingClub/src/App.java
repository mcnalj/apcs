public class App {
    public static void main(String[] args)
    {
        ClimbingClub hikerClub = new ClimbingClub();
        hikerClub.addClimbWhile("Monadnock", 274);
        hikerClub.addClimbWhile("Whiteface", 301);
        hikerClub.addClimbWhile("Algonguin", 225);
        hikerClub.addClimbWhile("Monadnock", 344);
        // System.out.println("Here's the final list: ");
        hikerClub.listClimbs();
        System.out.println(hikerClub.distinctPeakNames());

        ClimbInfo firstClimb = new ClimbInfo("Mt. Katahdin", 2435);
        ClimbInfo firstClimb = new ClimbInfo("Bradbury", 5);
        System.out.println(firstClimb.getName());
    }
}
