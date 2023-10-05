import java.util.Scanner;

public class J02101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[][] a = new int[105][105];
            for(int i = 0; i<n; i++)
            {
                for(int j = 0; j<n; j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
            int cnt = 1;
            while(cnt<=n)
            {
                int x = cnt%2;
                switch(x)
                {
                    case 1:
                        for(int i = 0; i<n; i++)
                        {
                            System.out.print(a[cnt-1][i] + " ");
                        }
                        break;
                    case 0:
                        for(int i = n-1; i>=0; i--)
                        {
                            System.out.print(a[cnt-1][i]+ " ");
                        }
                        break;
                }
                cnt++;
            }
            System.out.println();
        }
        sc.close();
    }
}
