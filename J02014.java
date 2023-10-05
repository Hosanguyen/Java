import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] a = new int[100005];
            int[] sum = new int[100005];
            sum[0] = 0;
            sum[n+1] = 0;
            for(int i = 0; i<n; i++)
            {
                a[i] = sc.nextInt();
            }
            for(int i = n -1; i>=0; i--)
            {
                sum[i+1] = sum[i+2] + a[i];
            }
            int i = 0;
            int SumOfLeft = 0;
            while(i<n)
            {
                if(SumOfLeft == sum[i+2])
                {
                    break;
                }
                SumOfLeft+=a[i];
                i++;
            }
            if(i==n)
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println((i+1));
            }
        }
        sc.close();
    }
}
