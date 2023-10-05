import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07015 {
    public static void main(String[] args) throws IOException {
        int[] cnt = new int[10005];
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        try{
            @SuppressWarnings("unchecked") 
            ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
            for(int x:list)
            {
                if(nt(x))
                {
                    cnt[x]++;
                }
            }
            in.close();
        }  catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        for(int i = 0; i<10005; i++)
        {
            if(cnt[i]>0)
            {
                System.out.println(i + " " + cnt[i]);
            }
        }
    }
    private static boolean nt(int n)
    {
        if(n==2)
        {
            return true;
        }
        if(n%2==0 || n<2)
        {
            return false;
        }
        for(int i = 3; i<= Math.sqrt(n); i+=2)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
