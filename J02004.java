import java.util.Scanner;

public class J02004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] a = new int[105];
            for(int i=0; i<n; i++)
            {
                a[i] = sc.nextInt();
            }
            int i = 0;
            int j = n-1;
            boolean check = true;
            while(i<j)
            {
                if(a[i]!=a[j])
                {
                    check = false;
                    break;
                }
                i++;
                j--;
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
