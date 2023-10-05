import java.util.Scanner;

public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean check = false;
        int i = 0;
        while(true)
        {
            if(s.length()==1)
            {
                check = true;
                break;
            }
            if(s.length()==0)
            {
                break;
            }
            if(s.charAt(i)==s.charAt(i+1))
            {
                s = s.substring(0, i) + s.substring(i+2);
                if(i>0)
                {
                    i-=1;
                }
            }
            else
            {
                i+=1;
            }
            if(i==s.length()-1)
            {
                check = true;
                break;
            }
        }
        if(check)
        {
            System.out.println(s);
        }
        else
        {
            System.out.println("Empty String");
        }
        sc.close();
    }
}
