import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J02005 {
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
        Set<Integer> s = new TreeSet<>();
        for(int i = 0; i<m; i++)
        {
            b[i] = sc.nextInt();
            s.add(b[i]);
        }
        for(int x:s)
        {
            if(check[x])
            {
                System.out.print(x + " ");
            }
        }
        sc.close();
    }
}
