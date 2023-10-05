import java.util.Scanner;

public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long cnt4 = 0, cnt7 = 0;
        while(N>0)
        {
            long tmp = N % 10;
            if(tmp == 4)cnt4++;
            if(tmp == 7)cnt7++;
            N/=10;
        }
        if((cnt4 + cnt7) == 4 || (cnt4 + cnt7) == 7)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        sc.close();
    }
}
