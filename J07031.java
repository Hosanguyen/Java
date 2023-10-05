import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07031 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
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
        ArrayList<Integer> list1 = docfile("DATA1.in");
        ArrayList<Integer> list2 = docfile("DATA2.in");
        // System.out.println(list1);
        boolean[] check1 = new boolean[1000005];
        boolean[] check2 = new boolean[1000005];
        for(int x:list1)
        {
            check1[x] = true;
        }
        for(int x:list2)
        {
            check2[x] = true;
        }
        for(int n = 2; n<500000; n++)
        {
            if(!sangnt[n])
            {
                int m = 1000000-n;
                if(!sangnt[m])
                {
                    if(check1[n] && check1[m] && !check2[n] && !check2[m])
                    {
                        System.out.println(n + " " + m);
                    }
                }
            }
        }
    }
    public static ArrayList<Integer> docfile(String file) throws IOException, ClassNotFoundException
    {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        // ArrayList<Integer> tmp = new ArrayList<>();
        // try{
            @SuppressWarnings("unchecked")
            ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
            in.close();
            return list;
        // } catch (ClassNotFoundException ex)
        // {
        //     ex.printStackTrace();
        // }
        // in.close();
        // return null;
    }
}
