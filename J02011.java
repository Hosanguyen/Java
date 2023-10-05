import java.util.Scanner;

public class J02011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[105];
        for(int i = 0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<n-1; i++)
        {
            int index_min = i;
            for(int j = i+1; j<n; j++ )
            {
                if(a[index_min] > a[j])
                {
                    index_min = j;
                }
            }
            int tmp = a[i];
            a[i] = a[index_min];
            a[index_min] = tmp;
            System.out.print("Buoc " + (i+1) + ": ");
            for(int k = 0; k<n; k++)
            {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
