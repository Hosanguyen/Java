import java.util.Scanner;

public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[] a = new int[105];
        int[] b = new int[105];
        boolean[] check = new boolean[1005];
        for(int i = 0; i<n; i++)
        {
            a[i] = sc.nextInt();
            check[a[i]] = true;        
        }
        for(int i = 0; i<m; i++)
        {
            b[i] = sc.nextInt();
            check[b[i]] = true;
        }
        for(int i = 1; i<1005; i++)
        {
            if(check[i])
            {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
