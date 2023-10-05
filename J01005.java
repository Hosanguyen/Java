//import java.text.DecimalFormat;
import java.util.Scanner;
 
public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            long N, H;
            N = sc.nextLong();
            H = sc.nextLong();
            for(int i=1; i<N; i++)
            {
                
                System.out.print(String.format("%.6f", Math.sqrt((double)(i * (double)H*H/N)) ) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
