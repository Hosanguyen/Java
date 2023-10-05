package J07034;

public class MonHoc {
    private String ma, name;
    private int sotc;
    public MonHoc(String ma, String name, int sotc)
    {
        this.ma = ma;
        this.name = name;
        this.sotc = sotc;
    }
    public String getName()
    {
        return this.name;
    }
    @Override
    public String toString()
    {
        return ma + " " + name + " " + String.valueOf(sotc);
    }  
}
