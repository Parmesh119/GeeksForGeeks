import java.util.Arrays;

public class KthelementoftwosortedArrays {
    long kthElement( int arr1[], int arr2[], int n, int m, int x) {

        int[] ans = new int[n+m];
        int i = 0;
        int j = 0;
        int k = 0;

        // traverse the arr1 and insert its element in arr3
        while(i < n){
            ans[k++] = arr1[i++];
        }

        // now traverse arr2 and insert in arr3
        while(j < m){
            ans[k++] = arr2[j++];
        }

        Arrays.sort(ans);
        return ans[x-1];

    }
}
