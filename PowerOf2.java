public class PowerOf2 {
    static boolean isPowerofTwo(long n){

        // Your code here
        boolean ans=false;
        int i=0;
        double num=n;
        while(num>=Math.pow(2,i)) {
            if (num == Math.pow(2, i)) {
                ans = true;
                break;
            }
            i++;
        }
        return ans;
    }
}
