import java.util.Scanner;

public class J01018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            long n = sc.nextLong();
            if(check(n))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        sc.close();
    }
    public static boolean check(long n)
    {
        long sum = 0;
        long truoc = n%10;
        n/=10;
        sum += truoc;
        while(n>0)
        {
            long sau = n%10;
            n/=10;
            if(Math.abs(truoc-sau)!=2)return false;
            truoc = sau;
            sum += truoc;
        }
        if(sum%10!=0)return false;
        return true;
    }
}
