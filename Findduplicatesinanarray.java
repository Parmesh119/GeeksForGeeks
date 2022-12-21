import java.util.*;

public class Findduplicatesinanarray {
    static ArrayList<Integer> duplicates(int nums[], int n) {
        // code here
        Arrays.sort(nums);
        ArrayList<Integer> l=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[i-1]){
                set.add(nums[i]);
            }
        }
        if(set.size()==0){
            set.add(-1);
        }
        for(int j:set){
            l.add(j);
        }
        Collections.sort(l);
        return l;
    }
}
