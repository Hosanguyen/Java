import java.util.Scanner;

public class J03011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            long a = sc.nextLong();
            sc.nextLine();
            String b = sc.nextLine();
            System.out.println(solve(b, a));
        }
        sc.close();
    }
    public static long solve(String a, long b)
    {
        long mod = modulo(a, b);
        return gcd(b, mod);
    }
    public static long modulo(String a, long b)
    {
        long res = 0;
        for(int i = 0; i<a.length(); i++)
        {
            res = res*10 + (a.charAt(i) - '0');
            res %= b;
        }
        return res;
    }
    public static long gcd(long a, long b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b, a%b);
    }
}
