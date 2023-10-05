import java.util.Scanner;

public class J03007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s = sc.nextLine();
            if(check(s))
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
    public static boolean check(String s)
    {
        int sum = 0;
        int i = 0;
        int j = s.length()-1;
        if(s.charAt(i)!='8' || s.charAt(j)!='8')
        {
            return false;
        }
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            sum += (int)s.charAt(i) - (int)'0';
            sum += (int)s.charAt(j) - (int)'0';
            i++;
            j--;
        }
        if(i==j)
        {
            sum += (int)s.charAt(i) - (int)'0';
        }
        if(sum%10!=0)
        {
            return false;
        }
        return true;
    }
}
