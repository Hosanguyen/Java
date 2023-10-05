import java.util.Scanner;

public class J03025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            if(mistake(s))
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
    public static boolean mistake(String s)
    {
        int cnt = 0;
        int i = 0;
        int j = s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                cnt++;
            }
            i++;
            j--;
        }
        if(cnt>1)
        {
            return false;
        }
        if(cnt==0)
        {
            if(s.length()%2==0)
            {
                return false;
            }
            return true;
        }
        return true;
    }
}
