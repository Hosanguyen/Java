import java.util.Scanner;

public class J03008 {
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
        boolean[] checked = new boolean[10];
        checked[2] = true;
        checked[3] = true;
        checked[5] = true;
        checked[7] = true;
        int i = 0;
        int j = s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            if(!checked[s.charAt(i) - '0'])
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
