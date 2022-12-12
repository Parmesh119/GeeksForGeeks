public class Print1ToNWithOutLoop {
    static void printNos(int N)
    {
        //Your code here
        if (N==0){
            return;
        }
        printNos(N-1);
        System.out.print(N + " ");
    }
}
