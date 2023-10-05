import java.io.*;

public class test_binary_file {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new FileInputStream("JAVA\\test.in"));
        int a[] = new int[1000];
        for(int i = 0; i<100000; i++)
        {
            a[in.readInt()]++;
        }
        for(int i = 1; i<1000; i++)
        {
            if(a[i]>0)
            {
                System.out.println(i + " " + a[i]);
            }
        }
        in.close();
    }
}
