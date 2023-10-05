import java.util.Scanner;

public class J01024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n;
            n = sc.nextInt();
            boolean check = true;
            while(n>0)
            {
                int tmp = n%10;
                n/=10;
                if(tmp>2)
                {
                    check = false;
                    break;
                }
            }
            if(check)
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
}
