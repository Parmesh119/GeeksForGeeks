public class Findtheelementthatappearsonceinsortedarray {
    int findOnce(int arr[], int n)
    {
        // Complete this function
        int u=0;
        for(int i:arr){
            u^=i;
        }
        return u;
    }
}
