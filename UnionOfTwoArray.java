import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArray {
    static int doUnion(int arr1[], int n, int arr2[], int m)
    {
        //Your code here
        Set<Integer> set3=new HashSet<Integer>();
        for (int i = 0; i < arr1.length+arr2.length; i++) {
            if(i<arr1.length){
                set3.add(arr1[i]);
            }else{
                set3.add(arr2[i-arr2.length-(n-m)]);
            }
        }
        //System.out.println(set3);
        return set3.size();
    }
}
