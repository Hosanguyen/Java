import java.util.Scanner;

public class J02021 {
    static int[] x = new int[100];
    static int n, k;
    static int cnt = 0;
    public static void Init()
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        x[0] = 0;
        sc.close();
    }
    public static void main(String[] args) {
        Init();
        tohop(1);
        System.out.println();
        System.out.println("Tong cong co "  + cnt + " to hop");
    }
    public static void result()
    {
        for(int i = 1; i<=k; i++)
        {
            System.out.print(x[i]);
        }
        System.out.print(" ");
    }
    public static void tohop(int i)
    {
        for(int j = x[i-1]+1; j<= n-k+i; j++)
        {
            x[i] = j;
            if(i==k)
            {
                result();
                cnt++;
            }
            else tohop(i+1);
        }
    }
}
