public class PalindromeString {
    int isPalindrome(String S) {
        // code here
        StringBuilder b=new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            b.append(S.charAt(i));
        }
        b.reverse();
        String str=b.toString();
        //System.out.println(b.reverse());
        if(S.equals(str)){
            return 1;
        }
        return 0;
    }
}
