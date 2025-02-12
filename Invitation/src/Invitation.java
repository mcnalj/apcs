public class Invitation
{
    private String hostName;
    private String address;
    
    public Invitation(String name, String addr)
    {
        hostName = name;
        address = addr;
    }

    public Invitation(String address)
    {
        this.address = address;
        hostName = "Host";
    }

    public String getHost()
    {
        return hostName;
    }

    public void updateAddress(String address)
    {
        this.address = address;
    }

    public String invite(String guest)
    {
        return "Dear " + guest + ", please attend my event at " + address +
        ". See you then, " + hostName + ".";
    }

    public static void longestStreak(String str)
    {
        for (var i = 0; i < str.length(); i++)
        {
            String firstChar = str.substring(i, i+1);
            String nextChar = str.substring(i+1, i+2);
            System.out.println(firstChar + nextChar);
        }

    }
    
    public static void main(String[] args) throws Exception {
        Invitation party1 = new Invitation("Faisal","196 Allen Ave.");
        System.out.println(party1.getHost());
        longestStreak("AABBCDE");
        // party1.updateAddress("370 Stevens Ave.");
        // System.out.println(party1.invite("Dr. Ahmed"));
        // Invitation party2 = new Invitation("Ms. Jepson", "Portland High");
        // System.out.println(party2.invite("AP Computer Science"));
    }
}
