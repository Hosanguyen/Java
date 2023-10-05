import java.util.Scanner;

public class J01014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            long n = sc.nextLong();
            long res = 1;
            for(long i = 1; i<=(long)Math.sqrt(n); i++)
            {
                if(n%i==0)
                {
                    if(nt(i))
                    {
                        if(i>res)res = i;
                    }
                    if(nt(n/i))
                    {
                        res = n/i;
                        break;
                    }
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
    public static boolean nt(long n)
    {
        if(n==2)return true;
        if(n<2 || n%2==0)return false;
        for(long i = 3; i<=(long)Math.sqrt(n); i+=2)
        {
            if(n%i==0)return false;
        }
        return true;
    }
}
