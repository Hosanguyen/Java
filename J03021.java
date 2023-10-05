import java.util.Scanner;

public class J03021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] check = new int[26];
        for(int i = 0; i<15; i+=3)
        {
            check[i] = (int)i/3;
            check[i+1] = (int)i/3;
            check[i+2] = (int)i/3;
        }
        check[15] = check[16] = check[17] = check[18] = 5;
        check[19] = check[20] = check[21] = 6;
        check[22] = check[23] = check[24] = check[25] = 7;
        while(t-->0)
        {
            String s = sc.next();
            s = s.toUpperCase();
            int i = 0;
            int j = s.length()-1;
            while(i<j)
            {
                if(check[s.charAt(i) - 'A'] != check[s.charAt(j) - 'A'])
                {
                    break;
                }
                i++;
                j--;
            }
            if(i<j)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
