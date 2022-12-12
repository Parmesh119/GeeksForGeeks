public class ImplementStrStr {
    static int strstr(String s, String x)
    {
        // Your code here
        if(s.contains(x)){
            return s.indexOf(x);
        }
        return -1;

    }
}
