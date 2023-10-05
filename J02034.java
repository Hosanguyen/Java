import java.util.Scanner;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[105];
        for(int i = 1; i<=n; i++)
        {
            a[i] = sc.nextInt();
        }
        a[0] = 0;
        boolean check = false;
        for(int i = 0; i<n; i++)
        {
            int tmp = a[i] + 1;
            while(tmp < a[i+1])
            {
                System.out.println(tmp);
                tmp++;
                check = true;
            }
        }
        if(!check)
        {
            System.out.println("Excellent!");
        }
        sc.close();
    }
    
}
