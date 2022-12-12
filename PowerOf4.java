public class PowerOf4 {
    static int isPowerOfFour(long n)
    {
        // Your code here
        boolean ans=false;
        int i=0;
        double num=n;
        while(num>=Math.pow(4,i)) {
            if (num == Math.pow(4, i)) {
                ans = true;
                break;
            }
            i++;
        }
        if(!ans){
            return 0;
        }
        return 1;
    }
}
