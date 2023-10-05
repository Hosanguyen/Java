// import java.io.ObjectInputStream;
// import java.util.ArrayList;
// import java.io.FileInputStream;
// import java.io.IOException;

// public class J07032 {
//     public static void main(String[] args) throws IOException {
//         ArrayList<Integer> list1 = docfile("DATA1.in");
//         ArrayList<Integer> list2 = docfile("DATA2.in");
//         int[] cnt1 = new int[1000005];
//         for(int x:list1)
//         {
//             cnt1[x]++;
//         }
//         for(int x:list2)
//         {
//             if(cnt1[x]>0)
//             {
//                 cnt1[x]++;
//             }
//         }
//         int cnt = 0;
//         for(int i = 1; i<1000005; i+=2)
//         {
//             if(cnt1[i]>0)
//             {
//                 if(check(i))
//                 {
//                     System.out.println(i + " " + cnt1[i]);
//                     cnt++;
//                 }
//             }
//             if(cnt==10)
//             {
//                 break;
//             }
//         }
//     }

//     public static boolean check(int n)
//     {
//         String s = String.valueOf(n);    
//         if(s.length()<=1 || s.length()%2==0)
//         {
//             return false;
//         }
//         int i = 0;
//         int j = s.length()-1;
//         while(i<j)
//         {
//             if(s.charAt(i)!=s.charAt(j))
//             {
//                 return false;
//             }
//             if(s.charAt(i)%2==0 || s.charAt(j)%2==0)
//             {
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         if(s.charAt(i)%2==0)
//         {
//             return false;
//         }
//         return true;
//     }

//     public static ArrayList<Integer> docfile(String file) throws IOException
//     {
//         ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
//         // ArrayList<Integer> tmp = new ArrayList<>();
//         try{
//             @SuppressWarnings("unchecked")
//             ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
//             in.close();
//             return list;
//         } catch (ClassNotFoundException ex)
//         {
//             ex.printStackTrace();
//         }
//         in.close();
//         return null;
//     }
// }   


import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.IOException;

public class J07032 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list1 = docfile("DATA1.in");
        ArrayList<Integer> list2 = docfile("DATA2.in");
        int[] cnt1 = new int[1000005];
        int[] cnt2 = new int[1000005];
        for(int x:list1)
        {
            cnt1[x]++;
        }
        for(int x:list2)
        {
            cnt2[x]++;
        }
        int cnt = 0;
        for(int i = 1; i<1000005; i+=2)
        {
            if(check(i))
            {
                if(cnt1[i]>0 && cnt2[i]>0)
                {
                    System.out.println(i + " " + (cnt1[i] + cnt2[i]));
                    cnt++;
                }
            }
            if(cnt==10)
            {
                break;
            }
        }

    }

    public static boolean check(int n)
    {
        String s = String.valueOf(n);    
        if(s.length()==1 || s.length()%2==0)
        {
            return false;
        }
        int i = 0;
        int j = s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            if(s.charAt(i)%2==0 || s.charAt(j)%2==0)
            {
                return false;
            }
            i++;
            j--;
        }
        if(s.charAt(i)%2==0)
        {
            return false;
        }
        return true;
    }

    public static ArrayList<Integer> docfile(String file) throws IOException
    {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        // ArrayList<Integer> tmp = new ArrayList<>();
        try{
            @SuppressWarnings("unchecked")
            ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
            in.close();
            return list;
        } catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        in.close();
        return null;
    }
}