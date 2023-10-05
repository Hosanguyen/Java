import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07029 {
    public static void main(String[] args) throws IOException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        boolean[] sangnt = new boolean[1000005];
        sangnt[0] = sangnt[1] = true;
        for(int i = 2; i<1000005; i++)
        {
            if(!sangnt[i])
            {
                for(int j = i*2; j<1000005; j+=i)
                {
                    sangnt[j] = true;
                }
            }
        }
        try{
            @SuppressWarnings("unchecked")
            ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
            int[] cnt = new int[1000005];
            for(int x:list)
            {
                if(!sangnt[x])
                {
                    cnt[x]++;
                }
            }
            int dem = 0;
            for(int i = 1000000; i>=0; i--)
            {
                if(cnt[i]>0)
                {
                    System.out.println(i + " " + cnt[i]);
                    dem++;
                }
                if(dem==10)
                {
                    break;
                }
            }
            in.close();

        } catch(ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}
