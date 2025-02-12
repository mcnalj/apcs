public class App
{
    public static int[] nums = {1, 5, 7, 11, 33, 7, 24, 92};

    public static void main(String[] args)
    {
        int numOfOdd = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] % 2 == 1)
            {
                numOfOdd++;
            }
        }
        System.out.println(numOfOdd);
    }
}
    
    // public static void findMin(int[] nums)
    // {
    //     int maxNum = 0;
    //     for (int num : nums)
    //     {
    //         if (num > maxNum)
    //         {
    //             maxNum = num;
    //         }
    //     }
    //     System.out.println("The maximum number is: " + maxNum);
    // }

    // public static void printSum(int[] nums)
    // {
        // int sum = 0;
        // for (int num : nums)
        // {
        //     sum = sum + num;
        // }
        // System.out.println("The sum is: " + sum);
    // }

    // public static void printAverage(int[] nums)
    // {
    //     int sum = 0;
        
    //     for (int num : nums)
    //     {
    //         sum = sum + num;
    //     }

    //     double average = (double) sum / nums.length;

    //     System.out.println("The average is: " + average);
    // }

    // public static void printMode(int[] nums)
    // {
    //     int mode = 0;
    //     int maxCount = 0;
    //     int count = 0;
    //     for (int i = 0; i < nums.length; i++)
    //     {
    //         count = 0;
    //         for (int num : nums)
    //         {
    //             if (nums[i] == num)
    //             {
    //                 count = count+1;
    //             }
    //         }
    //         if (count > maxCount) 
    //         {
    //             maxCount = count;
    //             mode = nums[i];
    //         }
    //     }
    //     System.out.println("The mode is: " + mode + " and it occurs " + maxCount + " times.");
    // }

    // public static void findIndex(int num, int[] nums)
    // {
    //     for (int i = 0; i < nums.length; i++)
    //     {
    //         if (nums[i] == num) {
    //             System.out.println(num + " is at index " + i + ".");
    //         }
    //     }
    // }

    // public static void reverseElements(int[] nums)
    // {
    //     int endIndex = nums.length - 1;
    //     int shuffle = 0;
    //     for (int i = 0; i < nums.length / 2; i++)
    //     {
    //         shuffle = nums[i];
    //         nums[i] = nums[endIndex];
    //         nums[endIndex] = shuffle;
    //         endIndex--;
    //     }
    //     for (int num : nums)
    //     {
    //         System.out.print(num + " ");
    //     }
    // }

    // public static void shiftRight(int[] nums)
    // {
    //     int last = nums[nums.length - 1];
    //     for (int i = nums.length -1; i > 0; i--)
    //     {
    //         nums[i] = nums[i-1];
    //     }
    //     nums[0] = last;
    //     for (int num : nums)
    //     {
    //         System.out.print(num + " ");
    //     }
    // }

    // public static void checkForDuplicates(int[] nums)
    // {
    //     boolean hasDupes = false;
    //     for (int i = 0; i < nums.length; i++)
    //     {
    //         for (int j = i + 1; j < nums.length; j++)
    //         {
    //             if (nums[i] == nums[j])
    //             {
    //                 hasDupes = true;
    //             }
    //         }
    //     }
    //     System.out.println("Has Dupes = " + hasDupes);
    // }
    // public static void main(String[] args)
    // {
        // findMin(nums);
        // printSum(nums);
        // printAverage(nums);
        // printMode(nums);
        // findIndex(33, nums);
        // reverseElements(nums);
        // System.out.println(" ");
        // shiftRight(nums);
        // checkForDuplicates(nums);










        
    //     String[] people = {"Emyr", "Jake", "Jack", "Otis"};
    //     int[] grades = { 4, 4, 1, 3, 4};
    //     double[] scores = {3.75, 4.0, 2.75, 3.25, 3.25, 4.0};

    //     double sum = 0;
    //     for (double score : scores)
    //     {
    //         sum = sum + score;
    //     }
    //     double average = sum/scores.length;
    //     System.out.println(average);
    // }
//}
