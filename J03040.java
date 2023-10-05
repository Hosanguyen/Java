import java.util.Scanner;

public class J03040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            s = s.substring(5, 8) + s.substring(9);
            if(check_xau_dep(s))
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
    public static boolean check_xau_dep(String s)
    {
        boolean check = true;
        for(int i = 0; i<s.length()-1; i++)
        {
            if(s.charAt(i)>=s.charAt(i+1))
            {
                check = false;
            }
        }
        if(check)
        {
            return true;
        }
        check = true;
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)!='5')
            {
                check = false;
            }
        }
        if(check)
        {
            return true;
        }
        check = true;
        if(s.charAt(0)==s.charAt(1) && s.charAt(1)==s.charAt(2) && s.charAt(3)==s.charAt(4))
        {
            return true;
        }
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)!='6' && s.charAt(i)!='8')
            {
                check = false;
            }
        }
        if(check)
        {
            return true;
        }
        return false;
    }
}
