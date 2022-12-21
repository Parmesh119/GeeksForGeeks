import java.util.Arrays;

public class FloorinaSortedArray {
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        Arrays.sort(arr);
        int i=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]>x){
                break;
            }
        }
        return i-1;
    }
}
