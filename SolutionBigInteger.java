import java.util.*;
import java.math.*;
public class SolutionBigInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        BigInteger b3;
        b3 = a.add(b);
        System.out.println(b3);
        b3 =a.multiply(b);
        System.out.println(b3);
    }
}
