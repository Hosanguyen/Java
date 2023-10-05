import java.math.BigInteger;
import java.util.Scanner;

public class J03033{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            BigInteger a, b;
            a = new BigInteger(sc.next());
            b = new BigInteger(sc.next());
            System.out.println(bcnn(a, b));
        }
        sc.close();
    }
    public static BigInteger ucln(BigInteger a, BigInteger b)
    {
        if(b.compareTo(new BigInteger("0"))==0)
        {
            return a;
        }
        return ucln(b, a.subtract(b.multiply(a.divide(b))) );
    }
    public static BigInteger bcnn(BigInteger a, BigInteger b)
    {
        BigInteger c = ucln(a, b);
        return a.multiply(b).divide(c);
    }
}