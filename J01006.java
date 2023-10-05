import java.util.Scanner;

public class J01006 {
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
            int n = sc.nextInt();
            System.out.println(F[n]);
        }
        sc.close();
    }
}
