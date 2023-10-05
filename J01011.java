import java.util.Scanner;

public class J01011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(bcnn(a, b) + " " + ucln(a, b));
        }
        sc.close();
    }
    public static int ucln(int a, int b)
    {
        if(b==0)return a;
        return ucln(b, a%b);
    }
    public static long bcnn(int a, int b)
    {
        return (long)a*b/ucln(a, b);
    }
}
