import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int r = 1; r<=t; r++)
        {
            int n = sc.nextInt();
            int[] a = new int[105];
            int[] check = new int[100005];
            for(int i = 0; i<n; i++)
            {
                a[i] = sc.nextInt();
                check[a[i]]++;
            }
            System.out.println("Test " + r +":");
            for(int i = 0; i<n; i++)
            {
                if(check[a[i]]>0)
                {
                    System.out.println(a[i] + " xuat hien " + check[a[i]] + " lan");
                    check[a[i]] = 0;
                }
            }
        }
        sc.close();
    }   
}
