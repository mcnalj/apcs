import java.util.Arrays;

public class App {

    public static void selectionSort(int[] elements)
    {













        
    }

    public static void main(String[] args)
    {
        int[] arr1 = {2, 8, 5, 3, 9, 4, 1};
        selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}




// for (int j = 0; j < elements.length -1; j++)
// {
//     int minIndex = j;
//     for (int k = j+1; k < elements.length; k++)
//     {
//         if (elements[k] < elements[minIndex]) {
//             minIndex = k;
//         }
//     }
//     int temp = elements[j];
//     elements[j] = elements[minIndex];
//     elements[minIndex] = temp;
// }

