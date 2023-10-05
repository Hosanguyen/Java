import java.util.Scanner;

public class J02013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[105];
        for(int i = 0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        int test = 1;
        while(true)
        {
            boolean check = false;
            for(int i = 0; i<n-1; i++)
            {
                if(a[i]>a[i+1])
                {
                    check = true;
                    int tmp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = tmp;
                }
            }
            if(!check)
            {
                break;
            }
            else
            {
                System.out.print("Buoc " + test + ": ");
                for(int k = 0; k<n; k++)
                {
                    System.out.print(a[k] + " ");
                }
                System.out.println();
                test++;
            }
        }
        sc.close();
    }
}
