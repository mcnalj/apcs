public class StepTracker {
    private int minStepsToBeActive;
    private int totalDays;
    private int activeDays;
    private double totalSteps;

    public StepTracker(int minStepsToBeActive)
    {
        this.minStepsToBeActive = minStepsToBeActive;
        totalDays = 0;
        activeDays = 0;
        totalSteps = 0;
    }

    public static void main(String[] args) throws Exception {
        StepTracker tr = new StepTracker(10000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(13000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
    }
}

// public void addDailySteps(int steps)
// {
//     totalDays += 1;
//     totalSteps += steps;
//     if (steps >= minStepsToBeActive)
//     {
//         activeDays += 1;
//     }
// }

// public int activeDays()
// {
//     return activeDays;
// }

// public double averageSteps()
// {
//     if (totalDays > 0)
//     {
//         return totalSteps / totalDays;
//     }
//     else
//     {
//         return 0.0;
//     }
 
// }
