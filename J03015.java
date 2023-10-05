import java.util.Scanner;

public class J03015 {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
            String a, b;
            a = sc.next();
            b = sc.next();
            System.out.println(sub(a, b));
        sc.close();
    }
    public static String sub(String a, String b)
    {
        boolean check = false;
        while(a.length()<b.length())
        {
            a = "0" + a;
        }
        while(b.length()<a.length())
        {
            b = "0" + b;
        }
        // if(a==b)
        // {
        //     return "0";
        // }
        for(int i = 0; i<a.length(); i++)
        {
            if(a.charAt(i) < b.charAt(i))
            {
                String tmp = a;
                a = b;
                b = tmp;
                check = true;
                break;
            }
            else
            {
                if(a.charAt(i)>b.charAt(i))
                {
                    break;
                }
            }
        }
        int memo = 0;
        String res = "";
        for(int i = a.length()-1; i>=0; i--)
        {
            int ofa = a.charAt(i) - '0' - memo;
            int ofb = b.charAt(i) - '0';
            if(ofa<ofb)
            {
                ofa += 10;
                memo = 1;
            }
            else
            {
                memo = 0;
            }
            res = String.valueOf(ofa - ofb) + res;
        }
        int i = 0;
        while(i < res.length()-1 && res.charAt(i)=='0')
        {
            i++;
        }
        res = res.substring(i);
        if(check)
        {
            res = "-" + res;
        }
        return res;
    }
}
