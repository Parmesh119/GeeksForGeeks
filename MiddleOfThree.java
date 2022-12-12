import java.util.Arrays;

public class MiddleOfThree {
    static int middle(int A, int B, int C){
        //code here
        int[] arr=new int[3];
        arr[0]=A;
        arr[1]=B;
        arr[2]=C;
        Arrays.sort(arr);
        return arr[1];
    }
}
