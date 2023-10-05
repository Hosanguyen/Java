import java.util.Scanner;

public class J01008{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int r = 1; r<=t; r++)
        {
            int n = sc.nextInt();
            System.out.print("Test " + r + ": " );
            if(n==1)
            {
                System.out.println(n + "(1) ");
            }
            else
            {
                for(int i=2; i<=n; i++)
                {
                    if(n%i==0)
                    {
                        int cnt = 0;
                        while(n%i==0)
                        {
                            n/=i;
                            cnt++;
                        }
                        System.out.print(i + "(" + cnt + ") ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}