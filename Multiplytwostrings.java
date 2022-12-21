import java.math.BigInteger;

public class Multiplytwostrings {
    String multiplyStrings(String s1,String s2)
    {
        BigInteger m1=new BigInteger(s1),m2=new BigInteger(s2);

        return (m1.multiply(m2)).toString();
    }
}
