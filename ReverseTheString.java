public class ReverseTheString {
    static String reverseWord(String str)
    {
        // Reverse the string str
        //String str1=input.nextLine(), n
        String nstr="";
        char ch;

        //System.out.println("Original word: "+str);
        //System.out.println("Geeks"); //Example word

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }

        //System.out.println("Reversed word: "+ nstr);
        return nstr;
    }
}
