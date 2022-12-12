import java.util.ArrayList;

public class ValueEqualToIndexValue {
    class Solution {
        ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
            // code here
            //Arrays.sort(arr);
            ArrayList<Integer> l=new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                if(arr[i]==i+1){
                    l.add(arr[i]);
                }
            }
            return l;
        }
    }
}
