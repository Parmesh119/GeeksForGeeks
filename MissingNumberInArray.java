import java.util.Arrays;

public class MissingNumberInArray {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        Arrays.sort(array);
        int i=0;
        while(i<array.length){
            if(array[i]!=i+1){
                return i+1;
            }
            i++;
        }
        return array.length+1;
    }
}
