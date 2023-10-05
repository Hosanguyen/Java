import java.util.Scanner;

public class J02008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] BCNN = new long[105];
        BCNN[1] = 1;
        BCNN[2] = 2;
        for(int i = 3; i<105; i++)
        {
            BCNN[i] = bcnn(BCNN[i-1], i);
        }
        while(t-->0)
        {
            int n = sc.nextInt();
            System.out.println(BCNN[n]);
        }
        sc.close();
    }
    public static long ucln(long a, long b)
    {
        if(b==0)
        {
            return a;
        }
        return ucln(b, a%b);
    }
    public static long bcnn(long a, long b)
    {
        return a*b/ucln(a, b);
    }
}
