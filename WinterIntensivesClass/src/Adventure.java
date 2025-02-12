public class Adventure
{
    private String destination;
    private String activity;

    public Adventure(String destination, String activity)
    {
        this.destination = destination;
        this.activity = activity;
    }

    public void loadBus()
    {
        System.out.println("Grab your gear, we are headed to "
                             + this.destination + " to go "
                             + this.activity + ".");
    }

    public void reportToFriends(String description)
    {
        System.out.println("We went " + this.activity + ". " + description);
    }

    public static void main(String[] args) 
    {
        Adventure trip1 = new Adventure("Wolfe's Neck State Park", "hiking");
        trip1.loadBus();
        trip1.reportToFriends("It was actually chill. The ocean was calm.");
    }
}
