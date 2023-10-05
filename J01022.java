import java.util.Scanner;

public class J01022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] F = new long[95];
        F[1] = 1;
        F[2] = 1;
        for(int i = 3; i<95; i++)
        {
            F[i] = F[i-1] + F[i-2];
        }
        while(t-->0)
        {
            int n;
            long k;
            n = sc.nextInt();
            k = sc.nextLong();
            System.out.println(xau_nhi_phan(F, n, k));
        }
        sc.close();
    }
    public static int xau_nhi_phan(long[] F, int n, long k)
    {
        if(n==1)return 0;
        if(n==2)return 1;
        if(k<=F[n-2])
        {
            return xau_nhi_phan(F, n-2, k);
        }
        return xau_nhi_phan(F, n-1, k-F[n-2]);
    }
}
