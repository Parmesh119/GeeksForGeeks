import java.util.ArrayList;
import java.util.HashMap;

public class Intersectionoftwoarrays {
    static int NumberofElementsInIntersection(int nums1[], int nums2[], int n, int m) {
        // Your code here
        HashMap<Integer,Boolean> memo = new HashMap<>();
        for(int currentnum:nums1) {
            if(!memo.containsKey(currentnum)) {
                memo.put(currentnum,true);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int currentnum:nums2) {
            if(memo.containsKey(currentnum)) {
                list.add(currentnum); memo.remove(currentnum);
            }
        }
        int [] ans = new int[list.size()];
        for(int i = 0; i<list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans.length;
    }
}

