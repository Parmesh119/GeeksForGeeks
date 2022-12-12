import java.util.Arrays;

public class LargestElementInAnArray {
    static int largest(int arr[], int n)
    {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
