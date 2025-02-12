import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        RepairSchedule r = new RepairSchedule(6);    
        r.addRepair(1, 1);
        r.addRepair(2, 2);
        r.addRepair(1,2);
        for (CarRepair rep : r.schedule )
        {
            System.out.println(rep.getMechanicNum());
        }   
    }
}
