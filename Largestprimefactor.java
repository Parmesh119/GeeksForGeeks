import java.util.ArrayList;

public class Largestprimefactor {
    static long largestPrimeFactor(int n) {
        // code here
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                l.add(i);
            }
        }
        ArrayList<Integer> ls=new ArrayList<>();
        for (int i = 1; i < l.size(); i++) {
            for (int j = 2; j <= l.get(i); j++) {
                if(l.get(i)==j){
                    ls.add(l.get(i));
                    break;
                }else{
                    if(l.get(i)%j==0){
                        break;
                    }
                }
            }
        }
        return ls.get(ls.size()-1);
    }
}
