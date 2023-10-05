import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J07040 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        @SuppressWarnings("unchecked")
        ArrayList<String> list = (ArrayList<String>) in.readObject();
        in.close();
        Map<String, Boolean> mp = new HashMap<>();
        for(String x:list)
        {
            for(String s:x.split(" "))
            {
                s = s.toLowerCase();
                mp.put(s, false);
            }
        }
        Scanner sc = new Scanner(new File("VANBAN.in"));
        ArrayList<String> res = new ArrayList<>();
        while(sc.hasNext())
        {
            String s = sc.next();
            s = s.toLowerCase();
            if(mp.containsKey(s)){
                if( mp.get(s) == false )
                {
                    res.add(s);
                    mp.put(s,   true);
                }
            }
        }
        sc.close();
        for(String s:res)
        {
            System.out.println(s);
        }
    }
}
