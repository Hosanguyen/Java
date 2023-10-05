import java.util.Scanner;

public class J03024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String n = sc.next();
            if(!check(n))
            {
                System.out.println("INVALID");
            }
            else
            {
                if(solve(n))
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
    public static boolean check(String s)
    {
        if(s.charAt(0)=='0')
        {
            return false;
        }
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i) < '0' || s.charAt(i) >'9')
            {
                return false;
            }
        }
        return true;
    }
    public static boolean solve(String s)
    {
        int cntOdd = 0;
        int cntEven = 0;
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)%2==0)
            {
                cntEven++;
            }
            else
            {
                cntOdd++;
            }
        }
        if(cntEven==cntOdd)
        {
            return false;
        }
        if(s.length()%2==0)
        {
            if(cntOdd>cntEven)
            {
                return false;
            }
        }
        else
        {
            if(cntEven>cntOdd)
            {
                return false;
            }
        }
        return true;
    }
}
