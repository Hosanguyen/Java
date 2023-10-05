import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tong_giaithua(n));
        sc.close();
    }
    public static long tong_giaithua(int n)
    {
        if(n==1)return 1;
        return giaithua(n) + tong_giaithua(n-1);
    }
    public static long giaithua(int n)
    {
        if(n==1)return 1;
        return n*giaithua(n-1);
    }
}
