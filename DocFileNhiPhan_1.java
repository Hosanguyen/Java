import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class DocFileNhiPhan_1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        @SuppressWarnings("unchecked")
        ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
        in.close();
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
        Set<Integer> s = new TreeSet<>();
        for(int x:list)
        {
            if(!sangnt[x] && x>=100)
            {
                s.add(x);
            }
        }
        for(int x:s)
        {
            System.out.println(x);
        }
    }
}
