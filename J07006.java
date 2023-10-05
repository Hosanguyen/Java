import java.io.*;
import java.util.*;

public class J07006 {
    public static void main(String[] args) throws IOException {
        try{
            
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
            @SuppressWarnings("unchecked") ArrayList<Integer> list = (ArrayList<Integer>)in.readObject();
            int[] cnt = new int[1000];
            for(Integer x:list)
            {
                cnt[x]++;
            }
            for(int i = 0; i<1000; i++)
            {
                if(cnt[i] > 0)
                {
                    System.out.println(i + " " + cnt[i]);
                }
            }
            in.close();
        } catch(ClassNotFoundException ex)
        {
            ex.printStackTrace();
        } catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
