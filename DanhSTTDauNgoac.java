import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class DanhSTTDauNgoac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            String s = sc.nextLine();
            Stack<String> st = new Stack<>();
            Stack<Integer> count = new Stack<>();
            ArrayList<Integer> list = new ArrayList<>();
            int cnt = 0;
            for(int i = 0; i<s.length(); i++)
            {
                if(s.charAt(i)=='(')
                {
                    st.push(String.valueOf(s.charAt(i)));
                    cnt++;
                    count.push(cnt);
                    list.add(cnt);
                }
                if(s.charAt(i)==')')
                {
                    st.pop();
                    int x = count.pop();
                    list.add(x);
                }
            }
            for(int x:list)
            {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        sc.close();
    }    
}
