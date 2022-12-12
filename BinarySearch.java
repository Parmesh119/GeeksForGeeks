public class BinarySearch {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==k){
                return mid;
            }else if(arr[mid]<k){
                s=mid+1;
            }else if(arr[mid]>k){
                e=mid-1;
            }

        }
        return -1;
    }
}
