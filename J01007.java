import java.util.Scanner;

public class J01007 {
    public static void main(String[] args) {
        long[] F = new long[93];
        F[0] = 0;
        F[1] = 1;
        for(int i=2; i<=92; i++)
        {
            F[i] = F[i-1] + F[i-2];
        }
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        for(int r = 1; r<=t; r++)
        {
            long n = sc.nextLong();
            int i = 0;
            for(; i<=92; i++)
            {
                if (n==F[i])
                {
                    break;
                }
            }
            if(i>92)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
