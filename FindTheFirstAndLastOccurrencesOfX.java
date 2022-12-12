import java.util.ArrayList;

public class FindTheFirstAndLastOccurrencesOfX {
    static ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> l=new ArrayList<>();
        boolean ans1=false;
        boolean ans2=false;
        long first=0,last=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                first=i;
                ans1=true;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==x){
                last=i;
                ans2=true;
            }
        }
        if(ans2){
            l.add(last);
        }if(ans1){
        l.add(first);
    }
        if(l.size()>0){
            return l;
        }
        l.clear();
        l.add((long)-1);
        l.add((long)-1);
        return l;
    }
}
