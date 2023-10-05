import java.util.*;

public class J03006{
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
        int i = 0;
        int j = s.length()-1;
        while(i<j)
        {
            int x = (int)s.charAt(i);
            int y = (int)s.charAt(j);
            if(x!=y)
            {
                return false;
            }
            if(x%2==1 || y%2==1)
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}