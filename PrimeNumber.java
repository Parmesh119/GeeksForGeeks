public class PrimeNumber {
    static int isPrime(int N){
        // code here
        int ans=1;
        if(N==1){
            ans=0;
        }
        for(int i=2;i*i<=N;i++){
            if(N%i==0){
                ans=0;
                break;
            }
        }
        return ans;
    }
}
