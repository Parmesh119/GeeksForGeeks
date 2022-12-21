import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    static int findSum(int A[],int N)
    {
        //code here
        Arrays.sort(A);
        return A[0]+A[A.length-1];
    }
}
