public class FindMinimumAndMaximumElementInAnArray {
    static int[] getMinMax(long a[], long n)
    {
        //Write your code here
        int[] minimaxi=new int[2];
        minimaxi[0]=(int)a[0];
        minimaxi[1]=(int)a[a.length-1];
        return minimaxi;
    }

}
