import java.io.*;
import java.util.*;

public class test{
    public static void main(String[] args) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("JAVA\\test1.in"));
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<1000000; i++)
        {
            list.add(i%1000);
        }
        // ArrayList<String> list = new ArrayList<>();
        // String s = "Nguyen Thien Hoa 12a4 hosa kakus 1412 alo t-rex SPiNo Math Physics algorithm t-rex SPiNo" + //
        //         "Math Physics algorithm";
        // for(String x:s.split(" "))
        // {
        //     list.add(x);        
        // }
        out.writeObject(list);
        out.close();
    }
}