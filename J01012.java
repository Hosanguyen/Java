import java.util.Scanner;

public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            //phan tich n = 2^m * x
            int m = 0;
            int k = 0;
            while(n%2==0)
            {
                m++;
                n/=2;
            }
            if(m==0)
            {
                System.out.println(0);
            }
            else
            {
                if(n>1)k++;
                for(int i = 3; i<=Math.sqrt(n); i++)
                {
                    if(n%i==0)
                    {
                        if(n/i!=i)
                        {
                            k+=2;
                        }
                        else
                        {
                            k++;
                        }
                    }
                }
                System.out.println(m*(k+1));
            }
        }
        sc.close();
    }
}
