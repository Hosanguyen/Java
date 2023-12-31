import java.util.Scanner;

public class J01021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a;
        long b;
        while(true)
        {
            a = sc.nextLong();
            b = sc.nextLong();
            if(a==0 && b==0)break;
            System.out.println(power(a, b));
        }
        sc.close();
    }
    public static final long mod = 1000000007;
    public static long power(long a, long b)
    {
        long res = 1;
        while(b>0)
        {
            if(b%2==1)
            {
                res = res*a%mod;
            }
            a = a*a%mod;
            b/=2;
        }
        return res;
    }
}
