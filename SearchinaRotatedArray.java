public class SearchinaRotatedArray {
    int search(int A[], int l, int h, int key)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        for(int i=0;i<A.length;i++){
            if(A[i]==key){
                return i;
            }
        }
        return -1;
    }
}
