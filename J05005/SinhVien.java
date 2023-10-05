package J05005;

public class SinhVien {
    private String maSV, name, dob, lop;
    private static int solg = 0;
    private double gpa;
    public SinhVien()
    {
        maSV = "";
        name = "";
        dob = "";
        lop = "";
        gpa = 0;
    }
    public SinhVien(String name, String lop, String dob, double gpa)
    {
        this.name = name;
        this.lop = lop;
        this.dob = dob;
        this.gpa = gpa;
        solg++;
    }
    private void setMaSV()
    {
        maSV = String.valueOf(solg);
        while(maSV.length()<3)
        {
            maSV = "0" + maSV;
        }
    }
    private void chuanHoa()
    {
        String[] s = name.trim().toLowerCase(null).replaceAll("\\s+", " ").split(" ");
        name = "";
        for(String x:s)
        {
            name += String.valueOf(x.charAt(0)).toUpperCase(null) + x.substring(1);
            name += " ";
        }
        name.trim();
    }
    public double getGPA()
    {
        return this.gpa;
    }
    public String toString()
    {
        setMaSV();
        chuanHoa();
        return maSV + " " + name + " " + lop + " " + dob + " " + gpa;
    }
}
