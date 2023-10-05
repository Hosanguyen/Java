import java.util.Scanner;

public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int r=1; r<=t; r++)
        {
            long n = sc.nextLong();
            int[] res = new int[30];
            boolean check = true;
            int i = 0;
            while(n>0)
            {
                long tmp = n%10;
                n/=10;
                int x = trade(tmp);
                if(x==-1)
                {
                    check = false;
                    break;
                }
                else
                {
                    res[i] = x;
                    i++;
                }
            }
            if(check)
            {
                int j = i-1;
                while(j>=0 && res[j]==0)j--;
                if(j==-1)
                {
                    System.out.print("INVALID");
                }
                else
                {
                    while(j>=0)
                    {
                        System.out.print(res[j]);
                        j--;
                    }
                }
            }
            else
            {
                System.out.print("INVALID");
            }
            System.out.println();
        }
        sc.close();
    }
    public static int trade(long a)
    {
        if(a==0 || a==8 || a==9)return 0;
        if(a==1)return 1;
        return -1;
    }
}