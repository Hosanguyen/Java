import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SapXepMaTran {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[][] a = new int[105][105];
            for(int i = 0; i<n; i++)
            {
                for(int j = 0 ; j<m; j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i<n-1; i++)
            {
                for(int j = i+1; j<n; j++)
                {
                    if(a[i][k-1]>a[j][k-1])
                    {
                        int tmp = a[i][k-1];
                        a[i][k-1] = a[j][k-1];
                        a[j][k-1] = tmp;
                    }
                }
            }
            for(int i = 0; i<n; i++)
            {
                for(int j = 0; j<m; j++)
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
