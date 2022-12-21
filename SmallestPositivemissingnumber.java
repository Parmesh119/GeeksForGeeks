import java.util.Arrays;

public class SmallestPositivemissingnumber {
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        Arrays.sort(arr);
        int[] nums=new int[arr[size-1]+2];
        for(int i=0; i<size; i++)
        {
            if(arr[i]>0)
            {
                nums[arr[i]]=1;
            }
        }
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]==0)
                return i;
        }
        return size+1;
    }
}
