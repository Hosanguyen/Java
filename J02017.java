import java.util.Scanner;
import java.util.Stack;

public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100005];
        for(int i = 0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0; i<n; i++)
        {
            if(st.empty())
            {
                st.push(a[i]);
            }
            else
            {
                int x = st.pop();
                if((x+a[i])%2==1)
                {
                    st.push(x);
                    st.push(a[i]);
                }
            }
        }
        System.out.println(st.size());
        sc.close();
    }   
}
