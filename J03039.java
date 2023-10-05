import java.math.BigInteger;
import java.util.Scanner;

public class J03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            BigInteger a, b;
            a = new BigInteger(sc.next());
            b = new BigInteger(sc.next());
            BigInteger tmp = a.min(b);
            a = a.max(b);
            b = tmp;
            BigInteger c = a.subtract(b.multiply(a.divide(b)));
            if(c.compareTo(new BigInteger("0"))==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
