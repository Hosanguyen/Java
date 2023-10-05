import java.util.*;
public class J02105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Vector<Integer>> dske = new Vector<Vector<Integer>>(1005);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++)
        {
            Vector<Integer> tmp = new Vector<Integer>();
            for(int j = 1; j<=n; j++)
            {
                int x = sc.nextInt();
                if(x==1)
                {
                    tmp.add(j);
                }
            }
            dske.add(tmp);
        }
        int cnt = 1;
        for(Vector<Integer> x :dske)
        {
            System.out.print("List(" + cnt + ") = ");
            for(int y:x)
            {
                System.out.print(y + " ");
            }
            cnt++;
            System.out.println();
        }
        sc.close();
    }
}