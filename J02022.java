import java.util.Scanner;

public class J02022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            n = sc.nextInt();
            so_xa_cach(1);
            System.out.println();
        }
        sc.close();
    }
    static int[] x = new int[15];
    static int n;
    static boolean[] check = new boolean[15];
    static boolean checked()
    {
        for(int i = 2; i<=n; i++)
        {
            if(Math.abs(x[i] - x[i-1])==1)return false;
        }
        return true;
    }
    static void result()
    {
        if(!checked())return;
        for(int i = 1; i<=n; i++)
        {
            System.out.print(x[i]);
        }
        System.out.println();
    }
    static void so_xa_cach(int i)
    {
        for(int j = 1; j<=n; j++)
        {
            if(!check[j])
            {
                x[i] = j;
                check[j] = true;
                if(i==n)
                {
                    result();
                }
                else 
                {
                    so_xa_cach(i+1);
                }
                check[j] = false;
            }
        }
    }
}
