import java.util.Scanner;
//import java.lang.Math;

public class J01013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum = 0;
        boolean[] nt = new boolean[2000005];
        nt[0] = true;
        nt[1] = true;
        for(int i = 2; i<2000005; i++)
        {
            if(!nt[i])
            {
                for(int j = i*2; j<2000005; j+=i)
                {
                    nt[j] = true;
                }
            }
        }
        int[] res = new int[2000005];
        res[0] = 0;
        res[1] = 0;
        for(int i = 2; i<2000005; i++)
        {
            if(!nt[i])
            {
                res[i] = i;
            }
            else
            for(int j = 2; j<=Math.sqrt(i); j++)
            {
                if(i%j==0)
                {
                    res[i] = j + res[i/j];
                    break;
                }
            }
        }
        // for(int i = 0; i<=100; i++)
        // {
        //     System.out.println(res[i]);
        // }
        while(t-->0)
        {
            int n = sc.nextInt();
            sum += res[n];
        }
        System.out.println(sum);
        sc.close();   
    }
}
