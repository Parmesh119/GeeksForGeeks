public class SerachingAnElementInSortedArray {
    static int searchInSorted(int arr[], int N, int K)
    {

        // Your code here
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==K){
                return 1;
            }else if(arr[mid]>K){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
}
