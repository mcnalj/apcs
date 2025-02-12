public class BinarySearch {

    public static int intBinarySearch(int[] elements, int target)
    {
        int left = 0;
        int right = elements.length - 1;
        while (left <= right)
        {
            int middle = (left + right)/2;
            if (target < elements[middle])
            {
                right = middle - 1;
            }
            else if (target > elements[middle])
            {
                left = middle + 1;
            }
            else
            {
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {

        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23};
        System.out.println(intBinarySearch(primes, 11));
        System.out.println(intBinarySearch(primes, 3));
        System.out.println(intBinarySearch(primes, 24));
    }
}






// String[] myCrew = {"Ruweyda", "Otis", "Aryeh", "Leah", "Ruby"};
        
// ArrayList<String> crewbies = new ArrayList<String>();
// crewbies.addAll(Arrays.asList(myCrew));

// System.out.println(sequentialSearchArray(crewbies, "Otis"));
        // System.out.println(sequentialSearchArray(crewbies, "Faisal"));


