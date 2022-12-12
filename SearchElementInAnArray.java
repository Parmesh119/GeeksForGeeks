public class SearchElementInAnArray {
    static int search(int arr[], int N, int X)
    {

        // Your code here
        //Arrays.sort(arr);
        int s=0;
        for(s=0;s<N;s++){
            if(arr[s]==X){
                return s;
            }
        }
        return -1;
    }
}
