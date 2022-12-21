import java.util.ArrayList;
import java.util.Arrays;

public class klargestelements {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=arr.length-1;i>=arr.length-k;i--){
            l.add(arr[i]);
        }
        int[] nums=new int[l.size()];
        for(int i=0;i<l.size();i++){
            nums[i]=l.get(i);
        }
        return nums;
    }
}
