import java.util.Scanner;

public class Uocsonguyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            long n = sc.nextLong();
            long res = 1;
            long i = 2;
            if(sont(n))
            {
                System.out.println(n);
            }
            else
            {
                while(i<=n)
                {
                    if(n%i==0)
                    {
                        res = i;
                        n/=i;
                    }
                    else 
                    {
                        i+=1;
                    }
                }
                System.out.println(res);
            }
        }
        sc.close();
    }
    public static boolean sont(long n)
    {
        if(n<2)return false;
        if(n==2)return true;
        for(int i = 3; i<=Math.sqrt(n); i+=2)
        {
            if(n%i==0)return false;
        }
        return true;
    }
}
