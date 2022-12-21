import java.util.ArrayList;
import java.util.Collections;

public class MergekSortedArrays {
    static ArrayList<Integer> mergeKArrays(int[][] arr, int K)
    {
        // Write your code here.
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                l.add(arr[i][j]);
            }
        }
        Collections.sort(l);
        return l;
    }
}
