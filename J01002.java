import java.util.Scanner;

public class J01002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for(int t = 1; t<=T; t++)
        {
            long n = sc.nextLong();
            long res;
            res = n*(n+1)/2;
            System.out.println(res);
        }
        sc.close();
    }
}
