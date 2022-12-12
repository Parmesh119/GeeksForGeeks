import java.util.Arrays;

public class CheckIfTwoArraysAreEqualOrNot {
    static boolean check(long A[],long B[],int N)
    {
        //Your code here
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<A.length;i++){
            if(A[i]!=B[i]){
                return false;
            }
        }
        return true;
    }
}
