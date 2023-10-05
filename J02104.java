import java.util.*;
public class J02104 {
    static int key, value;
    public static Object[] getPair(){
        return new Object[] {key, value};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int[][] a = new int[1005][1005];
        Vector<Integer> dscanh = new Vector<Integer>();
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=n; j++)
            {
                int x = sc.nextInt();
                if(j>i && x!=0)
                {
                    dscanh.add(i);
                    dscanh.add(j);
                }
            }
        }
        for(int i = 0 ; i<dscanh.size(); i+=2)
        {
            System.out.println("(" + dscanh.elementAt(i) + "," + dscanh.elementAt(i+1) +")");
        }
        sc.close();
    }
}
