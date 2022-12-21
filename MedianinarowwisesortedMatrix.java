import java.util.ArrayList;
import java.util.Arrays;

public class MedianinarowwisesortedMatrix {
    int median(int matrix[][], int R, int C) {
        // code here
        int[] arr=new int[R*C];
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                l.add(matrix[i][j]);
            }
        }
        for(int i=0;i<l.size();i++){
            arr[i]=l.get(i);
        }
        Arrays.sort(arr);
        if(arr.length%2==0){
            int ans1=arr[(arr.length-1)/2];
            System.out.println(ans1);
            int ans2=arr[(arr.length)/2];
            System.out.println(ans2);
            int ans=(ans1+ans2)/2;
            return ans;
            //return arr[(arr.length-1/2)]+arr[((arr.length-1/2)+1)];
        }
        return arr[(arr.length+1-1)/2];
    }
}
