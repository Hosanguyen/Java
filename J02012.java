import java.util.Scanner;

public class J02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[105];
        for(int i = 0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        int[] res = new int[105];
        int res_size = 0;
        for(int i = 0; i<n; i++)
        {
            if(res_size==0)
            {
                res_size++;
                res[0] = a[i];
            }
            else
            {
                int j = 0;
                while((j<res_size) && (res[j]<a[i]))
                {
                    j++;
                }
                for(int k = res_size; k>j; k--)
                {
                    res[k] = res[k-1];
                }
                res[j] = a[i];
                res_size++;
            }
            System.out.print("Buoc " + i + ": ");
            for(int k = 0; k<res_size; k++)
            {
                System.out.print(res[k] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
