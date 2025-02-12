public class PasswordGenerator
 {
    private static int passwordCount;
    private String prefix;
    private int digits;

    public PasswordGenerator(int digits, String prefix)
    {
        this.prefix = prefix;
        this.digits = digits;
    }

    public PasswordGenerator(int digits)
    {
        prefix = "A";
        this.digits = digits;
    }

    public int pwCount()
    {
        return passwordCount;
    }

    public String pwGen()
    {
        passwordCount += 1;
        double num  = (int) (Math.random() * Math.pow(10.0, digits)); 
        return prefix + "." + num;
    }
    public static void main(String[] args) throws Exception {
        PasswordGenerator pw1 = new PasswordGenerator(4, "chs");
        System.out.println(pw1.pwCount());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwCount());
        PasswordGenerator pw2 = new PasswordGenerator(6);
        System.out.println(pw2.pwCount());
        System.out.println(pw2.pwGen());
        System.out.println(pw2.pwCount());
        System.out.println(pw1.pwCount());
    }
}
