import java.util.Arrays;

public class FindTheMedian {
    static int find_median(int[] v)
    {
        // Code here
        Arrays.sort(v);
        if(v.length%2==0){
            int n=(v.length/2)-1;
            int num=(v.length+1)/2;
            return (v[n]+v[num])/2;
        }else{
            int answer=(v.length+1)/2-1;
            return v[answer];
        }
    }
}
