public class Factorial {
    static long factorial(int N){
        int i;
        long f=1;
        for(i=1;i<=N;i++){
            f=f*i;
        }
        return f;
    }
}
